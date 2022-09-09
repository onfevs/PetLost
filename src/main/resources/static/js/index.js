async function registerUser(){
    let data_person = {};
    data_person.names = document.getElementById("name_input").value;
    data_person.lastnames = document.getElementById("lastname_input").value;
    
    const request_person = await fetch('../personas', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data_person)
    });

    const id_person = await request_person.json();

    
    let data_contact = {};
    data_contact.id_person = id_person;
    data_contact.city = document.getElementById("city_input").value;
    data_contact.phone = document.getElementById("phone_input").value;
    data_contact.address = document.getElementById("address_input").value;

    
    const request_contact = await fetch('../contacto', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data_contact)
    });


    let data_user = {};
    data_user.id_person = id_person;
    data_user.email = document.getElementById("email_input").value;
    data_user.password = document.getElementById("pass_input").value;
    let repeat_pass = document.getElementById("repeat_pass_input").value;

    if(data_user.password != repeat_pass){
        alert("La contraseña es diferenre");
        return;
    }
    
    const request_user = await fetch('../usuarios', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data_user)
    });
    
}