import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        System.out.print("Введите кол-во каналов: ");
        String[] channels = new String[input.nextInt()];
        for (int i = 0; i < channels.length; i++) {
            System.out.printf("Введите название канала номер %d: ",i);
            channels[i] = input.next();
        }
        System.out.println("\nНа какой канал поставить?");
        Television television = new Television(input.nextInt(),channels);
        television.printCurrentChannel();
        while (true) {
            System.out.println("Нажмите (+) если хотите переключить на следующий канал: ");
            System.out.println("Нажмите (-) если хотите переключить на предыдущий канал: ");
            System.out.println("Нажмите (=) если хотите переключить на определенный канал: ");
            char movement = input.next().charAt(0);
            switch (movement) {
                case '+':
                    television.nextChannel(movement);
                    break;
                case '-':
                    television.previousChannel(movement);
                    break;
                case '=':
                    int definiteNumber = input.nextInt();
                    television.definiteChannel(definiteNumber);
            }
        }

//        Elevator elevator = new Elevator(random.nextInt(1, 18), 200);
//        while (true) {
//            System.out.println("\nЛифт находиться на " + elevator.getCurrentFloor() + " этаже!");
//            System.out.println("Макс. кол-во этажей, 18");
//            System.out.println("Макс. грузоподъемность 200\n");
//
//            System.out.print("Введите вес вашего груза: ");
//            elevator.setCapacity(input.nextInt());
//            System.out.println(elevator.isAllowebleWeight(elevator.getCapacity()));
//            boolean isTrue = elevator.isAllowebleWeight(elevator.getCapacity());
//            if(isTrue){
//            elevator.isAllowebleWeight(elevator.getCapacity());
//            System.out.print("Введите этаж на который вам нужно: ");
//            int actual = input.nextInt();
//            System.out.println(elevator.isAllowebleFloor(actual));
//            boolean isFloor = elevator.isAllowebleFloor(actual);
//            if(isFloor) {
//                elevator.move(actual);
//            }else {
//                System.out.println("Нет такого этажа!");
//            }
//            }else {
//                System.out.println("Перевес!");
//            }
//        }
    }
}