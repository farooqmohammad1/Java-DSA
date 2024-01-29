public class armstrong {
    static int countDigits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;

        }
        
        return count;

    }
    static boolean isArmstrong(int num,int digit){
        int n=num,ans=0,rem;
        while(n!=0){
            rem=n%10;
            n=n/10;
            ans=ans+(int)Math.pow(rem,countDigits(num));
        }
        if(ans==num){
            System.out.println("The given number is a Armstrong number");
            return true;
        }
        else {
            System.out.println("The given number is  not a Armstrong number");
            return false;
        }

        
    }
    
    public static void main(String[] args) {
        int total=countDigits(153);
        isArmstrong(153,total);
        
       

        
        
    }
}
