import java.util.*;
public class patrn_9{
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        for(i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n)  stars=2*n-i;
            for(j=1;j<=stars;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();

            }
        }
    
