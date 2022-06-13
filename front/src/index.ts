import {Server} from "./server"
import {config} from "./config"


class Services{
    private port = config.getVarivel.PORT;

    public StartServer()    {    
        try {                        
            new Server().server.listen(this.port);    
            
            console.log("Servidor Rodando na porta:",this.port);
        } catch (error) {
            console.log("Error em iniciar o servidor");
        }
    }
}

new Services().StartServer();