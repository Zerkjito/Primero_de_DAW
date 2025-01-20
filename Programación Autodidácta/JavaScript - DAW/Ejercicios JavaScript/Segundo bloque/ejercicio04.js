function calcular(numeros, operaciones) {
  const resultados = {};

  operaciones.forEach(operacion => {
    resultados[operacion.nombre] = operacion.funcion(numeros);
  });

  return resultados;
}

function calcularSuma(numeros) {
  return numeros.reduce((acc, num) => acc + num, 0);
}

function calcularMedia(numeros) {
  const suma = calcularSuma(numeros);
  return suma / numeros.length;
}

function calcularMayor(numeros) {
  return Math.max(...numeros);
}

function calcularMenor(numeros) {
  return Math.min(...numeros);
}

function pedirNumeros() {
  let numeros = [];
  let continuar = true;

  while (continuar) {
    let numero = prompt("Introduce un número (o escribe 0 para finalizar):");

    if (numero === null || numero === "0") {
      continuar = false;
    } else if (numero !== "" && !isNaN(numero)) {
      numeros.push(Number(numero));
    } else {
      alert("Por favor, ingresa un número válido.");
    }
  }
  return numeros;
}

function ejecutarCalculos() {
  const numeros = pedirNumeros();
  if (numeros.length === 0) {
    alert("No se introdujeron números.");
    return;
  }

  const operaciones = [
    { nombre: 'Mayor', funcion: calcularMayor },
    { nombre: 'Menor', funcion: calcularMenor },
    { nombre: 'Suma', funcion: calcularSuma },
    { nombre: 'Media', funcion: calcularMedia }
  ];

  const resultados = calcular(numeros, operaciones);

  alert(`Resultados:
    Mayor: ${resultados.Mayor}
    Menor: ${resultados.Menor}
    Suma: ${resultados.Suma}
    Media: ${resultados.Media}`);
}

ejecutarCalculos();
