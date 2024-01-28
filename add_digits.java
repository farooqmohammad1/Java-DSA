public class add_digits {
    class Solution {
        public int addDigits(int num) {
            while(9<num){
                int ans=0,rem;
            while(num!=0){
                rem=num%10;
                num/=10;
                ans=rem+ans;
                
            }
            num=ans;
            }
            
           return num; 
        }
    }
}
