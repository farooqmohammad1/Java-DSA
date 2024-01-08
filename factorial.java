//import java.math.BigInteger;
//import java.util.Scanner;
//
//public class factorial {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//         int fact=1;
//        for(int i=2;i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);
//        sc.close();
//    }
//}

//But for larger values we use BigINterger

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact);
        sc.close();
    }
}

