import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, total;
        double armutFiyat = 2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5;

        Scanner input = new Scanner(System.in);
        System.out.print("Kac Kilogram Armut Aldiniz? :");
        armut = input.nextDouble();

        Scanner inp = new Scanner(System.in);
        System.out.print("Kac Kilogram Elma Aldiniz? :");
        elma = inp.nextDouble();

        Scanner girdi = new Scanner(System.in);
        System.out.print("Kac Kilogram Domates Aldiniz? :");
        domates = girdi.nextDouble();

        Scanner gir = new Scanner(System.in);
        System.out.print("Kac Kilogram Muz Aldiniz? :");
        muz = gir.nextDouble();

        Scanner inpy = new Scanner(System.in);
        System.out.print("Kac Kilogram Patlican Aldiniz? :");
        patlican = inpy.nextDouble();

        total = ((armut*armutFiyat)+(elma*elmaFiyat)+(domates*domatesFiyat)+(muz*muzFiyat)+(patlican*patlicanFiyat));

        System.out.print("Toplam Tutar: "+total);
        System.out.print(" TL");
    }
}
