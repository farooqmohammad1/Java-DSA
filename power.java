import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the number that you want to know the power of that");
        int power=sc.nextInt();
        int number=n;
        //here we initialize condition i<power because we have to iterate the loop for "power-1" times
        for(int i=1;i<power;i++){
            number=number*n;
          //  System.out.println(number); if we write inside loop output is different

        }
        System.out.println(number);

        sc.close();
    }
}
