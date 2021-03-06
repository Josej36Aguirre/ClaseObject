
package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienen Distinta refrencia en memoria");
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");  
        }else{
            System.out.println("Los objetos son diferentes en contenido");
        }
        
        if (empleado2.hashCode() ==  empleado1.hashCode()) {
            System.out.println("El Valor HashCode es igual");
        } else {
            System.out.println("El Valor HashCode es distinto");
        }
         
    }
}
