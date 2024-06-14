 import java.util.HashMap;

    public static void main(String[] args) {
        HashMap<Object, Object> mapa = new HashMap<>();
        mapa.put(new Integer(1), "Uno");
        mapa.put(new String("Dos"), new Double(2.0));
        System.out.println(mapa);
    }
