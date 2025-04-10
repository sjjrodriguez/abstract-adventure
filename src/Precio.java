public interface Precio {
    double getPrecio();
    int getCantidadStack();

    default double  Calcular_precio(int cantidad){
        double total;
        if(getCantidadStack()>cantidad) {
             total = getPrecio() * cantidad;
            if (cantidad >= 5) {
                double descuento = total * 0.15;
                total = total - descuento;


            }
            System.out.println("su precio total seria de "+ total+"$");
        }  else {
            System.out.println("no hay productos suficientes");
            total=0;
        }
        return total;

    }
}
