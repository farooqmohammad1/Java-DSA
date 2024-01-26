public class binary {
    public static void main(String[] args) {
        //Decimal to Octal
       // int num=22;
       // int ans=0,rem,mul=1;
       // while(num>0){
       //     rem=num%8;
       //     num=num/8;
       //     ans=rem*mul+ans;
       //     mul=mul*10;
       // }
       // System.out.println(ans);

      // //Decimal to Binary
      // int num=13;
      // int ans=0,mul=1;
      // int rem;
      // while(num>0){
      //  rem=num%2;
      //  num=num%2;
      //  ans=rem*mul+ans;
      //  mul=mul*10;
//
      // }
//
       //Binary to  Decimal
      // int num=1101;
      // int ans=0,rem,mul=1;
      // while(num>0){
      //  rem=num%10;
      //  num=num/10;
      //  ans=rem*mul+ans;
      //  mul=mul*2;
      // }
      // System.out.println(ans);
     

      //Binary to Octal
                    //1)Binary to Decimal
      //2)Decimal to Binary

      //Binary to Decimal using for loop
      //int ans=0,rem,mul=1;
      //for(int num=1101;num>0;mul=mul*2){
      //  rem=num%10;
      //  num=num/10;
      //  ans=rem*mul+ans;
      //}
      //System.out.print(ans);

      //Decimal to Binary using for loop
      int ans=0,rem,mul=1;
      for(int num=13;num>0;mul=mul*10){
        rem=num%2;
        num=num/2;
        ans=rem*mul+ans;
      }
      System.out.print(ans);



       
    }
}
