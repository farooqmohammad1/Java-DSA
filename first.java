import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        short a=sc.nextShort();
        byte b=sc.nextByte();
        long c=sc.nextLong();
        double d=sc.nextDouble();
        float e=sc.nextFloat();
        boolean f=sc.nextBoolean();
        String g=sc.nextLine();
        sc.close();

        

        // Check if the next input is an integer
        
           // int a = scn.nextInt();
           // System.out.println(a);
           // scn.close();
           //long a=1000000000000L;
           //int b=(int) a;
          // System.out.println(b);//prints random number 
           /*The code you provided attempts to assign a long value (a = 1000000000000L) to an int variable (b). The number 1000000000000L is larger than the maximum value that can be represented by an int in Java, which is 2,147,483,647.
           
           When you try to cast the long value to an int using (int) a, it results in an overflow. The overflow occurs because the long value is too large to fit into the range of representable values for an int. In Java, when an overflow happens during a narrowing primitive conversion (like casting a larger type to a smaller type), the result is the lower-order bits of the original value.
           
           So, when you print the value of b, you see a seemingly random number. It's actually the result of taking the lower 32 bits of the original long value.*/ 
           
           If you want to handle such conversions more carefully, you should check whether the long value is within the valid range for an int before performing the cast. For example:
           
           

    
       
    }
}
