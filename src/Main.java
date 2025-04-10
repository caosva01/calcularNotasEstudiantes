
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Desarrollar un sistema de notas para un estudiante que desea saber su nota final( de cada materia), el sistema debe pedir el nombre del estudiante,
        // el documento y el programa al que esta matriculado (Menu de opciones: Desarrollo de Software, diseño grafico, gastronomia)
        // Debe permitir seleccionar la materia (Menu de opciones:
        // Desarrollo: logica, metodologias, introduccion
        // Diseño: tipografia, iconografia, semantica
        // Gastronomia: costos, panaderia dulce, cocina internacional
        // El calculo de notas es de la siguiente manera:
        // Para cada materia hay un examen parcial que equivale al 20% de la nota, un taller que equivale el 30% de la nota y un examen final equivale
        // el 50% de la nota
        // Una vez calculada la nota final tener en cuenta que:
        // Si la nota esta entre 0 y 2 el estudiante pierde definitivamente
        // Si la nota esta entre 2.1 y 2.9  tiene derecho a pla de mejora
        // Si la nota es igual o superior de 3 , asi que que le queda la materia
        // Si el estudiante hace un plan de mejoramiento, la nota maxima de la materia sera 3
        // El sistema debe discriminar la informacion general del estudiante
        // Nombre, documento y nota de la materia

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.printf("Ingrese el documento del estudiante: ");
        String documentoEstudiante = sc.nextLine();
        System.out.printf("Seleccione el programe; \n1 - Desarrollo de Software \n2 - Diseño grafico \n3 - Gastronomia");
        String programa = sc.nextLine();
        switch (programa){
            case "1":
                System.out.println("Programa de desarrollo de software");
                System.out.println("ingrese la materia: \n1 - logica de programacion\n2 - metodologias agiles\n3 - introduccion a la programacion");
                String materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota logica de programacion");
                        break;
                    case "2":
                        System.out.println("Nota metodologias agiles");
                        break;
                    case "3":
                        System.out.println("nota de introduccion");
                        break;
                }
                break;
            case "2":
                System.out.println("Programa de diseño grafico");
                break;
            case "3":
                System.out.println("Programa de gastronomia");
                break;


        }

    }
}