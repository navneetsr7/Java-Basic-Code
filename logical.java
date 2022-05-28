import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        // conditional statement
        Scanner sc = new Scanner(System.in);
        // pen = 10Rs, Notebook = 40
        int cash = sc.nextInt();
        if(cash<10){
            System.out.println("can't buy anything");
            System.out.println("get more cash");
        }

         else if (cash>10 && cash<50){
        System.out.println("can you buy 1 thing");
     }
         else
        System.out.println("can you buy both");
    }
    
}
