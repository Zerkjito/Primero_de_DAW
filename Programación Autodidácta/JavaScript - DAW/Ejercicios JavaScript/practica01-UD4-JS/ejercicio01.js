function encontrarPatron(cadena, patron) {
  cadena = cadena.toLowerCase();
  patron = patron.toLowerCase();

  let contador = 0;
  let posicion = cadena.indexOf(patron);

  while (posicion !== -1) {
    contador++;
    posicion = cadena.indexOf(patron, posicion + 1);
  }
  return contador;
}

function totalPatrones(cadena, arrayPatrones) {
  let total = 0;
  for (let i = 0; i < arrayPatrones.length; i++) {
    total+= encontrarPatron(cadena, arrayPatrones[i]);
  }
  return total;
}

let cadena = prompt("Introduce cadena de texto a verificar:");

if (cadena) {
 var patrones = ["AA", "BCA", "RBT", "JT"];
 let total = totalPatrones(cadena, patrones);

 alert(
  `Cadena introducida: ${cadena}\n` +
  `Patrones a buscar: ${patrones.join(",")}\n` +
  `Aparecen: ${total} veces`
 );
} else {
  alert("No se ha ingresado ninguna cadena válida.")
}
