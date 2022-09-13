$(document).ready(function(){
    getUserInfo();
});

async function getUserInfo(){
    let user = {};
    user.email = localStorage.getItem("email");
    user.password = localStorage.getItem("password");

    const request_person = await fetch('../personas/info',{
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    })
    const person_data = await request_person.json();
    const request_contact = await fetch('../contactos/info',{
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    })
    const person_contact = await request_contact.json();

    document.getElementById('name').value = (person_data[0].names)
    document.getElementById('lastname').value = (person_data[0].lastnames)
    try {
        document.getElementById('city').value = (person_contact[0].city)
        document.getElementById('phone').value = (person_contact[0].phone)
        document.getElementById('address').value = (person_contact[0].address)
    } catch (error) {
        
    }  
    document.getElementById('email').value = (user.email)
    document.getElementById('password').value = (user.password)
}

async function updateInfo(){
    person_data[0].id;

    const request_update = await fetch('',{
        
    })
}