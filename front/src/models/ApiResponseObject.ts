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

export type UserList = User[]

export interface User {
  id: number
  endereco: Endereco
  arquivo: Arquivo
  ativo: number
  cpf: string
  dataCadastro: string
  nome: string
  email: string
  senha: string
  telefone: number
}

export interface Endereco {
  idEndereco: number
  logradouro: string
  nome: string
  numero: number
  bairro: string
  cidade: string
  uf: string
  cep: string
  referencia: string
}

export interface Arquivo {
  id: number
  nome: string
}
