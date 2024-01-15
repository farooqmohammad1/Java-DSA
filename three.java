public class three {
    public static void main(String[] args) {

        // Add spaces for right alignment
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 4; j >= i; j--) {
        // System.out.print(" ");
        // }
        // Add a space between each number
        // for (int k = i; k >= 1; k--) {
        // System.out.print(k + " ");
        // }
        // System.out.println();
        // }

       // for (int i = 1; i <= 5; i++) {
       //     // Add spaces for right alignment
       //     for (int j = 4; j >= i; j--) {
       //         System.out.print("  ");
       //     }
       //     char alpha='A';
       //     alpha=(char)((char) 'A' +(i-1));
       //     for(int k=1;k<=i;k++){
       //         System.out.print(alpha+" ");
       //        
       //     }
       //     System.out.println();}
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print("  ");
            }
            char ch;
           
            for(int k=5;k>5-i;k--){
                ch=(char)('A'+k-1);
               System.out.print(ch+" ");
              
                
            }
            System.out.println();

        }

    }
}
