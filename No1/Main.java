package No1;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan sisi 1: ");
        double side1 = myObj.nextDouble();

        System.out.print("Masukkan sisi 2: ");
        double side2 = myObj.nextDouble();

        System.out.print("Masukkan sisi 3: ");
        double side3 = myObj.nextDouble();

        System.out.print("Masukkan warna: ");
        String warna = myObj.next();

        System.out.print("Apakah terisi (true / false)? ");
        boolean terisi = myObj.nextBoolean();

        Segitiga segitigaObjek = new Segitiga(side1, side2, side3);
        segitigaObjek.setWarna(warna);
        segitigaObjek.setTerisi(terisi);

        System.out.println("\n" + segitigaObjek.toString());
        System.out.println("Luas: " + segitigaObjek.getArea());
        System.out.println("Keliling: " + segitigaObjek.getPerimeter());
        System.out.println("Warna: " + segitigaObjek.getWarna());
        System.out.println("Terisi: " + segitigaObjek.cekTerisi());

        myObj.close();
    }
}
