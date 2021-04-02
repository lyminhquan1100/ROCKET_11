import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = 0;
        while (true) {
            try {
                age = Integer.parseInt(scan.nextLine());
            } catch (ArithmeticException e) {
                input1(age);
            } catch (NumberFormatException e) {
                System.out.println("Phai nhap so dang int");
                age = Integer.parseInt(scan.nextLine());
            }

        }
    }


    public static int input1(int a) {
        if(a<0) {
            throw new ArithmeticException("Phai nhap so >0");
        } else
            return a;
    }
}