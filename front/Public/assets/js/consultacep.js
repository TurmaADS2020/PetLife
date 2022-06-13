function limpa_formulário_cep() {
    //Limpa valores do formulário de cep.
    document.getElementById('rua').value=("");
    document.getElementById('bairro').value=("");
    document.getElementById('cidade').value=("");
    document.getElementById('uf').value=("");
}

function meu_callback(conteudo) {
if (!("erro" in conteudo)) {
    //Atualiza os campos com os valores.
    document.getElementById('rua').value=(conteudo.logradouro);
    document.getElementById('bairro').value=(conteudo.bairro);
    document.getElementById('cidade').value=(conteudo.localidade);
    document.getElementById('uf').value=(conteudo.uf);
} //end if.
else {
    //CEP não Encontrado.
    limpa_formulário_cep();
    alert("CEP não encontrado.");
}
}

function pesquisacep(valor) {

//Nova variável "cep" somente com dígitos.
var cep = valor.replace(/\D/g, '');

//Verifica se campo cep possui valor informado.
if (cep != "") {

    //Expressão regular para validar o CEP.
    var validacep = /^[0-9]{8}$/;

    //Valida o formato do CEP.
    if(validacep.test(cep)) {

        //Preenche os campos com "..." enquanto consulta webservice.
        document.getElementById('rua').value="...";
        document.getElementById('bairro').value="...";
        document.getElementById('cidade').value="...";
        document.getElementById('uf').value="...";

        //Cria um elemento javascript.
        var script = document.createElement('script');

        //Sincroniza com o callback.
        script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';

        //Insere script no documento e carrega o conteúdo.
        document.body.appendChild(script);

    } //end if.
    else {
        //cep é inválido.
        limpa_formulário_cep();
        alert("Formato de CEP inválido.");
    }
} //end if.
    else {
        //cep sem valor, limpa formulário.
        limpa_formulário_cep();
    }
};

function gerarObjecto(){

    var btn = document.getElementById("registrar");

    btn.addEventListener("click", ()=>{
        var cep = document.getElementById("cep").value;
        var rua = document.getElementById("rua").value;
        var numeroimovel = document.getElementById("num_imovel").value;
        var bairro = document.getElementById("bairro").value;
        var cidade = document.getElementById("cidade").value;
        var uf = document.getElementById("uf").value;
        var referencia = document.getElementById("referenciaimovel").value;
        var cpf_cnpj = document.getElementById("cpf_cnpj").value;
        var nomecliente = document.getElementById("nomeusuario").value;
        var email = document.getElementById("emailusuario").value;
        var telefone = document.getElementById("telefone").value;
        var complemento = document.getElementById("complemento").value;
        var aceitatermos = document.getElementById("aceitatermos").value;
        
        let novocliente = {     
            "endereco": {
            "idEndereco": 1,
            "logradouro": rua,
            "nome": rua,
            "numero": numeroimovel,
            "bairro": bairro,
            "cidade": cidade,
            "complemento": complemento,
            "uf": uf,
            "cep": cep,
            "referencia": referencia
        },
        "ativo": 1,
        "cpf": cpf_cnpj,
        "dataCadastro": "2018-05-22",
        "nome": nomecliente,
        "email": email,
        "senha": "123Teste", 
        "telefone": telefone,
        "validador": aceitatermos
        }
        console.log(novocliente);

    })
    
}


