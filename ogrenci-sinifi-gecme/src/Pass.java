import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {

        /* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

           Geçme Notu : 55

           Ödev:  Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
        */


        Scanner input = new Scanner(System.in);

        double matvize, fizikvize, turkcevize, kimyavize, muzikvize;
        double matfinal, fizikfinal, turkcefinal, kimyafinal, muzikfinal;
        double matOrt, fizikOrt, turkceOrt, kimyaOrt, muzikOrt;

        double gecisNotu = 50;


        System.out.print("Matematik vize notu:");
        matvize = input.nextDouble();
        System.out.print("Matematik final notu:");
        matfinal = input.nextDouble();

        if (matvize <= 0 || matvize > 100 || matfinal <= 0 || matfinal > 100) {
            System.out.println("Geçersiz değer girdiniz!! Not hesaplanamazz!!");
        }
        matOrt = (matvize * 0.4) + (matfinal * 0.6);
        System.out.println("Matematik Ortalamanız: " + matOrt);

        System.out.println("------------------------------------");

        System.out.print("Fizik vize notu:");
        fizikvize = input.nextDouble();
        System.out.print("Fizik final notu:");
        fizikfinal = input.nextDouble();

        if (fizikvize <= 0 || fizikvize > 100 || fizikfinal <= 0 || fizikfinal > 100) {
            System.out.println("Geçersiz değer girdiniz!! Not hesaplanamazz!!");
        }

        fizikOrt = (fizikvize * 0.4) + (fizikfinal * 0.6);
        System.out.println("Fizik Ortalamanız: " + fizikOrt);

        System.out.println("------------------------------------");

        System.out.print("Türkçe vize notu:");
        turkcevize = input.nextDouble();
        System.out.print("Türkçe final notu:");
        turkcefinal = input.nextDouble();

        if (turkcevize <= 0 || turkcevize > 100 || turkcefinal <= 0 || turkcefinal > 100) {
            System.out.println("Geçersiz değer girdiniz!! Not hesaplanamazz!!");
        }

        turkceOrt = (turkcevize * 0.4) + (turkcefinal * 0.6);
        System.out.println("Türkçe Ortalamanız: " + turkceOrt);

        System.out.println("------------------------------------");

        System.out.print("Kimya vize notu:");
        kimyavize = input.nextDouble();
        System.out.print("Kimya final notu:");
        kimyafinal = input.nextDouble();

        if (kimyavize <= 0 || kimyavize > 100 || kimyafinal <= 0 || kimyafinal > 100) {
            System.out.println("Geçersiz değer girdiniz!! Not hesaplanamazz!!");
        }

        kimyaOrt = (kimyavize * 0.4) + (kimyafinal * 0.6);
        System.out.println("Kimya Ortalamanız: " + kimyaOrt);

        System.out.println("------------------------------------");

        System.out.print("Müzik vize notu:");
        muzikvize = input.nextDouble();
        System.out.print("Müzik final notu:");
        muzikfinal = input.nextDouble();

        if (muzikvize <= 0 || muzikvize > 100 || muzikfinal <= 0 || muzikfinal > 100) {
            System.out.println("Geçersiz değer girdiniz!! Not hesaplanamazz!!");
        }

        muzikOrt = (muzikvize * 0.4) + (muzikfinal * 0.6);
        System.out.println("Müzik Ortalamanız: " + muzikOrt);

        System.out.println("------------------------------------");

        if (matOrt < gecisNotu) {
            System.out.println("Matematik'ten Büte kaldınız!! Notunuz: " + matOrt);
        } else {
            System.out.println("Matematik'ten geçtiniz. Notunuz: " + matOrt);
        }

        if (fizikOrt < gecisNotu) {
            System.out.println("Fizik'ten Büte kaldınız!! Notunuz: " + fizikOrt);
        } else {
            System.out.println("Fizik'ten geçtiniz. Notunuz: " + fizikOrt);
        }

        if (turkceOrt < gecisNotu) {
            System.out.println("Türkçe'den Büte kaldınız!! Notunuz: " + turkceOrt);
        } else {
            System.out.println("Türkçe'den geçtiniz. Notunuz: " + turkceOrt);
        }

        if (kimyaOrt < gecisNotu) {
            System.out.println("Kimya'dan Büte kaldınız!! Notunuz: " + kimyaOrt);
        } else {
            System.out.println("Kimya'dan geçtiniz. Notunuz: " + kimyaOrt);
        }

        if (muzikOrt < gecisNotu) {
            System.out.println("Müzik'ten Büte kaldınız!! Notunuz: " + muzikOrt);
        } else {
            System.out.println("Müzik'ten geçtiniz. Notunuz: " + muzikOrt);
        }

        System.out.println("--------------------------------------------");

        double sinifGecme = (matOrt + fizikOrt + turkceOrt + kimyaOrt + muzikOrt) / 5;
        System.out.println("Sınıf Geçme Notunuz: " + sinifGecme);

        if (sinifGecme <= 55) {
            System.out.println("Sınıfta Kaldınız!!! Seneye Görüşürüz..");
        } else {
            System.out.println("Tebrikler Sınıfı Geçtiniz!!!");
        }
    }
}


