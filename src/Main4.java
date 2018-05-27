public class Main4 {

    public static void main(String[] args) {
        int rub = 4532;
        int x = rub % 100;
        int y = rub % 10;
        if (x == 1 || y == 1) {
            System.out.println(rub + " рубль");
        } else if (5 > x && x > 1 || y > 1 && y < 5) {
            System.out.println(rub + " рубля");
        } else if (20 > x && x > 10 || y > 5 && y < 10) {
            System.out.println(rub + " рублей");
        }
    }
}
