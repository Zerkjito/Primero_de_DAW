let n = prompt("Introduce un número:");

n = parseFloat(n);

while(isNaN(n) || n < 2) {
  n = prompt("Introduce un número válido:");
  n = parseFloat(n);
}

for (let i = 2; i <= n; i++) {
  if (i % 2 == 0) {
    console.log(i);
  }
}