import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;

        while (right<6){

            System.out.print("Tahimininizi Giriniz :");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Lütfen 0-100 arası bir sayı giriniz .");
            }
            if (selected > 0 && selected <100){
                if (selected == number){
                    System.out.println("Tahmin Başarılı");
                    break;
                }else {
                    if (right == 5){
                        System.out.println("Game Over !");
                        break;
                    }
                    System.out.println("Tahmin Başarısız ! , Kalan tahmin hakkınız : "+(5-right));
                    if (selected<number){
                        System.out.println("Tahminini büyütün");
                    }
                    if (selected>number){
                        System.out.println("Tahimininizi Küçültün");
                    }
                }
                if (right == 4){
                    System.out.println("Son Hakkınız !");
                }
            }
        right++;
        }
        System.out.println("Sayı : "+number);
    }
}
