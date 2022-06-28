fetch("http://c52d-191-210-249-71.ngrok.io/userlogado")
.then((response)=>response.json())
.then((data) => console.log(data.id))