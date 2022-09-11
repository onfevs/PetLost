async function login(){
    let data_person = {};
    data_person.email = document.getElementById("email").value;
    data_person.password = document.getElementById("pass").value;

    console.log(data_person)
    
    const request_person = await fetch('/login', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data_person)
    });

    const answer = await request_person.json();

    console.log("Answer: "+ answer)

    if(answer == true){
        window.location.href = "./html/home.html";
    }else{
        alert("El usuario no existe")
    }
}