function esPrimo(numero) {
  let esPrimo = true;
  if (numero <= 1) {
    esPrimo = false;
  } else {
    for (let i = 2; i < numero; i++) {
      if (numero % i === 0) {
        esPrimo = false;
        break;
      }
    }
  }
  return esPrimo;
}

function esCapicua(numero) {
  let invertido = 0;
  let aux = numero;
  
  while (aux !== 0) {
    let digito = aux % 10;
    invertido = invertido * 10 + digito;
    aux = Math.floor(aux / 10);
  }
  
  return invertido === numero;  
}

let numero = Number(prompt("Introduce el numero X (se comprobará desde 1 hasta X):"));
while (isNaN(numero)) {
  console.log("Entrada invalida, introduce un numero entero positivo");
  numero = Number(prompt("Introduce el numero X (se comprobará desde 1 hasta X):"));
}

let primos = [];
let capicuas = [];
let primosYcapicuas = [];
for (let i = 1; i <= numero; i++) {
  if (esPrimo(i)) {
    primos.push(i);
  }
  if (esCapicua(i)) {
    capicuas.push(i);
  }
  if (esCapicua(i) && esPrimo(i)) {
    primosYcapicuas.push(i);
  }
}
console.log("Primos:", primos);
console.log("Palíndromos:", capicuas);
console.log("Primos y Palíndromos:", primosYcapicuas);