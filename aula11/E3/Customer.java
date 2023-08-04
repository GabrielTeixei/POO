package E3;

import java.util.List;

public class Customer {
    private int customerId;
    private List<Double> meterReadings;

    public Customer(int customerId, List<Double> list) {
        this.customerId = customerId;
        this.meterReadings = list;
    }

    public Customer(int id, int[] readings) {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Double> getMeterReadings() {
        return meterReadings;
    }

    public void setMeterReadings(List<Double> meterReadings) {
        this.meterReadings = meterReadings;
    }

    public int getId() {
        return 0;
    }

    public double getTotalUsage() {
        return 0;
    }
}
