$(document).ready(function () {
    cargarAlumno();
});

async function cargarAlumno() {
    const request = await fetch('/listarAlumno', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const alumnos = await request.json();

    let alumnoArray = '';
    for (let alumno of alumnos) {
        let HTML = '<tr>' +
            '<td>' + alumno.id_alumno + '</td>' +
            '<td>' + alumno.nombre + '</td>' +
            '<td>' + alumno.nota + '</td>' +
            '<td>' + alumno.periodo + '</td>' +
            '<td><input value="Eliminar" type="button" onclick="eliminar(${alumno.id_alumno})"></td>'+
            '<td><a href="edit.html">Editar</a></td>' + '</tr>'

        alumnoArray = alumnoArray + HTML;
    }
    document.querySelector('#alumno tbody').outerHTML = alumnoArray;
}

async function eliminar(id){
    const request = await fetch('/eliminarAlumno/'+ id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    location.reload();
}