import java.util.*;
public class loops {
   public static void main(String[] args) {
    //int i=1;
    //while(i<5){
    //    System.out.println(i+".");
    //    i++;
    //}
    //program to find factors of a given number
   // Scanner sc=new Scanner(System.in);
   // int n=sc.nextInt();
//
   // for(int i=1;i<=n;i++){
   //     if(n%i==0){
   //       System.out.println(i);  
   //     }
   //     
   // }
    //sc.close();
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the number that you want");
    int number=sc.nextInt();
    for(int i=1;i<=number;i++){
        if(number%i==0){
            System.out.println("The total factors of"+number+"are"+i);
        }
    }
    sc.close();
   } 
}
