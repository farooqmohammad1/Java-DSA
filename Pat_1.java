public class Pat_1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            char name='A';
            name=(char) ('A'+i-1);
            for(j=1;j<=i;j++){
                System.out.print(name+" ");

            }
            System.out.println();
        }
    }
}
