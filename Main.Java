import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar suvenir");
            System.out.println("2. Mostrar suvenires");
            System.out.println("3. Calcular ingresos totales");
            System.out.println("4. Vender suvenir");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del suvenir: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingrese el precio del suvenir: ");
                    double price = scanner.nextDouble();
                    System.out.print("Ingrese el stock del suvenir: ");
                    int stock = scanner.nextInt();
                    SouvenirStore.addSouvenir(name, price, stock);
                    break;
                case 2:
                    SouvenirStore.displaySouvenirs();
                    break;
                case 3:
                    System.out.println("Ingresos totales: $" + SouvenirStore.getTotalRevenue());
                    break;
                case 4:
                    System.out.print("Ingrese el índice del suvenir a vender: ");
                    int index = scanner.nextInt();
                    SouvenirStore.sellSouvenir(index);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 5.");
            }
        }
    }
}
