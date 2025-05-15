import java.util.Scanner;
public class lab1{
    public static void main (String[]args){
        int first ,second,sum,subtract,divide,multiply;
        Scanner scanner =new Scanner (System.in);
        System.out.println("enter two numbers");
        first= scanner.nextInt();
        second= scanner.nextInt();
        sum = first+second;
        subtract = first-second;
        multiply = first*second;
        divide = first/second;
        System.out.println("sum="+sum);
        System.out.println("difference="+subtract);
        System.out.println("product="+multiply);
        System.out.println("quatient="+divide);


    }
}