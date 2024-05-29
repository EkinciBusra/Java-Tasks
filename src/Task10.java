public class Task10 {
public static void main(String[] args) {

            boolean havaGuzel = true;
            boolean yeterliPara = false;

            if (havaGuzel) {
                System.out.println("Hava güzel, dışarı çıkabiliriz!");

                if (yeterliPara) {
                    System.out.println("Ali'nin yeterli parası var, yemeğe çıkabiliriz!");
                } else {
                    System.out.println("Ali'nin yeterli parası yok, maalesef yemeğe çıkamayız.");
                }
            } else {
                System.out.println("Hava kötü, dışarı çıkmayalım.");
            }
        }
    }
