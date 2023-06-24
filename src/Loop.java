public class Loop {
    public static void main(String [] args) {
        int [] arrayList = {1,2,3,4,5,6};
        for (int i =1; i < arrayList.length; i+=1){
            System.out.println(arrayList[i]);
            for (int c= 0 ; c< arrayList.length ; c++){
                System.out.println("inner loop");
            }

        }

    }

}
