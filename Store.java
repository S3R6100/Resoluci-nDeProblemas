import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Souvenir> souvenirs;
    private double totalRevenue;

    public Store() {
        souvenirs = new ArrayList<Souvenir>();
        totalRevenue = 0;
    }

    public void addSouvenir(Souvenir souvenir) {
        souvenirs.add(souvenir);
    }

    public void displaySouvenirs() {
        System.out.println("Suvenires disponibles:");
        for (Souvenir souvenir : souvenirs) {
            System.out.println(souvenir.getName() + " - Precio: $" + souvenir.getPrice() + " - Stock: " + souvenir.getStock());
        }
    }

    public void calculateTotalRevenue() {
        totalRevenue += getTotalSold();
    }

    private double getTotalSold() {
        double total = 0;
        for (Souvenir souvenir : souvenirs) {
            total += (souvenir.getPrice() * (souvenir.getStock() - 1));
        }
        return total;
    }

    public void sellSouvenir(int index) {
        if (index >= 0 && index < souvenirs.size()) {
            souvenirs.get(index).sell();
            calculateTotalRevenue();
        } else {
            System.out.println("Índice de suvenir no válido.");
        }
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}
