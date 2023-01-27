import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dogumYili;

        String maymun = "Pratik zekalı, büyüleyici, şanslı, uyumlu, parlak, çok yönlü, canlı, akıllı.";
        String horoz = "Dürüst, enerjik, akıllı, gösterişli, rahat, farklı, kendinden emin";
        String kopek = "Sadık, hoşsohbet, cesur, gayretli, istikrarlı, canlı, uyumlu, akıllı.";
        String domuz = "Saygın, hayırsever, kararlı, iyimser, samimi, girişken.";
        String fare = "Akıllı, uyumlu, pratik zekalı, çekici, sanatsal, girişken.";
        String okuz = "Sadık, güvenilir, titiz, güçlü, makul, kararlı.";
        String kaplan = "Hırslı, cesur, iddialı, lider, özgüvenli, karizmatik.";
        String tavsan = "Güvenilir, empatik, mütevazı, diplomatik, samimi, girişken, sevecen.";
        String ejderha = "Şanslı, rahatına düşkün, yaratıcı, sanatsal, spiritüel, karizmatik.";
        String yilan = "Felsefi düşünceye yatkın, düzenli, akıllı, sezgisel, zarif, özenli, kararlı.";
        String at = "Uyumlu, sadık, cesur, hırslı, zeki, maceracı, güçlü.";
        String koyun = "Zevkli, kurnaz, sıcak, şık, sevimli, sezgisel, hassas, sakin.";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        dogumYili = input.nextInt();

        if (dogumYili % 12 == 0) {
            System.out.println("Maymun yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + maymun);
        } else if (dogumYili % 12 == 1) {
            System.out.println("Horoz yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + horoz);
        } else if (dogumYili % 12 == 2) {
            System.out.println("Köpek yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + kopek);
        } else if (dogumYili % 12 == 3) {
            System.out.println("Domuz yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + domuz);
        } else if (dogumYili % 12 == 4) {
            System.out.println("Fare yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + fare);
        } else if (dogumYili % 12 == 5) {
            System.out.println("Öküz yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + okuz);
        } else if (dogumYili % 12 == 6) {
            System.out.println("Kaplan yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + kaplan);
        } else if (dogumYili % 12 == 7) {
            System.out.println("Tavşan yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + tavsan);
        } else if (dogumYili % 12 == 8) {
            System.out.println("Ejderha yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + ejderha);
        } else if (dogumYili % 12 == 9) {
            System.out.println("Yılan yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + yilan);
        } else if (dogumYili % 12 == 10) {
            System.out.println("At yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + at);
        } else if (dogumYili % 12 == 11) {
            System.out.println("Koyun yılında doğmuşsunuz, öne çıkan özellikleriniz: \n" + koyun);
        }
    }
}