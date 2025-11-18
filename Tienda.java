// Tienda.java
public class Tienda {
    private producto[] Productos;
 
    public Tienda(producto[] Productos) {
        this.Productos = Productos;
    }
 
    public double calcularTotalGeneral() {
        double total = 0;
        for (producto p : Productos) {
            if (p != null) total += p.calcularTotal();
        }
        return total;
    }
 
    public void mostrarInventario() {
        System.out.println("\n=== RESUMEN DE INVENTARIO ===");
        for (producto p : Productos) {
            if (p != null) p.mostrarInfo();
        }
        System.out.printf("\nTOTAL GENERAL DEL INVENTARIO: $%.2f\n", calcularTotalGeneral());
    }
}
