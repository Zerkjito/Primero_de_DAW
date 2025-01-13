function sumar (a, b) {
  return a + b;
}

function restar (a, b) {
  return a - b;
}

function multiplicar (a, b) {
  return a * b;
}

function dividir (a, b) {
  if (b === 0) {
    console.log("Error. No se puede dividir entre cero")
  }
  return a / b;
}

let operacion = prompt("Introduce la operación deseada(sumar, restar, multiplicar, dividir)")
let resultado;

let num1 = parseFloat(prompt("Introduce el primer número:"));
let num2 = parseFloat(prompt("Introduce el segundo número:"));

if (operacion === "sumar" ) {
  resultado = sumar(num1, num2);
} else if (operacion === "restar") {
  resultado = restar(num1, num2);
} else if (operacion === "multiplicar") {
  resultado = multiplicar(num1, num2);
} else if (operacion === "dividir") {
  resultado = dividir(num1, num2);
}

console.log(resultado);


