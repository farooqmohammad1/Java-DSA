public class adv_8 {
    public static void main(String[] args) {
        int numberOfRows = 5; // You can change this value to control the number of rows

        for (int i = 0; i < numberOfRows; i++) {
            // Print spaces before the letters
            for (int j = 0; j < numberOfRows - i - 1; j++) {
                System.out.print("  ");
            }

            // Print letters in ascending order
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j) + " ");
            }

            // Print letters in descending order (excluding the first letter 'A')
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char)('A' + j) + " ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}


        //public static void main(String[] args) {
                //int numberOfRows = 5; // You can change this value to control the number of rows
        
                //for (int i = 0; i < numberOfRows; i++) {
                    // Print spaces before the letters
                  //  for (int j = 0; j < numberOfRows - i - 1; j++) {
                  //      System.out.print("  ");
                  //  }
        
                    // Print letters in ascending order
                   // for (int j = 0; j <= i; j++) {
                   //     System.out.print((char)('A' + j) + " ");
                   // }
        
                    // Print letters in descending order (excluding the first letter 'A')
                   // for (int j = i - 1; j >= 0; j--) {
                        //System.out.print((char)('A' + j) + " ");
                   // }
       //             public class AlphabetPyramid {
        
                    // Move to the next line for the next row
                 //   System.out.println();
          //      }
        //    }
       // }
        
    

