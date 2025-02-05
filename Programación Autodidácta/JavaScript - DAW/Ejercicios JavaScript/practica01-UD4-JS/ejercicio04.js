class Conductor {
  #nombre;
  #licencia;

  constructor(nombre, licencia) {
    this.#nombre = nombre;
    this.#licencia = licencia;
  }

  getNombre() {
    return this.#nombre;
  }

  setNombre(nombre) {
    this.#nombre = nombre;
  }

  getLicencia() {
    return this.#licencia;
  }

  setLicencia(licencia) {
    this.#licencia = licencia;
  }

  mostrarDatosConductor() {
    console.log("Nombre del conductor: " + this.#nombre);
    console.log("Licencia: " + this.#licencia);
  }
}

class Autobus {
  #capacidad;
  #pasajeros;
  #matricula;
  #listadoConductores;

  constructor(capacidad, pasajeros, matricula, listadoConductores) {
    this.#capacidad = capacidad;
    this.#pasajeros = pasajeros;
    this.#matricula = matricula;
    this.#listadoConductores = listadoConductores;
  }

  getCapacidad() {
    return this.#capacidad;
  }

  setCapacidad(capacidad) {
    this.#capacidad = capacidad;
  }

  getPasajeros() {
    return this.#pasajeros;
  }

  setPasajeros(pasajeros) {
    this.#pasajeros = pasajeros;
  }

  getMatricula() {
    return this.#matricula;
  }

  setMatricula(matricula) {
    this.#matricula = matricula;
  }

  getListadoConductores() {
    return this.#listadoConductores;
  }

  setListadoConductores(listadoConductores) {
    this.#listadoConductores = listadoConductores;
  }

  mostrarDatosAutobus() {
    console.log("Matrícula: " + this.#matricula);
    console.log("Capacidad: " + this.#capacidad);
    console.log("Pasajeros actuales: " + this.#pasajeros);
    console.log("Listado conductores:");
    this.#listadoConductores.forEach(conductor => conductor.mostrarDatosConductor()); // no entiendo por qué aquí sale vacío
  }

  subir(numPasajeros) {
    if (this.#pasajeros + numPasajeros > this.#capacidad) {
      this.#pasajeros = this.#capacidad;
    } else {
      this.#pasajeros+= numPasajeros;
    } 
  }

  bajar(numPasajeros) {
    if (this.#pasajeros - numPasajeros < 0) {
      this.#pasajeros = 0;
    } else {
      this.#pasajeros-= numPasajeros;
    }
  }

  buscarConductor(licencia) {
    return this.#listadoConductores.some(conductor => conductor.getLicencia() === licencia);
  }
} 

const main = () => {
  const conductor1 = new Conductor("Anabel Velázquez", 6633);
  const conductor2 = new Conductor("Mario Romero", 13122);

  const conductores = [conductor1, conductor2];

  const autobus = new Autobus(45, 0, "ESP-6968", conductores);

  autobus.mostrarDatosAutobus();

  autobus.subir(30);
  console.log("\nTras subir 30 pasajeros:");
  autobus.mostrarDatosAutobus();

  autobus.subir(20);
  console.log("\nTras intentar haber subido 20 pasajeros más (CAPACIDAD MÁXIMA 45):");
  autobus.mostrarDatosAutobus();

  autobus.bajar(8);
  console.log("\nTras bajar 8 pasajeros:");
  autobus.mostrarDatosAutobus();

  autobus.bajar(40);
  console.log("\nTras intentar bajar a 40 pasajeros (debería ser 0 nunca negativo):")
  autobus.mostrarDatosAutobus();

  console.log("\nPrueba para comprobar que realmente existe un condcuctor que he introducido: " + autobus.buscarConductor(6633));
  console.log("\nPrueba para comprobar que realmente no existe un condcuctor que nunca he introducido: " + autobus.buscarConductor(9999));
}

main();