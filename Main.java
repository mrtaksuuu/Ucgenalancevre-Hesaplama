import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int a, b, c, u, alan, cevre;
     Scanner kb = new Scanner(System.in);
        System.out.print(" 1. Kenarı Giriniz : ");
         a = kb.nextInt();
        System.out.print(" 2. Kenarı Giriniz : ");
         b = kb.nextInt();
        System.out.print(" 3. Kenarı Giriniz : ");
         c = kb.nextInt();
        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan =(int) Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.println("Üçgenin Alanı : " + alan);





    }
}
