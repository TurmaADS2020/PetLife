

function limpa_formulário_cep() {
    //Limpa valores do formulário de cep.
    document.getElementById('rua').value = ("");
    document.getElementById('bairro').value = ("");
    document.getElementById('cidade').value = ("");
    document.getElementById('uf').value = ("");
}

function meu_callback(conteudo) {
    if (!("erro" in conteudo)) {
        //Atualiza os campos com os valores.
        document.getElementById('rua').value = (conteudo.logradouro);
        document.getElementById('bairro').value = (conteudo.bairro);
        document.getElementById('cidade').value = (conteudo.localidade);
        document.getElementById('uf').value = (conteudo.uf);
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
        if (validacep.test(cep)) {

            //Preenche os campos com "..." enquanto consulta webservice.
            document.getElementById('rua').value = "...";
            document.getElementById('bairro').value = "...";
            document.getElementById('cidade').value = "...";
            document.getElementById('uf').value = "...";

            //Cria um elemento javascript.
            var script = document.createElement('script');

            //Sincroniza com o callback.
            script.src = 'https://viacep.com.br/ws/' + cep + '/json/?callback=meu_callback';

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

async function gerarObjecto() {

    let timerInterval
    Swal.fire({
        title: 'Estamos processando a sua solicitação',
        html: 'Esta pagina sera fechado automaticamente!',
        timer: 2000,
        timerProgressBar: true,
        didOpen: () => {
            Swal.showLoading()
            const b = Swal.getHtmlContainer().querySelector('b')
            timerInterval = setInterval(() => {
                //b.textContent = Swal.getTimerLeft()
            }, 100)
        },
        willClose: () => {
            clearInterval(timerInterval)
            Swal.fire(
                'Cadastrado com sucesso!',
                'Agora você já pode ver os pets!',
                'success'
            )
        }
    }).then((result) => {
        /* Read more about handling dismissals below */
        if (result.dismiss === Swal.DismissReason.timer) {
            console.log('I was closed by the timer')
        }
    })

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
    // var complemento = document.getElementById("complemento").value;
    // var aceitatermos = document.getElementById("aceitatermos").value;
    var senhausuario = document.getElementById("senhausuario").value;
    let novocliente = {
        "ativo": 1,
        "cpf": cpf_cnpj,
        "dataCadastro": '2022-06-22',
        "nome": nomecliente,
        "email": email,
        "senha": senhausuario,
        "telefone": telefone,
        "rua": rua,
        "bairro": bairro,
        "cidade": cidade,
        "cep": cep,
        "uf": "MT",
        "referencia": referencia
    }
    console.log(novocliente);

    await fetch('http://c52d-191-210-249-71.ngrok.io/cadastrarUser', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(novocliente)
    });
}

async function gerarObjectologin() {

    var campologin = document.getElementById("login_emailusuario").value;
    var camposenha = document.getElementById("login_senhausuario").value;

    let realizarlogin = {
        "email": campologin,
        "senha": camposenha

    }

    let result = await fetch('http://localhost/Login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },

        body: JSON.stringify(realizarlogin)
    });

    if (result.status == 500)
        return Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: result.statusText,
        });

    if (result.status == 400)
        return Swal.fire({
            icon: 'error',
            title: 'Oops...',
            text: "Login ou Senha Invalido!!",
        })

    window.close();
}




// fetch("https://swapi.dev/api/planets/?page=2")
// .then((response) => response.json())
// .then((retornonomeanimal)=>{
//     const dadosanimais = [1,2,3,4];
//     dadosanimais.forEach((dadosanimais)=>{
//         document.getElementById("nomedopet"+dadosanimais).innerHTML = retornonomeanimal.results.dadosanimais;
//         console.log(retornonomeanimal.results.dadosanimais);
//     })
// })            

window.addEventListener('load', () => {
    fetch("https://jsonplaceholder.typicode.com/users")
        .then((response) => response.json())
        .then((dados) => {
            const numbers = [1, 2, 3];
            numbers.forEach((numbers) => {
                document.getElementById("nomeong" + numbers).innerHTML = numbers + " - " + dados[numbers].name;
                document.getElementById("comentariosong" + numbers).innerHTML = dados[numbers].email;
            })
        })
})