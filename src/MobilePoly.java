public class MobilePoly extends ComputerPoly {
    private int ID;

    @Override
    public void start() {
        System.out.println("Mobile starts:");
    }

    @Override
    public void info() {
        System.out.println("Mobile ID is:"+ ID);

    }
}
