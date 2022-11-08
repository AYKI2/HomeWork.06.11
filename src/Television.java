public class Television {
    private int currentChannel;
    private int maxChannel;
    private String[] channels;

    public Television(int currentChannel){
        this.currentChannel = currentChannel;
    }

    public Television(int currentChannel, String[] channels){
        if(currentChannel > 0) {
            this.currentChannel = currentChannel;
        }else {
            System.out.println("Канал не может быть отрицательным!");
        }
        this.channels = channels;
        this.maxChannel = channels.length;
    }

    void setCurrentChannel(int currentChannel){
        this.currentChannel =currentChannel;
    }
    int getCurrentChannel(){
        return currentChannel;
    }

    void setMaxChannel(int maxChannel){
        this.maxChannel = maxChannel;
    }
    int getMaxChannel(){
        return maxChannel;
    }

    void printCurrentChannel(){
        System.out.println("Текущий канал: "+currentChannel);
        for (int i = 0; i < channels.length; i++) {
            if (i == currentChannel) {
                System.out.println("Название канал: " + channels[i]);
            }
        }
        System.out.println("Максимальное кол-во каналов: "+maxChannel);
    }

    void nextChannel(char movement){
        if(movement == '+') {
            if (currentChannel < maxChannel) {
                currentChannel++;
                printCurrentChannel();
            }else {
                System.out.println("Больше нет каналов!");
            }
        }
    }
    void previousChannel(char movement){
        if(movement == '-'){
            if (currentChannel > 0) {
                currentChannel--;
                printCurrentChannel();
            }else {
                System.out.println("Нет такого канала!");
            }
        }
    }
    int definiteChannel(int definiteNumber){
        if(definiteNumber <= maxChannel)
        for (int i = 0; i <= maxChannel; i++) {
            if(definiteNumber == i){
                currentChannel = i;
                printCurrentChannel();
            }
        }else{
            System.out.print("Нет канала с таким номером: ");
        }
        return definiteNumber;
    }

}
