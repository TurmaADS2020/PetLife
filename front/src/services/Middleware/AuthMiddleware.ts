import { Request, Response,NextFunction } from "express";
import { ApiService } from "../../controller/ApiService";

export class AuthMiddleware extends ApiService{
    public Authentication(req:Request,res:Response, next:NextFunction){
        console.log(req.body);

        next();
    }
}