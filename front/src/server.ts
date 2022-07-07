import express from "express";
import { router } from "./router";
import bodyParser from 'body-parser'

const cookieParser = require("cookie-parser");

/// Todas as config de servidor ficaram aqui dentro!!
class  Server{
    public server: express.Application;
    
    constructor(){
        this.server = express();                
        this.middleware();
        this.router();        
    }    

    private middleware(){        
        
       
        this.server.use(express.static("Public"))        
        this.server.use(bodyParser.urlencoded({ extended: true }));
        this.server.use(express.json())
        this.server.use(cookieParser());    
        
    }

    private router(){
        this.server.use(router)
    }    
}

export {Server}