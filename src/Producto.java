abstract class Producto implements Precio{
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadStack;

    public Producto() {
    }


    public Producto(String nombre, String marca, double precio, int cantidadStack) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadStack = cantidadStack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStack() {
        return cantidadStack;
    }

    public void setCantidadStack(int cantidadStack) {
        this.cantidadStack = cantidadStack;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStack=" + cantidadStack +
                '}';
    }
    public double Calcular_precio(int cantidad) {
        return Precio.super.Calcular_precio(cantidad);
    }
    public void reducirStock(int cantidad) {
        this.cantidadStack -= cantidad;
    }


    public abstract void  mostrar_info();

}
