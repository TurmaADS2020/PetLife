import { Router } from "express";
import {homeController} from "./controller/HomeController"
import {UserController} from "./controller/UserController";

const router: Router = Router()

//MAPPEAR ROTAS AQUI!!!
router.get("/teste",  homeController.Home)
router.get("/UserLogado",new UserController().ObtemCookieUser)
router.post("/cadastrarUser", new UserController().CadastrarUser)

export {router}
