public class Main5 {

    public static void main(String[] args) {
        String myString = new String("Строка с символами ? и #также.");
        String newStr = myString.replace("?", "HELLO");
        String newStr1 = newStr.replace("#", "");
        System.out.println(newStr1);
    }
}
