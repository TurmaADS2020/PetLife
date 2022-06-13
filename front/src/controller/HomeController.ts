import {Request, Response} from "express";
import { ApiService} from "./ApiService";

class HomeController extends ApiService{
    pathPublic: string;

    constructor() {
        super();
        this.pathPublic = __dirname.replace('src', 'Public')
    }

    public Home(req: Request, res:Response) : Response{
        
        res.sendFile(this.pathPublic.concat('/index.html'));        
    
        return res;
    }

}

export const homeController = new HomeController();