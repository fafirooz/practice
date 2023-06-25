public class AppPoly {
    public static void main(String[] args) {
        ComputerPoly computerPoly= new MobilePoly();
        computerPoly.start();
        computerPoly.info();
        ComputerPoly computerPoly1= new LaptopPoly();
        computerPoly1.start();
        computerPoly1.info();
    }
}
