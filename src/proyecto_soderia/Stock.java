
package proyecto_soderia;

import java.util.ArrayList;


public class Stock {
    
    private ArrayList<Articulo> articulos;
    
    public Stock(){
        this.articulos=new ArrayList<Articulo>();
    }
    
    public void sumarArticulosaStock(String codigo, int cantidad){  
        //codigo para agregar articulos nuevos al stock de la soderia
        //ej se compran nuevos bidones de agua
    }
    
    public void quitarArticulosdeStock(String codigo, int cantidad){
        //codigo para decrementar del stock 
        //por ejemplo cuando se da de baja a mercaderia fallada
    }
    
    
      
    
    
}
