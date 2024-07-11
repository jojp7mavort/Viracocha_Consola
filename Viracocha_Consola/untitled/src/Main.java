import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al sistema de gestión de estudiantes!");
        System.out.println("Por favor, ingrese los siguientes datos:");

        System.out.print("Documento de identidad: ");
        String documentoIdentidad = scanner.nextLine();
        System.out.print("Primer nombre: ");
        String primerNombre = scanner.nextLine();
        System.out.print("Primer apellido: ");
        String primerApellido = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(documentoIdentidad, primerNombre, primerApellido, edad);

        System.out.println("\n¡Estudiante registrado exitosamente!");
        System.out.println("Detalles del estudiante:");
        System.out.println(estudiante);
    }
}
