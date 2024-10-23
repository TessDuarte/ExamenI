/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdevehiculos;

/**
 *
 * @author Tessd
 */

import java.util.ArrayList;

public class Taller {

    //DeclaraciOn de las listas como ArrayList.
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Vehiculo> listaVehiculo;

   
    //Hacemos la reserva de espacio para los ArrayList.
    public Taller() {
        listaCliente = new ArrayList<Cliente>();
        listaVehiculo = new ArrayList<>();
    }
    
    public boolean comprobarDni(String dni) {
        int i;
        
        for (i = 0; i < listaCliente.size(); i++) {
            if (dni.equals(listaCliente.get(i).getDni())) {
                break;
            }
        }

        if (i < listaCliente.size()) {
            return true;
        } else {
            return false;
        }
    }
    
     public boolean addCliente(String nombre, String apellidos) {
        
        int i;

        for (i = 0; i < listaCliente.size(); i++) {
            if (dni.equals(listaCliente.get(i).getDni())) {
                break;
            }
        }

        if (i < listaCliente.size()) {
            return false;
        } else {
            listaCliente.add(new Cliente(apellidos, nombre, direccion, dni));
            return true;
        }
    }
    //Ya no me da tiempo T.T
}
