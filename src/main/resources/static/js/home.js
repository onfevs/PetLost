//Apenas se cargue la pagina, ejecute la función showpets
$(document).ready(function(){
    showPets();
});

async function showPets(){
    //Hacer petición tipo GET al back para recibir todas las mascotas de la base de datos
    const request_person = await fetch('/mascota', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });

    //Almacenar el resultado de la petición GET en la constante pets en formato JSON.
    //El back regresa una lista por lo que se almacenan listas de mascotas en formato JSON
    const pets = await request_person.json();
    
    //Obtener el elemento contenedor de cards del html
    const container = document.getElementById("cards-ads")
    
    //Como pets es una lista de mascotas, va recorrer todos los elementos. Cada elemento es un mascota de la BD
    pets.forEach(element => {
        //Por cada elemento de la lista crea una nueva card y se agrega al HTML
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

