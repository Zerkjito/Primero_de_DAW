package gstiondearticulos;

import java.util.Objects;

public class Articulo implements Comparable<Articulo>{

    private String codigo;
    private String descripcion;
    private double precio;
    private Fecha fechaCaducidad;
    private boolean productoEstrella;
    private static double porcentajeDescuento = 30;
    
    public Articulo() {
        fechaCaducidad = new Fecha(); ///los atributos de la clase que son objetos se crean en el constructor
    }

    public Articulo(Articulo a) {
        codigo = a.codigo;
        descripcion = a.descripcion;
        precio = a.precio;
        fechaCaducidad = new Fecha(a.fechaCaducidad); ///se crea un nuevo objeto Fecha con el constructor copia y se asigna la dirección de memoria al atributo fechaCaducidad
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fecha getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Fecha fechaCaducidad) {
        this.fechaCaducidad = new Fecha(fechaCaducidad);
    }

    public boolean isProductoEstrella() {
        return productoEstrella;
    }

    public void setProductoEstrella(boolean productoEstrella) {
        this.productoEstrella = productoEstrella;
    }

    public static double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public static void setPorcentajeDescuento(double porcentajeDescuento) {
        Articulo.porcentajeDescuento = porcentajeDescuento;
    }
    
    @Override
    public int compareTo(Articulo o) {
        return this.descripcion.compareToIgnoreCase(o.descripcion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(codigo);
        sb.append("  ");
        sb.append(descripcion);
        sb.append(" Precio: ");
        sb.append(precio);
        sb.append("  Fecha de caducidad: ");
        sb.append(fechaCaducidad);
        if(productoEstrella){
            sb.append("  PRODUCTO ESTRELLA ");
        }
        return sb.toString();
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        if (!this.codigo.equalsIgnoreCase(other.codigo)) { 
            return false;
        }
        return true;
    } 
}
