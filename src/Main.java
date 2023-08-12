// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       String nm = " Akshit ";
        System.out.println(nm);
        System.out.println(nm.length());
        System.out.println(nm.trim());
        System.out.println(nm.toLowerCase());
        System.out.println(nm.toUpperCase());
        System.out.println(nm.substring(1));
        System.out.println(nm.substring(1,4));
        System.out.println(nm.replace(' ','*'));
        System.out.println(nm.startsWith("Ak"));
        System.out.println(nm.startsWith(" Ak"));
        System.out.println(nm.indexOf("s"));
        System.out.println(nm.indexOf("k",3));
        System.out.println(nm.lastIndexOf("i"));
        System.out.println(nm.equals("Akshit"));
        System.out.println(nm.equalsIgnoreCase(" AksHiT "));




    }
}