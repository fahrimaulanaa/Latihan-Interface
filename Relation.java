public class Relation {    

    //Deklarasi class baru bernama interfes
    class interfes{
        public void method1(){ //Mengisi method1 yang ada di class Interpes
            System.out.println("Ini contoh interface sederhana"); //Isi methodnya
        }
    }
    public static void main(String[] args) { 
        interfes obj = new Relation().new interfes();
        obj.method1();
    }
}