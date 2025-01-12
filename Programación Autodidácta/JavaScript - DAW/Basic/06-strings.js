let myName = "Erick";
let greeting = "Hola, " + myName + "!"; 
console.log(greeting);
console.log(typeof greeting);

//Longitud
console.log(greeting.length);

//Acceso a caracteres
console.log(greeting[0]);

//Métodos comúnes
console.log(greeting.toUpperCase());
console.log(greeting.toLocaleLowerCase());
console.log(greeting.indexOf("Erick"));
console.log(greeting.includes("Erick"));
console.log(greeting.slice(0, 10));
console.log(greeting.replace("Erick", "Eduardo"));

//Template literals (plantillas literales)
let message = `Hola, este es mi
  curso
  de
  JavaScript`;

 
  
console.log(message);

let email = "colchonero1223342@gmail.com";
console.log(`Hola, ${myName}! Tu email es ${email}`);

