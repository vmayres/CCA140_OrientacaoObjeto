import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        int i = 0;
        int alt = 0;
        int upt = 0;
        while(i < 100) {
            int x = ran.nextInt(100);
            if (alt < x) {
                alt = x;
                upt++;
            }
            i++;
        }
        System.out.printf("VALOR MAIS ALTO:  %d\n O VALOR FOI ATULIZADO %d VEZES", alt, upt);
    }
}