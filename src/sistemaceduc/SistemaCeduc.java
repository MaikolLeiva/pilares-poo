/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaceduc;

/**
 *
 * @author Ceduc-Lab306-Docente
 */
public class SistemaCeduc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Vicente","23.222","Informatica" );
        Docente docente1 = new Docente("Maikol", "1111111-1", 1110);
        estudiante1.mostrarFicha();
        docente1.mostrarFicha();
    }
    
}
