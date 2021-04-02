import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = 0;
        try{
            age= Integer.parseInt(scan.nextLine());
        } catch (ArithmeticException e){
            input1(age);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Phai nhap so dang int");
        }
    }

    public static int input1(int a) {
    if(a<0) {
        throw new ArithmeticException("Phai nhap so >0");
    } else
        return a;
    }
}