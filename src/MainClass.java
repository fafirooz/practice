class OuterClass {
    void printMessage() {
        System.out.println("This is a outer class");

    }

    class InnerClass {
        void print() {
            System.out.println("This is a inner class");
        }
    }
}

public class MainClass{
    public static void main(String[] args) {
        OuterClass outerClass= new OuterClass();
        OuterClass.InnerClass innerClass= outerClass.new InnerClass();
        outerClass.printMessage();
        innerClass.print();
    }

}





