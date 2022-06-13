class GerarInfos{
    private user:UserInfo[];

    constructor(){
        this.user = this.GerarUsers();
    }        

    public ValidaUser(nome:string, password:string) : UserInfo | undefined{        
        
        return this.user.find(x=> x.senha == password && x.user == nome);        
    }

    public CreateUser(user:UserInfo){
        let index:number = this.user.length + 1;
        this.user[index] = user;
    }

    private GerarUsers(): UserInfo[]{

        let user1:UserInfo = new UserInfo("andre.meira","123");
        let user2:UserInfo = new UserInfo("joao.feliz", "teste13")
        let user3:UserInfo = new UserInfo("matheus.marcos", "marcos123")
        let user4:UserInfo = new UserInfo("pedro.joao", "joao12")
        let user5:UserInfo = new UserInfo("fernando.amaral", "luiz3")

        let users: Array<UserInfo> = [user1,user2,user3, user4, user5];
        this.user = users;
        return users;
    }
}

export class UserInfo{
    public user:string;
    public senha:string;    
    
    constructor(user:string, senha:string){
        this.user = user;
        this.senha = senha;
    }
}

export class DataBabase 
{
    private users:GerarInfos;

    constructor(){        
        this.users = new GerarInfos();        
    }

    public CreateUser(user:UserInfo) {
        return this.users.CreateUser(user);
    }

    public ValidaUser(nome:string, password:string) : UserInfo | undefined{        
        
        return this.users.ValidaUser(nome,password);
    }
}