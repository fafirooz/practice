public class Application {
    public static void main(String[] args) {
        String text = new String();
        text= "Hello";
        System.out.println(text);

        String text02 = text +" "+ "baby";
        String text03= text.concat(" "+ "baby");
        if(text02.equals(text03)){
            System.out.println("They are equal");
        }
        System.out.println(text02);
        System.out.println(text03);



    }
}
