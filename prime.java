import java.util.*;
public class prime {
    public static void main(String[] args) {
        //prime number
        //the number which is divisible by 1 and itself only and composite number are non prime numbers
        //1 is neither prime nor composite
        //pseudo code for prime
        //if factor_count==2 -->prime
        //else -->not prime
        //in this program we are counting number of factor of an input if input number has 2 facotrs then it is a prime else not aa prime
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        for(int i=1;i<=number;i++){
            //to count factors
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
              System.out.println(" Not a Prime number");
        }
        sc.close();


    }
    
}
