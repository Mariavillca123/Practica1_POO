// TiendaApp.java
import java.util.Scanner;
 
public class TiendaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("=== REGISTRO DE PRODUCTOS ===");
        int n = 2; // pide 2 productos como en la práctica; cambia a otro número si quieres
        producto[] productos = new producto[n];
 
        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto #" + (i + 1));
 
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
 
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
 
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine(); // limpiar buffer
 
            productos[i] = new producto(nombre, precio, cantidad);
        }
 
        // Crear Tienda con el arreglo de productos y mostrar inventario
        Tienda tienda = new Tienda(productos);
        tienda.mostrarInventario();
 
        sc.close();
    }
}