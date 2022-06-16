import { Request, response, Response } from "express";
import { ApiResponseObject } from "../models/ApiResponseObject";
import axios, { AxiosError, AxiosRequestConfig, AxiosResponse } from 'axios';
import { config } from "../config";
import { Complemento } from "./Complemento";

class UserController {

    public async CadastrarUser(req: Request, res: Response): Promise<Response> {
        try {

            let configRequest: AxiosRequestConfig = { timeout: 30000, timeoutErrorMessage: "Timeout Api" };
            let uri: string = config.getVarivel.URI_API as string;

            let response: AxiosResponse = await axios.post(`${uri}/usuario`, req.body, configRequest);
            let responseApi: ApiResponseObject = new ApiResponseObject("Usuario Cadastrado!!", response.status, response.data);

            console.log(response.data.id);
            let infoUser = await Complemento.ObtemInfoUsuario(response.data.id);
            Complemento.SaveCookieUser(res,infoUser.data as object);

            res.statusCode = 200;
            return res.json(responseApi).send();

        } catch (e) {

            let errorApi: AxiosError = (e as AxiosError);
            res.statusCode = errorApi.response?.status as number;
            return res.json({ error: errorApi.response?.data }).send();
        }
    }

    public ObtemCookieUser(req: Request, res: Response) : Response{
        var cookieUser = Complemento.ObtemCookieUser(req);
        return res.send(cookieUser);
    }
}

export { UserController }