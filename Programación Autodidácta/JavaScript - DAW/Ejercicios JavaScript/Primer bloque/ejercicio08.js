let year = parseFloat(prompt("Introduce un año:"));
let esBisiesto = false;

if ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) {
  esBisiesto = true;
}

if (esBisiesto) {
  console.log(`${year} es un año bisiesto`);
} else {
  console.log(`${year} NO es un año bisiesto`);
}
