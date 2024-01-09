import java.util.*;
public class adv_pattern {
    public static void main(String[] args) {
       // for (int i = 1; i <= 5; i++) {
//
       //     //space print
       //     for (int j = 1; j <= 5 - i; j++) {
       //         System.out.print(" ");
       //     }
       //     //star print
       //     for (int j = 1; j <= i; j++) {
       //         System.out.print("*");
       //     }
       //     System.out.println();
//
       // }

       //same by taking input from user

     //  Scanner sc=new Scanner(System.in);
     //  System.out.println("Enter a number");
     //  int n=sc.nextInt();
     //  for(int i=1;i<=n;i++){
     //   for(int j=1;j<=n-i;j++){
     //       System.out.print(" ");
     //   }
     //   for(int k=1;k<=i;k++){
     //       System.out.print("*");
     //   }
     //   System.out.println();
     //  }
     //  sc.close();
     for(int i=1;i<=4;i++){
        for(int j=1;j<=4-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
            System.out.println();
        }
        System.out.println();
     }
    }
}
