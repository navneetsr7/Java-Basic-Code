public class calculator1 {
    public static void main(String [] args){
        int a = 6;
        int b = 2;
        int c = divide(a,b);
        System.out.println(c);
        int d = multiply(a,b);
        System.out.println(d);
    }
    public static int divide(int a , int b){
        int c = a/b;
        return c;
    }
    public static int multiply(int a , int b){
        int d = a*b;
        return d;
    }
   
}

