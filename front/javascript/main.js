
function escondercoockies(){
    var botaoCoockies = document.getElementById("coockiesbotao");
    var divCoockies = document.querySelector(".coockies");
    botaoCoockies.addEventListener("click", ()=>{
        divCoockies.classList.add("coockieshidden");
    });
}

var envia = document.getElementById("enviacodigo");

function alterdados(e){
    var enviacodigo = document.getElementById("enviacodigo");
    var digitacodigo = document.getElementById("digitacodigo");
    var validacodigo = document.getElementById("validacodigo");
    var etapa = document.querySelector("validador");
    var etapa1 = document.querySelector("validador1");
    var etapa2 = document.querySelector("validador2");

    enviacodigo.addEventListener("click", ()=>{
        etapa.classList.add("esconder");
        etapa1.classList.remove(".esconder");
    })

    digitacodigo.addEventListener("click", ()=>{
        etapa1.classList.add("esconder");
        etapa2.classList.remove(".esconder");
    })
}