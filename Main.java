public class Main {

    /*
    Kod Bloklarındaki ve Metodlardaki Lokal Değişkenler
    lokal değişken -> tanımlandıgı kod bloduna özeldir. Başka kod blogunda kullanılamaz.

     */


    public static void toplama ( int x, int y , int z) {
        int deneme =12 ;

        System.out.println("Toplama Sonucu :" + ( x + y + z));
    }

    public static void main (String [] args) {



        int a = 4;       // main metoduna özel bir değişkendir. Main metodu içerisinde (main süslü parantezi içerisinde ) heryerde çağırılıp kullanılabilir.
        String yazdir = "Merhaba";

        if (a < 10) {

            int b = 0;  // buradaki b değişkeni lokal bir değişkendir. Sadece buradaki if kod bloguna özgüdür.

            System.out.println(yazdir);

        }

        // Bir örnek daha.


        int i = 1 ;

        while ( i < 10 ){

            if ( i % 2 == 0) {

                String sonuc = "Çift" ;
                System.out.println(sonuc);

            }
            i++;

            // System.out.println(sonuc); burada sonuc yazdıramayız. Çünkü sonuc değişkeni if kod blogunun local değişkeni
        }


        System.out.println("*************************");

        toplama(10,20,30);
        // System.out.println(x);   x değişkeni toplama fonksyonun lokal değğişkeni ( parametresi) oldugu için burada çağıramayız.
        // System.out.println(deneme);  deneme değişkeni toplama fonksyonun lokal değğişkeni  oldugu için burada çağıramayız.

    }
}
