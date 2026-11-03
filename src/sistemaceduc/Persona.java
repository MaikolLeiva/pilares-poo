/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaceduc;

/**
 *
 * @author Ceduc-Lab306-Docente
 */
public abstract class Persona {
    protected String nombre;
    protected String rut;

    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }
    
    public void mostrarFicha(){
        System.out.println("Nombre: " + this.nombre + "| rut: " + this.rut);
    }
    
    public abstract String obtenerRol();
    
    
}
