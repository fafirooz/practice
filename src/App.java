public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.motherboard= "bb";
        computer1.ram= 124;
        computer1.cpu= "core5";
        computer1.gpu= "nvidia"

        System.out.println(computer1.ram);
    }
}
