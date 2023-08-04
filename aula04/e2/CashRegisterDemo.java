package aula04.e2;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int  getQuantity() {
        return quantity;
    }
}


class CashRegister {

    private Product[] products;
    private int count;

    public CashRegister() {
        products = new Product[10];
        count = 0;
    }

    public void addProduct(Product p) {
        products[count] = p;
        count++;
    }

    public double getTotalValue() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getTotalValue();
        }
        return total;
    }

    public String toString() {
        String s = "";
        System.out.println("********************************************************************");
        System.out.printf("%-14s %-12s %-17s %-11s", "Name", "Price", "Quantity", "Total Value\n");
        for (int i = 0; i < count; i++) {
            s += "\n" +
                    String.format("%-15s", products[i].getName()) +
                    String.format("%-13s", products[i].getPrice()) +
                    String.format("%-18s", products[i].getQuantity()) +
                    String.format("%-11s", String.format("%.2f", products[i].getTotalValue()));
        }
        s += "\nTotal: " + getTotalValue() + "\n********************************************************************";
        
        return s;
        
    }
}

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        // TODO: Listar o conteúdo e valor total
        System.out.println(cr);

    }
}