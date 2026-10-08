import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        int marks[]=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");

        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();   
        }

        System.out.println();

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}