public class Computer01 implements Info {
    private int ID= 2;

    public void start(){
        System.out.println("computer starts:");
    }
    @Override
    public void info() {
        System.out.println("computer ID is:" + ID);
    }
}
