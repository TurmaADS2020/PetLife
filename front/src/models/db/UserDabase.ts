import {DataBabasePost} from './ConnectionPostgres'

class userdb extends DataBabasePost{
    constructor() {
        super();        
        this.db.connect();
    }

    public async teste(){
        let now = await this.db.query("select * from tb_cadastro_animal");
        return now;
    }
}

export const userDb = new userdb();