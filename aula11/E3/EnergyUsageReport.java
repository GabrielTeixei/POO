package E3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnergyUsageReport {

    private List<Customer> customers;

    public EnergyUsageReport() {
        customers = new ArrayList<>();
    }

    public void load(String filename) throws FileNotFoundException {
        File file = new File(filename);
        if (!file.exists()) {
            System.err.println("Error: file not found!");
            return;
        }
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split("\\|");
            int id = Integer.parseInt(fields[0].trim());
            List<Double> readings = new ArrayList<>();
            for (int i = 1; i < fields.length; i++) {
                readings.add(Double.parseDouble(fields[i].trim()));
            }
            customers.add(new Customer(id, readings));
        }
        scanner.close();
    }

    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    public void removeCustomer(int id) {
        customers.removeIf(c -> c.getCustomerId() == id);
    }

    public Customer getCustomer(int id) {
        for (Customer c : customers) {
            if (c.getCustomerId() == id) {
                return c;
            }
        }
        return null;
    }

    public double calculateTotalUsage(int id) {
        Customer c = getCustomer(id);
        if (c == null) {
            return 0;
        }
        return c.getTotalUsage();
    }

    public void generateReport(String filename) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(filename);
        for (Customer c : customers) {
            writer.println(c.getCustomerId() + " | " + c.getTotalUsage());
        }
        writer.close();
    }
}
