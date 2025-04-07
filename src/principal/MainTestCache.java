package principal;
import cache.CacheBranch;
import cache.CacheProduct;

public class MainTestCache {
    public static void main(String[] args) {
        // Agregar datos al caché
        CacheProduct.agregarProducto(1, "Arroz Diana 500g");
        CacheBranch.agregarSucursal(101, "Sucursal Bogotá Centro");

        // Obtener desde caché
        String producto = CacheProduct.obtenerProducto(1);
        String sucursal = CacheBranch.obtenerSucursal(101);

        // Mostrar
        System.out.println("Producto en caché: " + producto);
        System.out.println("Sucursal en caché: " + sucursal);

        // Verificación
        System.out.println("¿Producto 1 existe?: " + CacheProduct.contieneProducto(1));
        System.out.println("¿Sucursal 101 existe?: " + CacheBranch.contieneSucursal(101));
    }
}


