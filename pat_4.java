public class pat_4 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){ 
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
            System.out.print((char) ('A' + i - 1) + " ");
           
                }
               
            System.out.println();

            }
        }
        //int n = 5; // Number of rows
//
        //for (int i = 1; i <= n; i++) {
//
        //    // Inner loop for spaces
        //    for (int j = n - i; j > 0; j--) {
        //        System.out.print("  ");
        //    }
//
        //    // Inner loop for characters
        //    for (int k = 'E'; k >= 'E' - i + 1; k--) {
        //        System.out.print((char) k + " ");
        //    }
//
        //    // Move to the next line after each row
        //    System.out.println();
        //}
    }//

