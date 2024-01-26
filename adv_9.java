public class adv_9 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //spaces
            for(int k=1;k<=8-2*i;k++){
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
