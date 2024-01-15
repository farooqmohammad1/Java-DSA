import java.util.*;
public class adv_3 {
    public static void main(String[] args) {
        int i,j;
        //for(i=1;i<=5;i++){
        //    for(j=1;j<i;j++){
        //        System.out.print("  ");
        //    }
        //    for(j=9;j>=2*i-1;j--){
        //        System.out.print("*"+" ");
        //    }
        //    for(j=1;j<i;j++){
        //        System.out.print("  ");
        //    }
        //    System.out.println();
        //}
        //for(i=9;i>=1;i--){
        //    for(j=1;j<=(9-(2*i-1))/2;j++){
        //        System.out.print(" ");
        //    }
        //    for(j=1;j<=2*i-1;j++){
        //        System.out.print("*"+" ");
        //    }
        //    for(j=1;j<=(9-(2*i-1))/2;j++){
        //        System.out.print(" ");
        //    }
        //    System.out.println();
        //}
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            
        }
        sc.close();
    }
}
