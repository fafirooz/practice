public class Computer {
    int ram;
    String motherboard;
    String cpu;
    String gpu;


    public Computer(){
        System.out.println("This computer is:");
    }

    public Computer(String cpu01){
        this.cpu= cpu01;
        System.out.println("The type of cpu is:" + cpu01);
    }

    void info() {
        System.out.println("the ram is:" + cpu + " the motherboard is:" + motherboard);

    }

    String show() {
        return "the ram is:" + ram + " the motherboard is:" + motherboard;

    }

    int addition(int firstNumber, int secoundNumber) {
        return firstNumber + secoundNumber;

    }
}
