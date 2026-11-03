/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaceduc;

/**
 *
 * @author Ceduc-Lab306-Docente
 */
public class Docente extends Persona implements Auditable{
    private int cantHoras;
    
    public Docente(String nombre, String rut, int cantHoras){
        super(nombre, rut);
        this.cantHoras = cantHoras;
    }
    @Override
    public void mostrarFicha(){
        System.out.println("Nombre: " + this.nombre + "| rut: " + this.rut + " | Cantidad horas: "+ this.cantHoras);
    }
    
    @Override
    public String obtenerRol(){
        return "Docente";
    }
        
    @Override
    public void registrarAccion(String accion){
        System.out.println("Acción: "+accion);
    }
}
