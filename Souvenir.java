public class Souvenir {
    private String name;
    private double price;
    private int stock;

    public Souvenir(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void sell() {
        if (stock > 0) {
            stock--;
            System.out.println("Venta realizada con éxito.");
        } else {
            System.out.println("No hay stock disponible para este suvenir.");
        }
    }
}
