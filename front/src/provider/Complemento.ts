import { Request, Response } from "express";
import { config } from "../config";
import jwt from 'jsonwebtoken';
import axios, { AxiosRequestConfig, AxiosResponse } from "axios";
import { ApiResponseObject, UserList } from "../models/apiResponseObject";

export class Complemento {
    public static SaveCookieUser(res: Response, token: object, nameCookie: string = "UserToken") {
        let tokenAuth: string = config.getVarivel.SECREAT_AUTH_TOKEN as string;
        let cookieJwt: string = jwt.sign(token, tokenAuth);

        res.cookie(nameCookie, cookieJwt);
    }

    public static ObtemCookieUser(req: Request, nameCookie: string = "UserToken"): object {
        let token: string = req.cookies[nameCookie];
        var a = jwt.decode(token);

        return {a};
    }
    
    public static async ObtemUsers(): Promise<ApiResponseObject>{
        let configRequest: AxiosRequestConfig = { timeout: 30000, timeoutErrorMessage: "Timeout Api" };
        let uri: string = config.getVarivel.URI_API as string;

        let response: AxiosResponse = await axios.get<UserList>(`${uri}/usuario`, configRequest);
        let responseApi: ApiResponseObject = new ApiResponseObject("Usuario Cadastrado!!", response.status, response.data);

        return responseApi;
    }


    public static async ObtemInfoUsuario(idUser: number): Promise<ApiResponseObject> {
        let configRequest: AxiosRequestConfig = { timeout: 30000, timeoutErrorMessage: "Timeout Api" };
        let uri: string = config.getVarivel.URI_API as string;

        let response: AxiosResponse = await axios.get(`${uri}/usuario/${idUser}`, configRequest);
        let responseApi: ApiResponseObject = new ApiResponseObject("Usuario Cadastrado!!", response.status, response.data);

        return responseApi;
    }
}