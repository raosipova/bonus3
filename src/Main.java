public class Main {
    public static void main(String[] args) {

        int account = 100;
        int bonusScale = 100;
        int uploadVolume = 2000;
        int bonus;
        if (uploadVolume >= 1000) {
            bonus = uploadVolume / bonusScale;
        } else {
            bonus = 0;
        }
        int totalAccount = account + uploadVolume + bonus;
        System.out.println("Пополнили счет" + uploadVolume + "руб.");
        System.out.println("Бонус составил" + bonus + "руб.");
        System.out.println("Ваш балланс" + totalAccount + "руб.");
    }
}
