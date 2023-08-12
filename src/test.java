import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 2023;
        int m = 3;
        int d = 12;
//        int y = sc.nextInt();
//        int m = sc.nextInt();
//        int d = sc.nextInt();
        int x = 2%7;
        System.out.println(x);














        int m1=0;

        if (m==3){
//            System.out.println("stage one complete");
            int f = y%4;
            int g = 0;
            if (f == 0) {
                g = 1;
            }
            System.out.println(f);
            System.out.println(g);

            m1 = m1+31+28+g;

            int dn = (d+m1)%7;
//              dn = day number
//            System.out.println(dn);
//            System.out.println("stage two complete");
            if (dn==1){
                System.out.println("Sunday");
            }
            else if (dn==2){
                System.out.println("Monday");
            }
            else if (dn==3){
                System.out.println("Tuesday");
            }
            else if (dn==4){
                System.out.println("Wednesday");
            }
            else if (dn==5){
                System.out.println("Thrusday");
            }
            else if (dn==6){
                System.out.println("Friday");
            }
            else if (dn==0){
                System.out.println("Saturday");}
        }

























    }
}
