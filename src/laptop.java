public  class laptop extends Producto implements Precio {
    private String procesador;
    private String memoriaRAM;

    public laptop(String nombre, String marca, double precio, int cantidadStack, String procesador, String memoriaRAM) {
        super(nombre, marca, precio, cantidadStack);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return super.toString()+
                "procesador='" + procesador + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                '}';
    }
    @Override
    public void mostrar_info(){
        System.out.println("el nombre del producto es: "+nombre);
        System.out.println("la marca del producto es: " +marca);
        System.out.println("el precio del producto es: "+precio +"$");
        System.out.println("la cantidad de producto es: "+cantidadStack);
        System.out.println("el procesador de la laptop es: "+procesador);
        System.out.println("la memoria RAM de la laptop es: "+memoriaRAM);
    }

    @Override
    public double Calcular_precio(int cantidad) {
        return Precio.super.Calcular_precio(cantidad);
    }
}
