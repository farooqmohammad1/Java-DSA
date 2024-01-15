public class metho {
    public static void main(String[] args) {
        int a =10;int b=20;
        swap(a,b);
       swap(10,20); 
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.print(a+" "+b+" ");
    }
    
}
