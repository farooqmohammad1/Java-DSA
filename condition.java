import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("please enter your age");
        // int age=sc.nextInt();
        // if(age>=18){
        // System.out.println("You are eligible for vote");
        // }
        // else{
        // System.out.println("You are not eligible");
        // }

        // System.out.println("please enter your marks");
        // int marks=sc.nextInt();
        // if(marks>=90){
        // System.out.println("Grade is A");
        // }
        // else if(marks>=80){
        // System.out.println("Your Grade is B");
        // }
        // else{
        // System.out.println("Your Grade is C");
        // }

        // System.out.println("Enter your number");
        // int num=sc.nextInt();
        // if(num%2==0){
        // System.out.println(num+"is a even number");
        // }
        // else {
        // System.out.println(num+"is a odd number");
        // }
        // System.out.println("Enter number");
        // int num=sc.nextInt();
        // if(num%2==0 || num%3==0){
        // System.out.println("yes divisible");
        // }
        // else{
        // System.out.println("Not divisible");
        // }(
        System.out.println("Enter three number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " " + "is greater number 1");
        } else if (b > a && b > c) {
            System.out.println(b + " " + "is greater number 2");
        } else {
            System.out.println(c + " " + "is greater number 3");
        }
        sc.close();
    }
}