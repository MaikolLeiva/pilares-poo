/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaceduc;

/**
 *
 * @author Ceduc-Lab306-Docente
 */
public class Estudiante extends Persona implements Auditable {
    private double promedio;
    private String carrera;
    private Boolean estado;
    
    public Estudiante(String nombre, String rut, String carrera){
        super(nombre, rut);
        this.promedio = 0;
        this.carrera = carrera;
        this.estado = true;
    }
    @Override
    public void mostrarFicha(){
        System.out.println("Nombre: " + this.nombre + "| rut: " + this.rut + " | Promedio: "+ this.promedio);
    }
    
    @Override
    public String obtenerRol(){
        return "Estudiante";
    }
        
    @Override
    public void registrarAccion(String accion){
        System.out.println("Acción: "+accion);
    }
}
