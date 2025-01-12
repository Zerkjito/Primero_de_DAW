// 1. Escribe un comentario en una línea
//Hola

// 2. Escribe un comentario en varias líneas
/*Esto es
un comentario
de varias lineas
*/

// 3. Declara variables con valores asociados a todos los datos de tipo primitivos
let myName = "Erick";
let age = 34;
let weight = 32.43;
let isStudent = true;
let undefinedValue = undefined;
let nullValue = null;
let mySymbol3 = Symbol("mysymbol");
let myBigInt2 = 324334324n;


// 4. Imprime por consola el valor de todas las variables
console.log(myName);
console.log(age);
console.log(weight);
console.log(isStudent);
console.log(undefinedValue);
console.log(nullValue);
console.log(mySymbol3);
console.log(myBigInt2);


// 5. Imprime por consola el tipo de todas las variables
console.log(typeof mySymbol3);
console.log(typeof age);
console.log(typeof myName);
console.log(typeof isStudent);
console.log(typeof undefinedValue);
console.log(typeof nullValue);
console.log(typeof myBigInt2);

// 6. A continuación, modifica los valores de las variables por otros del mismo tipo
myName = "Eduardo";
age = 30;
weight = 23.34;
isStudent = false;
mySymbol3 = Symbol("mysymbol2");
myBigInt2 = 213412431n;

// 7. A continuación, modifica los valores de las variables por otros de distinto tipo
myName= false;
age = "Treinta años";
weight = Symbol("mysymbol3");
myBigInt2 = 5;

// 8. Declara constantes con valores asociados a todos los tipos de datos primitivos
const myName2 = "Pablo";
const age2 = 354;
const weight2 = 342.432;
const myBigInt3 = 342324n;


// 9. A continuación, modifica los valores de las constantes
myName2 = "Erickk";
age2 = "542";
weight2 = "423.43";
myBigInt3 = 423423432n;

// 10. Comenta las líneas que produzcan algún tipo de error al ejecutarse