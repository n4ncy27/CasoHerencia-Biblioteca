package ejecutable;
import java.util.Scanner;
import modelo.Libro;

public class TestConsola {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPor favor ingrese los datos del libro:\n");

        System.out.print("Título = : ");
        String titulo = scanner.nextLine();

        System.out.print("Autor principal =: ");
        String autor = scanner.nextLine();

        System.out.print("Segundo autor =:");
        String autor2 = scanner.nextLine();

        System.out.print("Año de edición =: ");
        String añoEdicion = scanner.nextLine();

        System.out.print("Es de lujo? (si/no): ");
        String deLujoStr = scanner.nextLine();
        Boolean deLujo = deLujoStr.equalsIgnoreCase("si");

        // Crear instancia del libro con los datos recogidos
        Libro libro = new Libro(titulo, autor, autor2, añoEdicion, deLujo);

        // Mostrar los datos del libro creado
        System.out.println("\nSe ha creado el libro:");
        System.out.println(libro.toString());

        scanner.close();
    }
}