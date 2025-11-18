// Producto.java
public class producto {
    private String nombre;
    private double precio;
    private int cantidad;
 
    public producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
 
    public double calcularTotal() {
        return precio * cantidad;
    }
 
    public void mostrarInfo() {
        System.out.println("\nProducto: " + nombre);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + calcularTotal());
    }
 
    // Getters si los necesitas en Tienda u otro lugar
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
}