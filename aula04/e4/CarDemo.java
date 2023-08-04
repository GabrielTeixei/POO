package aula04.e4;


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
        //TODO: acumular distância percorrida
        this.kms += distance;

    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        // TODO: pede dados dos carros ao utilizador e acrescenta ao vetor
        // registo de carros termina quando o utilizador inserir uma linha vazia 
        // devolve número de carros registados

        String input = sc.nextLine();
        int nCars = 0;

        do{
            String[] carData = input.split(" ");
            if(carData.length == 4){
                cars[nCars] = new Car(carData[0], carData[1], Integer.parseInt(carData[2]), Integer.parseInt(carData[3]));
                nCars++;

            }else{
                System.out.println("Dados inválidos");
            }

            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            input = sc.nextLine();

        }while(!input.isEmpty());

        return nCars;
            
   }

    static void registerTrips(Car[] cars, int numCars) {
        // TODO: pede dados das viagens ao utilizador e atualiza informação do carro
        // registo de viagens termina quando o utilizador inserir uma linha vazia 
    
        String input;
        do{
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            input = sc.nextLine();
            String[] tripData = input.split(":");
            if(tripData.length == 2){
                int carIndex = Integer.parseInt(tripData[0]);
                if (carIndex >= 0 && carIndex < numCars) { // verificação de índice válido
                    int distance = Integer.parseInt(tripData[1]);
                    cars[carIndex].drive(distance);
                    
                } else {
                    System.out.println("Carro inválido");
                }
            }else{
                System.out.println("Dados inválidos");
            }
           
        }while(input.isEmpty() == false);
    }

    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        // lista todos os carros registados
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] != null){
                System.out.println(cars[i].make + " " + cars[i].model + ", " + cars[i].year + ", kms: " + cars[i].kms);
            }
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}