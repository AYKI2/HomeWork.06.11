public class Elevator {
    private int currentFloor;
    private int capacity;
    private final int maxFloor = 19;

    public Elevator(int currentFloor,int capacity){
        this.currentFloor = currentFloor;
        this.capacity = capacity;
    }

    public void setCurrentFloor(int currentFloor){
        this.currentFloor = currentFloor;
    }
    int getCurrentFloor(){
        return currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void move(int actual) {
        if (capacity <= 200 && capacity > 0) {
            if (actual >= currentFloor && actual < maxFloor) {
                for (int i = currentFloor; i <= maxFloor; i++) {
                    if (i <= actual) {
                        System.out.println(i + " - этаж");
                    }
                }
                System.out.println("Вы на месте!");
            }else if (actual > 0 && actual <= currentFloor){
                for (int i = currentFloor; i > 0; i--) {
                    if(i >= actual) {
                        System.out.println(i + " - этаж");
                    }
                }
                System.out.println("Вы на месте!");
            }else {
                System.out.println("Такого этажа не существует!");
            }
            if(actual <= maxFloor && actual > 0){
                currentFloor = actual;
            }
        }else if (capacity < 0) {
            System.out.println("Груз не может быть отрицательным!");
        }else {
            System.out.println("Перевес!");
        }
    }

    boolean isAllowebleWeight(int mainCapacity){
        if(mainCapacity < 200) {
            return true;
        }else {
            return false;
        }
    }

    boolean isAllowebleFloor(int actual){
        if(maxFloor > actual) {
            return true;
        }else {
            return false;
        }

    }
}
