import { Request, Response } from "express";
class HomeController {
    public Home(req: Request, res: Response): Response {
        //res.sendFile(this.pathPublic.concat('/index.html'))
        console.log(req.cookies.UserToken);
        return res.send('');
    }

}

export const homeController = new HomeController();