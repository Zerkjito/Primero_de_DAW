function mostrarNumsIntroducidos(numeros) {
  console.log("Numeros introducidos: ", numeros.join(", "));
}


function mostrarPares (numeros) {
  let pares = [];
  for (let i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 === 0) {
      pares.push(numeros[i]);
    }
  }
  return pares;
}

function mostrarImpares (numeros) {
  let impares = [];
  for (let i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 !== 0) {
      impares.push(numeros[i]);
    }
  }
  return impares;
}

function pedirNumeros() {
  let numeros = [];
  let continuar = true;
  while (continuar) {
    let numero = prompt("Introduce un número o escribe un 0 para finalizar:")
    if (numero === null || numero === "0") {
      continuar = false;
    } else if (numero !== "" && !isNaN(numero)) {
      numeros.push(Number(numero));
    } else {
      alert("Por favor, inresa un número válido.")
    }
  }
  return numeros;
}

function ejecutarPrograma() {
  const numeros = pedirNumeros();

}