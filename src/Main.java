import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<laptop> laptops = new ArrayList<>();
    static List<Celular> celulares = new ArrayList<>();
    static List<Producto> productos = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();


    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("--- MENÚ PRINCIPAL ---");
            System.out.println("1. Crear dispositivo");
            System.out.println("2. crear cliente");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Mostrar cliente");
            System.out.println("5. Comprar producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Qué desea crear? (1. Laptop, 2. Celular): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();  // limpiar buffer
                    if (tipo == 1) {
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Cantidad en stock: ");
                        int stock = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("procesador: ");
                        String procesador = scanner.nextLine();

                        System.out.print("Memoria RAM: ");
                        String RAM = scanner.nextLine();

                        laptop laptop = new laptop(nombre, marca, precio, stock, procesador, RAM);
                        laptops.add(laptop);
                        productos.add(laptop);
                    } else if (tipo == 2) {
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Cantidad en stock: ");
                        int stock = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("resolucion");
                        String resolucion = scanner.nextLine();
                        System.out.print("capacidad de bateria: ");
                        String bateria = scanner.nextLine();

                        laptop laptop = new laptop(nombre, marca, precio, stock, resolucion, bateria);
                        laptops.add(laptop);
                        productos.add(laptop);
                    } else {
                        System.out.println("opcion no valida");

                    }
                }
                case 2 -> {

                        scanner.nextLine(); // limpiar buffer
                        System.out.print("Ingrese nombre del cliente: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese correo del cliente: ");
                        String correo = scanner.nextLine();

                        Cliente cliente = new Cliente(nombre, correo); // instancia
                        clientes.add(cliente); // se añade a la lista
                        System.out.println("Cliente creado exitosamente.");


                }
                case 3 -> {
                    System.out.println("\n--- INVENTARIO ---");
                    for (Producto p : productos) {
                        p.mostrar_info();
                        System.out.println("-------------------------");
                    }
                }
                case 4 ->{
                    for (Cliente c : clientes) {
                        c.mostrarCompra();
                    }
                }
                case 5 -> {
                    if (clientes.isEmpty()) {
                        System.out.println("Primero debe crear un cliente.");
                        return;
                    }

                    System.out.println("Seleccione el cliente (por número):");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + ". " + clientes.get(i).getNombre());
                    }
                    int clienteIndex = scanner.nextInt();

                    if (clienteIndex < 0 || clienteIndex >= clientes.size()) {
                        System.out.println("Cliente inválido.");
                        return;
                    }

                    Cliente cliente = clientes.get(clienteIndex);

                    if (productos.isEmpty()) {
                        System.out.println("No hay productos disponibles.");
                        return;
                    }

                    System.out.println("\n--- PRODUCTOS DISPONIBLES ---");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.print(i + ". ");
                        productos.get(i).mostrar_info();
                    }

                    System.out.print("Seleccione el número del producto a comprar: ");
                    int index = scanner.nextInt();

                    if (index < 0 || index >= productos.size()) {
                        System.out.println("Índice inválido.");
                        return;
                    }

                    Producto producto = productos.get(index);
                    System.out.print("Cantidad a comprar: ");
                    int cantidad = scanner.nextInt();

                    cliente.comprarProducto(producto, cantidad);
                }
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 6);
    }


}