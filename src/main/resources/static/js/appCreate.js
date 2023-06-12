
async function añadir(){
    let datos = {};
    datos.nombre = document.getElementById("nombre").value;
    datos.nota = document.getElementById("nota").value;
    datos.periodo = document.getElementById("periodo").value;

    const request = await fetch('/añadirAlumno', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    location.replace("admin.html")
}