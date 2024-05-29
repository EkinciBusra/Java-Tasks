public class Task11 {
 public static void main(String[] args) {

            int a = 5;
            int b = 8;
            int c = 12;

            boolean ifade1 = (a + b + c == 25);
            boolean ifade2 = (a + b > c);
            boolean ifade3 = ((a * a) < b);
            boolean ifade4 = ((a < b && b < c) || (c < b && b < a));
            boolean ifade5 = (c > (a + b ));

            System.out.println("a, b ve c'nin toplamı 25'e eşit mi? " + ifade1);
            System.out.println("a ve b'nin toplamı c'den büyük mü? " + ifade2);
            System.out.println("a'nın karesi b'den küçük mü? " + ifade3);
            System.out.println("b, a ve c arasında ortanca değer mi? " + ifade4);
            System.out.println("c, a ve b'nin toplamından küçük mü? " + ifade5);
        }
    }
