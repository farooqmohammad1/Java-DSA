public class adv_5 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=8-2*i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=3;i++){
            for(j=i;j<=3;j++){
                System.out.print("*");
            }
            for(j=1;j<=2*i;j++){
                System.out.print(" ");
            }
            for(j=i;j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
