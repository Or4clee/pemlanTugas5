package pemlanTugas5;

public class Aritmatika {
    public void hitungPenjumlahan(int a,int b){
        int nilai = a+b;
        System.out.println("nilai penjumlahan adalah : "+nilai);
        hitungPerkalian(a, b);
    }
    
    public static void hitungPerkalian(int a, int b){
        int nilai = a*b;
        System.out.println("nilai perkalian adalah : "+nilai);
    }

    public static void hitungPengurangan(int a, int b){
        int nilai = a-b;
        System.out.println("nilai pengurangan adalah : "+nilai);
    }

    public double hitungPembagian(String nil, String nil2){
        double nilai1 = Double.parseDouble(nil);
        double nilai2 = Double.parseDouble(nil2);

        if (nilai2 == 0) {
            System.out.println("Tidak bisa membagi dengan Nol!");
        }

        return nilai1 / nilai2;
    }
}