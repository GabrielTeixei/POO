package aula04.e3;

import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        kms += distance;

    }
}

public class SimpleCarDemo {

    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars) {
        
        System.out.println("Lista de carros:\n");
        for (int i=0; i<cars.length; i++) {
            System.out.printf("%d: %s %s %d (%d kms)\n", i, cars[i].make, cars[i].model, cars[i].year, cars[i].kms);
        }

    }
    static void carRegister(Car[] cars) {
        System.out.println("Registo de carros:\n");
        for (int i=0; i<cars.length; i++) {
            System.out.printf("%d: %s %s %d (%d kms)\n", i, cars[i].make, cars[i].model, cars[i].year, cars[i].kms);
        }
    }

    public static void main(String[] args) {
        //alterar nomes
        Car[] cars = new Car[3];
        cars[0] = new Car("MBW", "I3", 2023, 3006);
        cars[1] = new Car("bike", "LOve", 2210, 0112);
        cars[2] = new Car("Porche", "PPgod", 0123, 00000);
        
        carRegister(cars);
        
        // Adicionar 10 viagens geradas aleatoriamente
        for (int i=0; i<10; i++) {
            int j = (int)Math.round(Math.random()*2); // escolhe um dos 3 carros
            int kms = (int)Math.round(Math.random()*1000); // viagem até 1000 kms
            System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);
            
            // TODO: adicionar viagem ao carro j

            cars[j].drive(kms);
        }
        

        listCars(cars);


        sc.close();

    }
}