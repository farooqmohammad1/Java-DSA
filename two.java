public class two {
    public static void main(String[] args) {
        // for(int i=1;i<=6;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // for(int i=1;i<=5;i++){
        // char name='A';
        // for(int j=1;j<=i;j++){
        //
        // System.out.print(name+" ");
        // name=(char) ((char) 'A'+j);
        //
        //
        // }
        // System.out.println();
        // }

      //  for (int i = 10; i <= 16; i++) {
      //      for (int j = 10; j <= i; j++) {
      //          System.out.print(j + " ");
      //      }
      //      System.out.println();
      //  }

      for(int i=4;i>=1;i--){
        char ch='A';
        for(int j=1;j<=i;j++){
            System.out.print(ch+" ");
            ch=(char)((char)'A'+j);
            
        }
        System.out.println();
      }
    }
}
