import { Router } from "express";
import {homeController} from "./controller/HomeController"
import {UserController} from "./controller/UserController";

const router: Router = Router()

//MAPPEAR ROTAS AQUI!!!
router.get("/",  homeController.Home)
router.get("/PerfilUsuario", homeController.PerfilUser)
router.get("/UserLogado",new UserController().ObtemCookieUser)

router.post("/cadastrarUser", new UserController().CadastrarUser)
router.post("/Login", new UserController().LogarUser);

export {router}
