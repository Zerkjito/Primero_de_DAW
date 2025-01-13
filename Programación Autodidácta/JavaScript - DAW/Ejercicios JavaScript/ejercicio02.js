let salary = prompt("Introduce el sueldo mensual:");
let seniority = prompt("Introduce los años de antigüedad en la empresa:");
let newSalary;

salary = parseFloat(salary);
seniority = parseFloat(seniority);

if (salary < 1600) {
  if (seniority >= 10) {
    newSalary = salary * 2;
  } else if (seniority < 10) {
    newSalary = salary * 1.5;
  }
}

console.log(`El nuevo salario es -> ${newSalary}`);
