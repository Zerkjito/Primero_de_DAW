function mostrarNumsIntroducidos(numeros) {
  console.log("Numeros introducidos: ", numeros.join(", "));
}

function calcularSuma(numeros) {
  let resultadoSuma = 0;
  for (let i = 0; i < numeros.length; i++) {
    resultadoSuma += numeros[i];
  }
  return resultadoSuma;
}

function calcularMedia(numeros, resultadoSuma) {
  let media = resultadoSuma / numeros.length;
  return media;
}

function calcularMayor(numeros) {
  let mayor = numeros[0];
  for (let i = 1; i < numeros.length; i++) {
    if (numeros[i] > mayor) {
      mayor = numeros[i];
    }
  }
  return mayor;
}

function calcularMenor(numeros) {
  let menor = numeros[0];
  for (let i = 1; i < numeros.length; i++) {
    if (numeros[i] < menor) {
      menor = numeros[i];
    }
  }
  return menor;
}

function calcularPares(numeros) {
  let contadorPares = 0;
  for (let i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 === 0) {
      contadorPares++;
    }
  }
  return contadorPares;
}

function calcularImpares(numeros) {
  let contadorImpares = 0;
  for (let i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 !== 0) {
      contadorImpares++;
    }
  }
  return contadorImpares;
}

function pedirNumeros() {
  let numeros = [];
  let continuar = true;
  while (continuar) {
    let numero = Number(prompt("Introduce un número positivo o escribe < 1 para finalizar:"));
    if (isNaN(numero) || numero < 1) {
      continuar = false;
    } else {
      numeros.push(numero);
    }
  }
  return numeros;
}

function ejecutarPrograma() {
  const numeros = pedirNumeros();

  if (numeros.length === 0) {
    console.log("No se introdujeron numeros validos");
    return;
  }

  mostrarNumsIntroducidos(numeros);
  let resultadoSuma = calcularSuma(numeros);
  console.log("Numeros pares:", calcularPares(numeros));
  console.log("Numeros impares:", calcularImpares(numeros));
  console.log("Suma total:", resultadoSuma);
  console.log("Media:", calcularMedia(numeros, resultadoSuma));
  console.log("Mayor:", calcularMayor(numeros));
  console.log("Menor:", calcularMenor(numeros));
}

ejecutarPrograma();