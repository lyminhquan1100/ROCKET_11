package Question7_12;

import java.util.Scanner;

public class ScannerUtils {
    Scanner scan = new Scanner(System.in);
    int id;
    public static int inputInt(String errorMessage, int a) {
        while (true) {
            try {
                return a;
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static float inputFloat(String errorMessage, float a) {
        while (true) {
            try {
                return a;
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static double inputDouble(String errorMessage, double a) {
        while (true) {
            try {
                return a;
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static String inputString(String errorMessage, String a) {
        while (true) {
            try {
                return a;
            } catch (Exception e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static int inputAge() {
        while (true) {
            int age =0;
             age = inputInt("Wrong inputing! Please input an age as int, input again.",age);

            if (age <= 0) {
                System.err.println("Wrong inputing! The age must be greater than 0, please input again.");

            } else {
                return age;
            }
        }
    }

}
// Tim hieu lai private, public, default, protected
