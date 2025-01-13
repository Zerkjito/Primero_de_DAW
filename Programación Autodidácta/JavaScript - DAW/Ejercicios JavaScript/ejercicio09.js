let credito = 20;
do {
  let guess = parseFloat(prompt("Decide un numero del 1 al 6:"));
  let bet = parseFloat(prompt("Introduce la cantidad a apostar:"));

  while (isNaN(guess) || guess > 6 || guess < 1 || isNaN(bet) || bet > credito) {
    guess = parseFloat(prompt("Decide un numero del 1 al 6:"))
    bet = parseFloat(prompt("Introduce la cantidad a apostar:"));
  }

  let tirada = Math.floor (Math.random() * 6) + 1;

  if (tirada === guess) {
    credito = credito + (bet * 2);
  } else {
    credito-=bet;
  }
  
} while (credito > 0 && credito < 150);
if (credito >= 150) {
  console.log("Felicidades, has ganado!")
} else {
  console.log("Has perdido!")
}


