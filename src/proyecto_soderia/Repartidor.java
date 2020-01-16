
package proyecto_soderia;

import java.util.ArrayList;


public class Repartidor extends Persona{
    
    private double saldo;
    private ArrayList <Articulo> articulos;
    
    public Repartidor(String dni,String apellido,String nombre,String domicilio,String telefono){
        super( dni, apellido, nombre, domicilio, telefono);
        this.saldo=0;
        this.articulos=new ArrayList<Articulo>();
    }
    
    public void cargarProductos(String codigo, int cantidad){
        //decrementar de stock y agregar al arraylist del repartidor
        //modificar los saldos segun corresponda
    }
    
    public void devolverProductos(String codigo, int cantidad){
        //incrementar en stock y sacar del arraylist del repartidor
        //por ej productos no vendidos que se devuelven o productos fallados
        //modificar los saldos segun corresponda
    }
    
    public void venderProductos(String codigo, int cantidad){
        //quitar del array list del repartidor y agregar al del cliente
        //realizar los movimientos de dinero que correspondadan
    }
    
    public void incrementarSaldo(){
        //movimientos en el saldo segun correspondan
    }
    
    public void decrementarSaldo(){
        //movimientos en el saldo segun correspondan
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public ArrayList<Articulo> getArticulos(){
        return this.articulos;
    }
    
}
