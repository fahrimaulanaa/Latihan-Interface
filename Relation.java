import java.util.*;


public class Relation {    
    static Scanner SC = new Scanner(System.in);

    //Deklarasi class baru bernama interfes
    class interfes implements Interpes{
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
            int bagi = angka1 / angka2;
            int modulus = angka1 % angka2;
            System.out.println("");
            System.out.println("Hasil penjumlahan: "+tambah);
            System.out.println("Hasil pengurangan: "+kurang);
            System.out.println("Hasil perkalian: "+kali);
            System.out.println("Hasil pembagian: "+bagi);
            System.out.println("Modulus: "+modulus);

        }

    }
    public static void main(String[] args) { 
        interfes obj = new Relation().new interfes(); //Deklarasi objek baru bernama obj
        obj.method1(); //Memanggil method1 yang ada di class interfes tetapi methodnya memiliki isi di class Relation
    }
}