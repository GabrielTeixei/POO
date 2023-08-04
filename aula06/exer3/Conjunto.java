package aula06.exer3;

public class Conjunto {

    private int[] conjunto;
    private int size;

    public Conjunto() {
        conjunto = new int[10];
        size = 0;
    }

    public void insert(int el) {
        if (size == conjunto.length) {
            int[] temp = new int[conjunto.length * 2];
            for (int i = 0; i < conjunto.length; i++) {
                temp[i] = conjunto[i];
            }
            conjunto = temp;
        }
        conjunto[size] = el;
        size++;
    }

    public void remove(int el) {
        int i = 0;
        while (i < size && conjunto[i] != el) {
            i++;
        }
        if (i < size) {
            for (int j = i; j < size - 1; j++) {
                conjunto[j] = conjunto[j + 1];
            }
            size--;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++) {
            s += conjunto[i] + " ";
        }
        s += "]";
        return s;
    }
}
