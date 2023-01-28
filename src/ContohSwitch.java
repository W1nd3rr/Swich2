
import java.util.Scanner;


public class ContohSwitch {


    public static void main(String[] args) {
        int angka,sisi;
        Scanner input = new Scanner(System.in);
        System.out.println("     Menu   ");
        System.out.println("1. L.Persegi");
        System.out.println("2. K.Persegi");
        System.out.println("3. L.Persegi Panjang");
        System.out.println("4. K.Persegi Panjang");
        System.out.println("5. L.Lingkaran");
        System.out.println("6. K.Lingkaran");
        System.out.println("Masukkan Pilihan : ");
        angka = input.nextInt();
        switch ( angka )
        {
            case 1 : 
                System.out.println("Masukkan Sisi");
                sisi = input.nextInt();
                sisi = sisi * sisi;
                System.out.println(sisi);
                break;
            case 2 :
                System.out.println("Masukkan Sisi");
                sisi = input.nextInt();
                sisi = 4 * sisi;
                System.out.println(sisi);
                break;
            case 3 :
                int p,l,hasil;
                System.out.println("Masukkan Panjang");
                p = input.nextInt();
                System.out.println("Masukkan Lebar");
                l = input.nextInt();
                hasil = p * l;
                System.out.println(hasil);
                break;
            case 4 :
                System.out.println("Masukkan Panjang");
                p = input.nextInt();
                System.out.println("Masukkan Lebar");
                l = input.nextInt();
                hasil = 2 * (p + l);
                System.out.println(hasil);
                break;
            case 5 :
                double r,h;
                System.out.println("Masukkan Jari - Jari");
                r = input.nextDouble();
                h = r * r * 3.14;
                System.out.println(h);
                break;
            case 6 :
                System.out.println("Masukkan Jari - Jari ");
                r = input.nextDouble();
                h = 2 * 3.14*r;
                System.out.println(h);
                break;
        }
    }
    
}
