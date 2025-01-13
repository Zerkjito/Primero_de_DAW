let n = prompt("Introduce un número:");
n = parseFloat(n);

while (isNaN(n) || n < 1 || n > 10000) {
  n = prompt("Introduce un número:");
  n = parseFloat(n);
}

let esPrimo = true;
for (let i = 2; i <= Math.sqrt(n); i++) {
  if (n % i == 0) {
    esPrimo = false;
    break;
  }
}

if (esPrimo && n > 1) {
 console.log(`${n} es primo`) 
} else {
  console.log(`${n} NO es primo`) 
}