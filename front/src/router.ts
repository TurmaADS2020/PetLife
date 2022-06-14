import { Router } from "express";
import {homeController} from "./controller/HomeController"
import {AuthMiddleware} from './services/Middleware/AuthMiddleware';

const auth: AuthMiddleware = new AuthMiddleware();
const router: Router = Router()

//MAPPEAR ROTAS AQUI!!!
router.post("/", auth.Authentication, homeController.Home)

export {router}
