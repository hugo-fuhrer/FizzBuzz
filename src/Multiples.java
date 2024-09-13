public class Multiples {
    public static void main(String[] args) {
        //Multiples of 3 and 5 under 1000
        int c = 0;

        for (int i = 0; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                c++;
            }
        }
        System.out.println(c);


    }
}
