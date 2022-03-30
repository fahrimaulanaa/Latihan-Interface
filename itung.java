import java.util.Scanner;
public class itung implements Interpes{
    static Scanner SC = new Scanner(System.in);

    public void method1(){ //Mengisi method1 yang ada di class Interpes
        System.out.println("Masukkan angka pertama: ");
        int angka1 = SC.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int angka2 = SC.nextInt();
        System.out.println("Angka pertama: "+angka1);
        System.out.println("Angka kedua: "+angka2);
        int tambah = angka1 + angka2;
        int kurang = angka1 - angka2;
        int kali = angka1 * angka2;
        double bagi = angka1 / angka2;
        int modulus = angka1 % angka2;
        System.out.println("");
        System.out.println("Hasil penjumlahan: "+tambah);
        System.out.println("Hasil pengurangan: "+kurang);
        System.out.println("Hasil perkalian: "+kali);
        System.out.println("Hasil pembagian: "+bagi);
        System.out.println("Modulus: "+modulus);
}

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        
    }
}
