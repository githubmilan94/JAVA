package strings;

public class FizzBuzz {

    public static void main(String[] args) {
        int n = 100;
        for (int i=1;i<=n;i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FIZZBUZZ!");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ!");
            } else if(i % 3 == 0){
                System.out.println("FIZZ!");
            }else {
                System.out.println(i + " ");
            }
        }
    }
}
