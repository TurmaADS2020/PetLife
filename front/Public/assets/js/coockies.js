if (GetInfoUser() == null) {
    window.addEventListener("load", () => {
        Swal.fire({
            title: 'Coockies ',
            html: 'Nós usamos cookies e outras tecnologias semelhantes para melhorar a sua experiência em nossa plataforma. Ao utilizar o PetLife, você declara estar de acordo com nossa <a href="#">Política de Uso de Cookies</a>',
            showClass: {
                popup: 'animate__animated animate__fadeInDown'
            },
            hideClass: {
                popup: 'animate__animated animate__fadeOutUp'
            }
        })
    })
}


function GetInfoUser(){

    let response = fetch("http://localhost/userlogado")
    .then((response)=>response.json())
    .then((data) => {return data})

    if(response.a == null || response.a == undefined)
        return null
        
    return a;
}