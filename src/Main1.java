public class Main1{

    public static void main(String[] args) {

        String Str1 = new String("���������� ���� ������");// ������� ���������� ���� ������
        System.out.println("���������� �������� � ������=" + Str1.length());// ������� �� ����� ���-�� ��������
        int mid = (Str1.length()) / 2; // ������� �������� ������
        String Strpart1 = Str1.substring(0, mid);//��������� �� �����
        String Strpart2 = Str1.substring(mid);//     
        System.out.println(Strpart1); // ������ ����� ������
        System.out.println(Strpart2); // ������ ����� ������
    }
}
