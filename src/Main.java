import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        int mat = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        int fizik = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        int kimya = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        int turkce = input.nextInt();
        System.out.print("Tarih Notunuz: ");
        int tarih = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        int muzik = input.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = (double)toplam / 6.0;
        boolean kosul = sonuc == 60.0 || sonuc > 60.0;
        String str = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);

    }
}
