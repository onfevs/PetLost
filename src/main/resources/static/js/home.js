$(document).ready(function(){
    showPets();
});

async function showPets(){
    const request_person = await fetch('/mascota', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });

    const pets = await request_person.json();
    console.log(pets)
    const container = document.getElementById("cards-ads")
    
    console.log(container)
    pets.forEach(element => {
        container.innerHTML += `
        <article class="card-pet">
            <div class="image">
            <img src="../assets/img/pet1.jpeg" width="200px" height="150px" alt="pet" />
            </div>
            <div class="card-body">
            <h3>${element.name}</h3>
            <p>${element.placeLost}
            </p>
            </div>
            <button>
            <a href="./ad_description.html">Ver anuncio</a>
            </button>
        </article>
        `
    });
}

