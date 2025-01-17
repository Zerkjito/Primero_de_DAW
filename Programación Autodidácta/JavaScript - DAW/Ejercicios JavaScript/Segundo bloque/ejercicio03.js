var cadenas = [
  "Buenos días",
  "hola",
  "estoy en clase de entornos de desarrollo",
  "UD3",
  "ejercicios de javascript",
  "objetos predefinidos y funciones",
  "y me estoy muriendo",
  "de p*to aburrimiento",
  "hasta siempre"
];

var indice = 0;

function muestraCadenas() {
  if (indice < cadenas.length) {
    console.log(cadenas[indice]);
    indice++;
  } else {
    clearInterval(intervalo);
  }
}

var intervalo = setInterval(muestraCadenas, 2000);