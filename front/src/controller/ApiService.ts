import { Response } from 'express';
import jwt from 'jsonwebtoken';

export interface ParameterApi{
    res:Response,
    mensagem:string,
    status:number,
    data?:object
}


export abstract class ApiService{

    protected FailRequest(param:ParameterApi) : Response{
        let apiResponse = new ApiResponseObject(param.mensagem,param.status,param.data);
        return param.res.status(param.status as number).json(apiResponse);        
    }

    protected SucessRequest(res:Response,mensagem:string="Sucess", status:number=200, data?:object) : Response {
        let apiResponse = new ApiResponseObject(mensagem,status,data);
        return res.status(status).json(apiResponse);
    }    
    
    protected GenerateToken(token:any,): string{
        let tokenJwt:string = process.env["SECREAT_AUTH_TOKEN"] as string;
        return jwt.sign(token,tokenJwt);
    }

    protected GetInfoToken(token:string) : object{
        let tokenJwt:string = process.env["SECREAT_AUTH_TOKEN"] as string;
        return jwt.decode(token,{complete:true, json:true}) as object;
    }
 }

export class ApiResponseObject{
    public mensagem:string;
    public statusCode:number;
    public data?:object;

    constructor(mensagem:string, status:number,data?:object){
        this.mensagem = mensagem;
        this.statusCode = status;
        this.data = data;

    }
}