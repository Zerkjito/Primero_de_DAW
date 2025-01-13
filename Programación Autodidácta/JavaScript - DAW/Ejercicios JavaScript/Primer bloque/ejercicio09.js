let credito = 20;
let guess, bet;
do {
  alert(`Saldo disponible -> ${credito}`);
  guess = parseFloat(prompt("Decide un numero del 1 al 6:"));
  bet = parseFloat(prompt("Introduce la cantidad a apostar:"));


  while (isNaN(guess) || guess > 6 || guess < 1 || isNaN(bet) || bet > credito) {
    if (isNaN(guess) || guess > 6 || guess < 1) {
      alert("Por favor, introduce un número válido entre 1 y 6")
    }
    if (isNaN(bet) || bet > credito || bet <= 0) {
      alert("Por favor, introduce una apuesta válida")
    }
    guess = parseFloat(prompt("Decide un numero del 1 al 6:"))
    bet = parseFloat(prompt("Introduce la cantidad a apostar:"));
  }

  let tirada = Math.floor(Math.random() * 6) + 1;
  alert(`La tirada del dado fue ${tirada}`)

  if (tirada === guess) {
    alert(`Felicidades, has acertado! El número era ${tirada}`)
    credito = credito + (bet * 2);
  } else {
    credito -= bet;
    alert(`No has acertado! El número era ${tirada}`);
  }

} while (credito > 0 && credito < 150);
if (credito >= 150) {
  console.log("Felicidades, has ganado!");
} else {
  console.log("Has perdido!");
}


