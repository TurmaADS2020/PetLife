export class ApiResponseObject{
    public mensagem:string;
    public statusCode:number;
    public data?:object;

    constructor(mensagem:string, status:number,data?:object){
        this.mensagem = mensagem;
        this.statusCode = status;
        this.data = data;

    }
}