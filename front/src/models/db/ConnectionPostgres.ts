import { Pool } from 'pg';

class Credentials{
    user:string = process.env.userdb as string;
    host:string = process.env.hostdb as string;
    database:string = process.env.basedb as string;
    password:string = process.env.passdb as string;
    port:number  = 5432
}


abstract class DataBabasePost{
    private credentials:Credentials;
    protected db:Pool;

    constructor(){
        this.credentials = new Credentials();        
        this.db = this.Connection();
    }
    
    private Connection():Pool{
        return new Pool(this.credentials);
    }
}

export class userdb extends DataBabasePost{
    constructor() {
        super();        
        this.db.connect();
    }

    public async teste(){
        let now = await this.db.query("select * from tb_cadastro_animal");
        return now;
    }
}