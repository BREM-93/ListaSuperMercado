package listasupermercado;

import java.util.HashMap;


public class ListaSuperMercado {

    
    public static void main(String[] args) {
        
        HashMap<String, String> Compra = new HashMap<>();
        
        Compra.put("Pollo", "$5.5");
        Compra.put("Arroz", "$4.5");
        Compra.put("Galletas", "$2.0");
        Compra.put("Mostaza", "$1.0");
        Compra.put("Leche", "$6.0");
        Compra.put("Pan de caja", "$3.5");
        Compra.put("Carnes", "$10.0");
        Compra.put("Cafe", "$4.0");
        Compra.put("Rinso", "$2.5");   
        Compra.put("Azucar", "$3.0");
        Compra.put("Cereal", "$3.5");
        Compra.put("Frijoles", "$7.0");
        Compra.put("Yogurt", "$4.0");
        
        
        System.out.println(Compra);
        
        //Verifica si existe la key en el mapa
        System.out.println(Compra.containsKey("Galletas"));
        
        //Verifica si existe dicho valor en el mapa
        System.out.println(Compra.containsValue("6.0"));
        
        //Obtener un valor especifico
        System.out.println(Compra.get("Azucar"));
              
        //Reemplazar el valor de una compra
        Compra.replace("Cafe", "5");
        System.out.println(Compra);
        
        //Elimina una key del mapa
        Compra.remove("Cereal");
        System.out.println(Compra);
        
        //Verifica si existe una key en el mapa
        if(Compra.containsKey("Mostaza")){
            System.out.println(Compra.get("Mostaza"));
        }
              
        //Obtener todos los datos de un mapa por medio de iteracion 
        for(String Precio: Compra.keySet()){
            System.out.println(Compra.get( Precio) + " Dolares");
        }           
    }
    
}
