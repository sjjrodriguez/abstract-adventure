import java.util.*;

public class Cliente {
    private String nombre;
    private String correo;
    private List<String> historialCompras = new ArrayList<>();

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        double costo = producto.Calcular_precio(cantidad);
        producto.reducirStock(cantidad);
        historialCompras.add(producto.getNombre() + " x" + cantidad + " - Total: $" + costo);
        System.out.println("\n--- FACTURA ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + costo);
        System.out.println("------------------------");
    }

    public void mostrarCompra() {

            for (String compra : historialCompras) {
                System.out.println(compra);
            }
        }
    }



