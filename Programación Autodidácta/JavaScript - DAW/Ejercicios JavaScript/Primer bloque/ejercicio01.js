let num1 = prompt("Introduce el primer numero:");
let num2 = prompt("Introduce el primer numero:");
let num3 = prompt("Introduce el primer numero:");

num1 = parseFloat(num1);
num2 = parseFloat(num2);
num3 = parseFloat(num3);

if (num1 > 10 || num2 > 10 || num3 > 10) {
  console.log("Número mayor que 10");
} else {
  console.log("Ningún número es mayor que 10");
}

console.log(`Valores introducidos -> ${num1}, ${num2}, ${num3}`);
console.log("Su suma total es -> " + (num1 + num2 + num3));

