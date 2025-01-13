let input = prompt("Introduce dos valores separados por espacio:");
let values = input.split(" ");

let x = parseFloat(values[0]);
let y = parseFloat(values[1]);

while (isNaN(x) || isNaN(y) || x < -50 || x > 50 || y < 1 || y > 20) {
   input = prompt("Introduce el valor X:");
   values = input.split(" ");
   x = parseFloat(values[0]);
   y = parseFloat(values[1]);
}

console.log("Tabla de multiplicar del " + x);

for (let i = 1; i <= y; i++) {
  console.log(`${x} * ${i} = ${x * i}`);
}

