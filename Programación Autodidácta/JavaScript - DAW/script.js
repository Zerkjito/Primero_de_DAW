let num1 = parseFloat(prompt("Introduce el primer número: "));
let num2 = parseFloat(prompt("Introduce el segundo número: "));
let num3 = parseFloat(prompt("Introduce el tercer número: "));

if (num1 > 10 || num2 > 10 || num3 > 10) {
  console.log("Existe algún numero mayor que 10")
} else if (num1 <= 10 || num2 <= 10 || num3 <= 10) {
  confirm.log("“Ningún número es mayor que 10")
} else {
  console.log("Ningún número es mayor que 10")
}

let suma = num1 + num2 + num3;
console.log("Los numeros introducidos son " + num1 + ", " + num2 + ", " + num3);
console.log("La suma de los numeros introducidos es -> " + suma)