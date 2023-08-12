import java.util.Objects;
import java.util.Scanner;
public class prjt_4_clone_ForOnly2023 {
    public static void main(String[] args) {
        System.out.println("Hii\nHere you can know the day of the provided date\n");
        Scanner sc = new Scanner(System.in);

//        year input
        System.out.println("please provide the 'YEAR' of your respective date\nexample: 2023,2024 ");
        int y = sc.nextInt();
//        month input
        System.out.println("please provide the 'MONTH in numbers' of your respective date \nexample: for March type 3 ");
        byte m = sc.nextByte();
//        day input
        System.out.println("please provide the 'DATE' of your respective date \nexample: 28,31");
        byte d = sc.nextByte();

//        date output
        System.out.println(" \nYour respective date is: "+d+"/"+m+"/"+y);
//        seeking permission to go forward
        System.out.println("\nWould you like to continue to see the day of this date\ntype yes or no");
        String a = sc.next();
        if (Objects.equals(a, "yes")) {
            if (y==2023){
                int m1 = 0;
//                m1 is for adding days of previous months


//                </* MONTHS */>
                int g = 0;
                int f = y/4;
//              g is for adding extra day of february in leap years
                if (f==0){
                    g = 1;
                }

//                #February
                if (m==2){
                    m1 = m1+31;
                }

//                # March

                if (m==3){
                    m1 = m1+31+28+g;

                }

//                # April
                if (m==4){
                    m1 = m1+31+28+g+31;
                }

//                # May
                if (m==5){
                    m1 = m1+31+28+g+31+30;
                }

//                # June
                if (m==6){
                    m1 = m1+31+28+g+31+30+31;
                }

//                # July
                if (m==7){
                    m1 = m1+31+28+g+31+30+31+30;
                }

//                # August
                if (m==8){
                    m1 = m1+31+28+g+31+30+31+30+31;
                }

//                # September
                if (m==9){
                    m1 = m1+31+28+g+31+30+31+30+31+31;
                }

//                # October
                if (m==10){
                    m1 = m1+31+28+g+31+30+31+30+31+31+30;
                }

//                # November
                if (m==11){
                    m1 = m1+31+28+g+31+30+31+30+31+31+30+31;
                }

//                # December
                if (m==12){
                    m1 = m1+31+28+g+31+30+31+30+31+31+30+31;
                }
//                System.out.println(m1);


//                </* DAYS */>

                int dn = (d+m1)%7;
//                    dn = day number
//                System.out.println("day number: "+dn);

                System.out.println("\n\nDay of your respective date is :");
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
                    System.out.println("Saturday");
                }

            }
        }


    }
}
