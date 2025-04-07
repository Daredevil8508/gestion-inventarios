package cache;

import java.util.HashMap;
import java.util.Map;

public class CacheBranch {
    private static final Map<Integer, String> cache = new HashMap<>();

    public static void agregarSucursal(int id, String nombre) {
        cache.put(id, nombre);
    }

    public static String obtenerSucursal(int id) {
        return cache.get(id);
    }

    public static boolean contieneSucursal(int id) {
        return cache.containsKey(id);
    }
}

