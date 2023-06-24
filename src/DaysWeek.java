import java.util.Scanner;

public class DaysWeek {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println(" Input a number between 1 to 7");
        Integer daysweek = inputNumber.nextInt();



        switch(daysweek){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Wednesday");
                break;
            case 6 :
                System.out.println("Wednesday");
                break;
            case 7 :
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("  The number is not value");



        }
    }

}
;