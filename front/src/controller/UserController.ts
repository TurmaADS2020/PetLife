import { Request, Response } from "express";
import { ApiResponseObject, UserList, User } from '../models/apiResponseObject';
import axios, { AxiosError, AxiosRequestConfig, AxiosResponse } from 'axios';
import { config } from "../config";
import { Complemento } from "../provider/Complemento";

class UserController {

    public async CadastrarUser(req: Request, res: Response): Promise<Response> {
        try {

            let configRequest: AxiosRequestConfig = { timeout: 30000, timeoutErrorMessage: "Timeout Api" };
            let uri: string = config.getVarivel.URI_API as string;

            let response: AxiosResponse = await axios.post(`${uri}/usuario`, req.body, configRequest);
            let responseApi: ApiResponseObject = new ApiResponseObject("Usuario Cadastrado!!", response.status, response.data);

            console.log(response.data.id);
            let infoUser = await Complemento.ObtemInfoUsuario(response.data.id);
            Complemento.SaveCookieUser(res, infoUser.data as object);

            res.statusCode = 200;
            return res.json(responseApi).send();

        } catch (e) {
            let errorApi: AxiosError = (e as AxiosError);

            res.statusCode = errorApi.response?.status as number;
            return res.json({ error: errorApi.response?.data }).send();
        }
    }

    public async LogarUser(req: Request, res: Response): Promise<Response> {

        try {
            let email:string = req.body['email'];
            let pass:string = req.body['senha'];

            if(email == null || pass  == null)
                return res.status(400).send({mensagem:"Por favor, informar email e senha"})
            
            let listUser:UserList = await (await Complemento.ObtemUsers()).data as UserList;
            let user = listUser.find(x => x.email == email && x.senha == pass);
            
            if(user == null)
                return res.status(400).send({mensagem:"Usuario não encontrado!!"})
            
            Complemento.SaveCookieUser(res,user);
            return res.send(user);

        } catch (error) {

            return res.status(500).send({error:error}).json();
        }
    }

    public ObtemCookieUser(req: Request, res: Response): Response {
        var cookieUser = Complemento.ObtemCookieUser(req);
        return res.send(cookieUser);
    }
}

export { UserController }