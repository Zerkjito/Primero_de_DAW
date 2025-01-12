// 1. Concatena dos cadenas de texto
let cadena1 = "Soy la cadena 1";
let cadena2 = "Soy la cadena 2";
console.log(cadena1 + cadena2);
console.log(`${cadena1} y yo ${cadena2}`);

// 2. Muestra la longitud de una cadena de texto
console.log(cadena1.length);

// 3. Muestra el primer y último carácter de un string
console.log(cadena1[0], cadena1[1]);

// 4. Convierte a mayúsculas y minúsculas un string
console.log(cadena1.toUpperCase());
console.log(cadena1.toLocaleLowerCase());

// 5. Crea una cadena de texto en varias líneas
console.log(`Hola esto
  es una cadena
  de texto
  en varias
  lineas`);

// 6. Interpola el valor de una variable en un string
let email = "colcwad2231@gmail.com";
console.log(`Esto es un valor interpolado -> Mi correo es ${email}`)

// 7. Reemplaza todos los espacios en blanco de un string por guiones
console.log(cadena1.replace(/ /g, "-"));

// 8. Comprueba si una cadena de texto contiene una palabra concreta
console.log(cadena1.includes("Soy"));

// 9. Comprueba si dos strings son iguales
console.log(cadena1 == cadena2);

// 10. Comprueba si dos strings tienen la misma longitud
console.log(cadena1.length == cadena2.length);