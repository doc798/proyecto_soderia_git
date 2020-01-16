
package proyecto_soderia;


public class Persona {
    private String dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private String telefono;
    
    public Persona(String dni,String apellido,String nombre,String domicilio,String telefono){
        this.dni=dni;
        this.apellido=apellido;
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.telefono=telefono;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public String getDni(){
        return this.dni;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
