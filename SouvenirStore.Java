import java.util.ArrayList;
import java.util.List;

public class SouvenirStore {
    private static List<String> souvenirs = new ArrayList<String>();
    private static List<Double> prices = new ArrayList<Double>();
    private static List<Integer> stocks = new ArrayList<Integer>();
    private static double totalRevenue = 0;

    public static void addSouvenir(String name, double price, int stock) {
        souvenirs.add(name);
        prices.add(price);
        stocks.add(stock);
    }

    public static void displaySouvenirs() {
        System.out.println("Suvenires disponibles:");
        for (int i = 0; i < souvenirs.size(); i++) {
            System.out.println(i + ". " + souvenirs.get(i) + " - Precio: $" + prices.get(i) + " - Stock: " + stocks.get(i));
        }
    }

    public static void sellSouvenir(int index) {
        if (index >= 0 && index < souvenirs.size()) {
            if (stocks.get(index) > 0) {
                stocks.set(index, stocks.get(index) - 1);
                totalRevenue += prices.get(index);
                System.out.println("Venta realizada con éxito.");
            } else {
                System.out.println("No hay stock disponible para este suvenir.");
            }
        } else {
            System.out.println("Índice de suvenir no válido.");
        }
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }
}
