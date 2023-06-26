public class App {
    public App() {
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer(" core12");

        computer1.motherboard= "bb";
        computer1.ram= 124;
        computer1.cpu= "core5";
        computer1.gpu= "nvidia";
        
        computer1.info();
        int resultAddition= computer1.addition(5,7);

        String returnvalue = computer1.show();

        System.out.println(resultAddition);
        System.out.println(returnvalue);
        System.out.println(computer1.ram);

    }
}
