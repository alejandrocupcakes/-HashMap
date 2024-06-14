import java.util.HashMap;

    public static void main(String[] args) {
        HashMap<String, String> mapa1 = new HashMap<>();
        mapa1.put("Clave1", "Valor1");
       
        HashMap<String, String> mapa2 = new HashMap<>();
        mapa2.put("Clave2", "Valor2");
       
       HashMap<String, String> mapa3 = new HashMap<>();
        mapa2.put("Clave3", "Valor3");

        mapa1.putAll(mapa2);
    
        mapa1.put("Clave3", null);
       
        System.out.println(mapa3);
    }
