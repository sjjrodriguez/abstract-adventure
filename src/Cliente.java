import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Compra> compras;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.compras = new ArrayList<>();
    }

    // Clase interna para registrar una compra
    private class Compra {
        Precio producto; // Puede ser Producto también si prefieres
        int cantidad;

        public Compra(Precio producto, int cantidad) {
            this.producto = producto;
            this.cantidad = cantidad;
        }

        public double calcularCosto() {
            return producto.Calcular_precio(cantidad);
        }
    }

    public void comprarProducto(Precio producto, int cantidad) {
        Compra nuevaCompra = new Compra(producto, cantidad);
        compras.add(nuevaCompra);
    }

    public void mostrarCompra() {
        double total = 0;
        for (Compra compra : compras) {
            System.out.println("Producto: " + compra.producto);
            System.out.println("Cantidad: " + compra.cantidad);
            double costo = compra.calcularCosto();
            System.out.println("Costo: $" + costo);
            total += costo;
            System.out.println("-------------------------");
        }
        System.out.println("Total gastado: $" + total);
    }
}
