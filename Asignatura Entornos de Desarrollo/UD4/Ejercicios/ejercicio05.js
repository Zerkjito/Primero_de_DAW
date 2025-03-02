class Vivienda {
   constructor(id, area, numHabitaciones, direccion, precio) {
      this.id = id;
      this.area = area;
      this.numHabitaciones = numHabitaciones;
      this.direccion = direccion;
      this.precio = precio;
   }
   getId() {
      return this.id;
   }

   setId(id) {
      this.id = id;
   }

   getArea() {
      return this.area;
   }

   setArea(area) {
      this.area = area;
   }

   getNumHabitaciones() {
      return this.numHabitaciones;
   }

   setNumHabitaciones(numHabitaciones) {
      this.numHabitaciones = numHabitaciones;
   }

   getDireccion() {
      return this.direccion;
   }

   setDireccion(direccion) {
      this.direccion = direccion;
   }

   getPrecio() {
      return this.precio;
   }

   setPrecio(precio) {
      this.precio = precio;
   }

   mostrarVivienda() {
      console.log("ID Vivienda: " + this.id);
      console.log("Area: " + this.area);
      console.log("Número de habitaciones: " + this.numHabitaciones);
      console.log("Dirección: " + this.direccion);
      console.log("Precio: " + this.precio);
   }
}

class Inmobiliaria extends Vivienda{
   constructor(id, area, numHabitaciones, direccion, precio) {
      super(id, area, numHabitaciones, direccion, precio);
      this.viviendas = [];
   }

   añadirVivienda(vivienda) {
      this.viviendas.push(vivienda);
   }

   eliminarVivienda(idVivienda) {
      const index = this.viviendas.findIndex(vivienda => vivienda.id === idVivienda);
      if (index != -1) {
         this.viviendas.splice(index, 1);
         console.log("Vivienda con ID " + idVivienda + " eliminado correctamente.");
      } else {
         console.log("No se encontró ninguna vivienda con ID " + idVivienda + " .");
      }
   }

   mostrarViviendas() {
      return this.viviendas;
   }

   consultarVivienda(idVivienda) {
      const vivienda = this.viviendas.find(vivienda => vivienda.id === idVivienda);

      if (vivienda) {
         console.log("ID Vivienda: " + vivienda.id);
         console.log("Area: " + vivienda.area + " m²");
         console.log("Número de habitaciones: " + vivienda.numHabitaciones);
         console.log("Precio: " + vivienda.precio + "€");
      }
   }
}

let vivienda1 = new Vivienda(1, 80, 3, "Calle Gilabert 123", 150000);
let vivienda2 = new Vivienda(2, 120, 4, "Calle Carrero 456", 200000);

let inmobiliaria = new Inmobiliaria(1, 0, 0, "", 0, "Inmobiliaria Ejemplo");
inmobiliaria.añadirVivienda(vivienda1);
inmobiliaria.añadirVivienda(vivienda2);

inmobiliaria.consultarVivienda(1);
inmobiliaria.consultarVivienda(3);

inmobiliaria.mostrarViviendas();

inmobiliaria.eliminarVivienda(2);
inmobiliaria.mostrarViviendas();