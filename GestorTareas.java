import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Escribe la nueva tarea: ");
                    String tarea = scanner.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea agregada.");
                    break;

                case 2:
                    System.out.println("\nTareas pendientes:");
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas para eliminar.");
                    } else {
                        System.out.print("Ingresa el número de la tarea a eliminar: ");
                        int num = scanner.nextInt();
                        if (num > 0 && num <= tareas.size()) {
                            tareas.remove(num - 1);
                            System.out.println("Tarea eliminada.");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
