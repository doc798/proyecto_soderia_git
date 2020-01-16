
package proyecto_soderia;

import java.util.ArrayList;


public class Cliente extends Persona{
    
    private ArrayList<Articulo> articulos;
    private double saldo;
    
    public Cliente(String dni,String apellido,String nombre,String domicilio,String telefono){
        super( dni, apellido, nombre, domicilio, telefono);
        this.saldo=0;
        this.articulos=new ArrayList<Articulo>();
    }
    
    public ArrayList<Articulo> getArticulos(){
        return this.articulos;
    }
    
}
