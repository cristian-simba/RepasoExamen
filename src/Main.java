import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        ArrayList<EstudianteGraduado> integrantesG = new ArrayList<EstudianteGraduado>();
        ArrayList<EstudianteNoGraduado> integrantesNG = new ArrayList<EstudianteNoGraduado>();

        int opcion;
        String nombre;
        int edad;
        int cedula;
        float promedio;
        int anioGrado;
        int periodoAcademico;

        do {
            menuPrincipal();
            opcion = ingreso.nextInt();
            ingreso.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Caso 1");
                    for (int i = 1; i < 3; i++) {
                        EstudianteGraduado integrante = new EstudianteGraduado();
                        System.out.println("-----Este es el estudiante "+i+"------");

                        System.out.print("Ingresa el nombre del estudiante: ");
                        nombre = ingreso.nextLine();
                        integrante.setNombre(nombre);

                        System.out.print("Ingresa la edad del estudiante: ");
                        edad = ingreso.nextInt();
                        ingreso.nextLine();
                        integrante.setEdad(edad);

                        System.out.print("Ingresa la cedula: ");
                        cedula = ingreso.nextInt();
                        ingreso.nextLine();
                        integrante.setCedula(cedula);

                        System.out.print("Ingresa el promedio que ha sacado: ");
                        promedio = ingreso.nextFloat();
                        ingreso.nextLine();
                        integrante.setPromedio(promedio);
                        integrantesG.add(integrante);

                        System.out.print("Ingresa el periodo de graduacion: ");
                        anioGrado = ingreso.nextInt();
                        ingreso.nextLine();
                        integrante.setAnioGrado(anioGrado);

                        integrantesG.add(integrante);
                    }

                break;
                case 2:
                    System.out.println("Caso 2");
                    for (EstudianteGraduado integrante : integrantesG){
                        System.out.println("-----Los datos recolectados del estudiante-----");
                        System.out.println("El nombre es: "+integrante.getNombre());
                        System.out.println("La edad es de: "+integrante.getEdad());
                        System.out.println("La cedula es: "+integrante.getCedula());
                        System.out.println("Tiene un promedio de: "+integrante.getPromedio());
                    }

                break;
                case 3:
                    System.out.println("Caso 3");
                    for (int i=1; i<3;i++){
                        EstudianteNoGraduado integrante = new EstudianteNoGraduado();

                        System.out.println("-----Ingreso de datos del estudiante"+i+"------");
                        System.out.print("Ingresa el nombre del estudiante: ");
                        nombre = ingreso.nextLine();
                        integrante.setNombre(nombre);

                        System.out.print("Ingresa la edad del estudiante: ");
                        edad = ingreso.nextInt();
                        ingreso.nextLine();
                        integrante.setEdad(edad);

                        System.out.print("Ingresa la cedula del estudiante: ");
                        cedula = ingreso.nextInt();
                        ingreso.nextLine();
                        integrante.setCedula(cedula);

                        System.out.print("Ingresa el periodo academico actual: ");
                        periodoAcademico = ingreso.nextInt();
                        ingreso.nextLine();
                        integrante.setPeriodoAcademico(periodoAcademico);

                        System.out.print("Ingresa el periodo en el que se va a graduar: ");
                        anioGrado = ingreso.nextInt();
                        ingreso.nextLine();
                        integrante.setAnioGrado(anioGrado);

                        integrantesNG.add(integrante);

                    }
                break;
                case 4:
                    System.out.println("Caso 4");
                    for (EstudianteNoGraduado integrante:integrantesNG){
                        System.out.println("------Los datos recolectados son------");
                        System.out.println("El nombre es: "+integrante.getNombre());
                        System.out.println("La edad es: "+integrante.getEdad());
                        System.out.println("La cedula es: "+integrante.getCedula());
                        System.out.println("El periodo academico actual es: "+integrante.getPeriodoAcademico());
                        System.out.println("Se estima que se gradue en: "+integrante.getAnioGrado());
                    }
                break;
                case 5:
                    System.out.println("Saliendo del sistema");
                break;
                default:
                    System.out.println("ERROR!! Escoge una opcion dada");
                break;
            }

        }while(opcion!=5);

    }

    public static void menuPrincipal(){
        System.out.println("------Menu Principal------");
        System.out.println("1. Estudiante Graduado");
        System.out.println("2. Datos de los estudiantes graduados");
        System.out.println("3. Estudiantes no Graduados");
        System.out.println("4. Datos de los estudiantes no graduados");
        System.out.println("5. Salir");
        System.out.print("Escoga una opcion: ");
    }
}
