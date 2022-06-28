import { Request, Response } from "express";
class HomeController {
    public Home(req: Request, res: Response): void {
        let pathPublic:string = __dirname.replace('src', 'Public').replace('controller','')
        res.sendFile(pathPublic.concat('/index.html'))
    }
    public PerfilUser(req: Request, res: Response): void{
        let pathPublic:string = __dirname.replace('src', 'Public').replace('controller','')
        res.sendFile(pathPublic.concat('/perfildousuario.html'))
    }

}

export const homeController = new HomeController();