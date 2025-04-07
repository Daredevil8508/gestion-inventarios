package cache;

import java.util.HashMap;
import java.util.Map;

public class CacheProduct {
    private static final Map<Integer, String> cache = new HashMap<>();

    public static void agregarProducto(int id, String nombre) {
        cache.put(id, nombre);
    }

    public static String obtenerProducto(int id) {
        return cache.get(id);
    }

    public static boolean contieneProducto(int id) {
        return cache.containsKey(id);
    }
}


