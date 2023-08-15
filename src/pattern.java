import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=5; j>0; j-- ){
                for(int k=0; k<=j; k++ ){
                    System.out.print(" ");
//                    System.out.print(k);
                }
                System.out.print("*");
//                for(int l=0)
                System.out.println("");
            }
            for(int j=0; j<=5; j++ ){
                for(int k=0; k<=j; k++ ){
                    System.out.print(" ");
//                    System.out.print(k);
                }
                System.out.print("*");
//                for(int l=; l>0 ;l)
                System.out.println("");
            }
        }
    }
}
