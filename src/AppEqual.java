public class AppEqual {
    public static void main(String[] args) {
        LaptopPoly laptop01 = new LaptopPoly();
        LaptopPoly laptop02 = new LaptopPoly();
        laptop01.setManufacture("HP");
        laptop02.setManufacture("HP");
        System.out.println(laptop02.equals(laptop01));

    }


}

