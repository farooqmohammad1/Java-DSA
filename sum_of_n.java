import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int sum=0;//for product of n number sum=1 for addition n=0
        for(int i=1;i<=number;i++){
           // sum=sum*i;//for product sum=sum*i,for addition sum=sum+i
           sum=sum+i*i;//for square of n natural numbers
        }
        System.out.println(sum);
        sc.close();
    }
}
