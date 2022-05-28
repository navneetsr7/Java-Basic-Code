import java.util.Arrays; 


public class maim {
    public static void main (String[] args){
        int age = 54;
        int physics= 95;
        int english= 68;
        int chemistry = 69;

        int[] marks = new int[3];
        // float[] marks = new float[3];
        // boolean[] marks = new boolean[3];
        marks[0]= 95;
        marks[1]= 68;
        marks[2]= 69;
        
        // length
        // System.out.println(marks.length);

        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);






    }
}
