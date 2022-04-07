//Import module 
import java.util.Scanner;
import java.io.Console;


public class itung implements Interpes {

    //Deklarasi scanner input
    static Scanner SC = new Scanner(System.in);

    //Deklarasi console untuk input menggantikan scanner
    Console con = System.console();

    public void method1(){ 
        
        //Mengisi method1 yang ada di class Interpes
        System.out.println("Masukkan angka pertama: ");
        int angka1 = SC.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int angka2 = SC.nextInt();
        System.out.println("Angka pertama: "+angka1);
        System.out.println("Angka kedua: "+angka2);
        int tambah = angka1 + angka2;
        int kurang = angka1 - angka2;
        int kali = angka1 * angka2;
        double bagi = angka1 / angka2; //Menggunakan double karena bisa saja hasil bagi ada koma
        int modulus = angka1 % angka2;
        System.out.println("");

        //Menampilkan hasil dari operasi aritmatika diatas
        System.out.println("Hasil penjumlahan: "+tambah);
        System.out.println("Hasil pengurangan: "+kurang);
        System.out.println("Hasil perkalian: "+kali);
        System.out.println("Hasil pembagian: "+bagi);
        System.out.println("Modulus: "+modulus);
}

    @Override
    public void method2() {

        //Deklarasi input untuk menentukan isi variabel
        System.out.println("");
        System.out.println("Masukkan nama anda: ");
        String nama =con.readLine(); //Menggunakan console input agar bisa input nama panjang
        System.out.println("Masukkan NISN: ");
        int nisn = SC.nextInt(); //Menggunakan scanner karena inputan bisa berupa angka
        System.out.println("Masukkan asal sekolah: ");
        String sekolah = con.readLine(); //Menggunakan console input agar bisa input nama panjang
        System.out.println("Masukkan jurusan: ");
        String jurusan = SC.next();
        System.out.println("");

        //Menampilkan output dari method2
        System.out.println("Data anda: ");
        System.out.println("Nama: "+nama);
        System.out.println("NISN: "+nisn);
        System.out.println("Asal sekolah: "+sekolah);
        System.out.println("Jurusan: "+jurusan + "\n");
    }

    @Override
    public double berat(){

        //Menentukan input
        System.out.println("Masukkan berat badan orang pertama: ");
        double berat1 = SC.nextDouble();
        System.out.println("Masukkan berat badan orang kedua: "); 
        double berat2 = SC.nextDouble();
        System.out.println("Masukkan berat badan orang ketiga: ");
        double berat3 = SC.nextDouble();
        System.out.println("Masukkan berat badan orang keempat: ");
        double berat4 = SC.nextDouble();
        System.out.println("\n");

        //Menampilkan output
        System.out.println("Berat orang pertama: "+berat1);
        System.out.println("Berat orang kedua: "+berat2);
        System.out.println("Berat orang ketiga: "+berat3);
        System.out.println("Berat orang keempat: "+berat4);   
        double ratarata;
        ratarata = ((berat1 +berat2 + berat3 +berat4) / 4); 
        System.out.println("Rata rata berat badan: "+ratarata);
        return 0;
    }
}
