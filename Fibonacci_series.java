import java.util.*;
public class Fibonacci_series {
    public static void main(String[] args) {
        //Fibonacci Series is 0,1,1,2,3,5,8,....means 0+1=1,1+1=2,2+1=3,3+2=5,5+3=8....
        /*int last=0,prev=1,curr;
        for(int i=1;i<=10;i++){
            curr=last+prev;
            System.out.println(curr);
            last=prev;
            prev=curr;
            
             DRY RUN :
             last prev curr
             0     1    1
             1     1    2
             1     2    3
             2     3     5
             
             */
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter a number");
            int number=sc.nextInt();
            int last_value=0,prev_value=1,current_value;
            for(int i=1;i<=number;i++){
                current_value=last_value+prev_value;
                System.out.println(current_value);
                last_value=prev_value;
                prev_value=current_value;
            }
            sc.close();
            
        }
    }

