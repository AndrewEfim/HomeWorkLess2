public class Main3 {

    public static void main(String[] args) {

        int a = 5; // ширина прямоугольника 
        int b = 8; // длинна прямоугольника
        int r = 2; // радиус круга
        double gipotinuza = Math.sqrt(Math.pow((a / 2), 2) + Math.pow((b / 2), 2));
        int gip = (int) gipotinuza;

        if (r >= gip) {
            System.out.println("Кругом можно закрыть прямоугольное отверствие");
        } else {
            System.out.println("Кругом нельзя закрыть прямоугольное отверствие");
        }
    }
}
