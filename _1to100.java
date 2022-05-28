/**
 * _1to100
 */
public class _1to100 {
public static void main(String[] args) {
    printNumbers(100);	
}

public static void printNumbers(int num)
{
    if(num > 0)
    {
        System.out.print(num +" "); 
        printNumbers(num + 1);
    }	
}
    
}