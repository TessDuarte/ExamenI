/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerdevehiculos;

/**
 *
 * @author Tessd
 */

//Aqui se crea la gestion de los datos de los clientes
public class DatosPersonales {
   private nombre;
   private apellido;
    private final String nombre;
    private final String apellido;
  
//Constructor
public DatosPersonales(String nombre, String apellido){
   this.nombre = nombre;
   this.apellido = apellido;

}
        
//Getters y setters
 public String getNombre (){
    return nombre;
}

public void SetNombre(String nombre){
    this.nombre = nombre;
}

public String getApellido (){
       return apellido ;
}

public void GetApellido(String apellido){
    this.apellido = apellido;
}
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
