public class Task9 {
    public static void main(String[] args) {
            double urunFiyati = 123.456;
            int tamSayiFiyat = (int) urunFiyati;
            double birikimler = 789.123;

            byte veliBirikimleri = (byte) birikimler;

            double toplamFiyat = urunFiyati + birikimler;

            System.out.println("Ali'nin ürün fiyatı (tam sayı): " + tamSayiFiyat + " TL");
            System.out.println("Veli'nin birikimleri (byte cinsinden): " + veliBirikimleri);
            System.out.println("Ali ve Veli'nin toplam fiyatı: " + toplamFiyat + " TL");
        }
    }
