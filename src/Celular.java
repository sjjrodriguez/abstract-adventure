public class Celular extends Producto implements Precio{
    private String resolucion;
    private String capacidad_bateria;

    public Celular(String nombre, String marca, double precio, int cantidadStack, String resolucion, String capacidad_bateria) {
        super(nombre, marca, precio, cantidadStack);
        this.resolucion = resolucion;
        this.capacidad_bateria = capacidad_bateria;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getCapacidad_bateria() {
        return capacidad_bateria;
    }

    public void setCapacidad_bateria(String capacidad_bateria) {
        this.capacidad_bateria = capacidad_bateria;
    }

    @Override
    public String toString() {
        return super.toString() +
                "resolucion='" + resolucion + '\'' +
                ", capacidad_bateria='" + capacidad_bateria + '\'' +
                '}';
    }


    @Override
    public void mostrar_info() {
        System.out.println("el nombre del producto es: "+nombre);
        System.out.println("la marca del producto es: " +marca);
        System.out.println("el precio del producto es: "+precio +"$");
        System.out.println("la cantidad de producto es "+cantidadStack);
        System.out.println("la calidad de la camara es de " +resolucion);
        System.out.println("la bateria del celular es de"+capacidad_bateria);
    }

    @Override
    public double Calcular_precio(int cantidad) {
        return Precio.super.Calcular_precio(cantidad);
    }

}
