import javax.sound.midi.Soundbank;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        maxMinFourNumber(scan);
    }

    //Question 1: Nhap cm in ra foot va inch

    public static void changeUnits(Scanner scan) {
        System.out.printf("Nhap cm can doi: ");
        double cm = Integer.parseInt(scan.nextLine());

        double inch = cm / 2.54;
        double foot = cm * (25 / 762);

        System.out.println("So inch la: " + inch + "\n" + "So foot la: " + foot);
    }

//    Question 2: Viet chuong trinh nhap vao so giay tu 0 toi 68399, doi so giay nay thanh dang [gio : phu : giay]
//    moi thanh phan la mot so nguyen co 2 chu so

    public static void condition(Scanner scan) {
        int s;
        do {
            System.out.printf("Nhap lai gia tri cua s: ");
            s = Integer.parseInt(scan.nextLine());
        } while (s > 0 && s < 68399);
    }

    public static void changeTime(Scanner scan, int s) {
        int hour;
        int minute;
        int second;

        hour = s / 60;
        minute = (s - hour * 60) / 60;
        second = s - hour * 60 - minute * 60;

        System.out.println("Thoi gian doi duoc la: " + hour + ":" + minute + ":" + second);
    }



    // Question 3: Nhap vao 4 so nguyen. Hien thi ra so lon nhat va so nho nhat
    public static void maxMinFourNumber(Scanner scan) {
        int a[] = new int[4];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Nhap vao so thu " + i + ": ");
            a[i] = Integer.parseInt(scan.nextLine());
        }

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("So be nhat la " + min);
        System.out.println("So lon nhat la " + max);
    }

    // Question 4: nhap vao 2 so a va b. Tinh hieu = a-b. Neu hieu >0 thi in so thu nhat lon hon so thu 2 va nguoc lai
    public static void Subtraction(Scanner scan) {
        System.out.printf("Nhap vao so a: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.printf("Nhap vao so b: ");
        int b = Integer.parseInt(scan.nextLine());
        int c = a-b;
        if(c>0) {
            System.out.println("So thu nhat lon hon so thu hai");
        } else {
            System.out.println("So thu hai lon hon so thu nhat");
        }
    }

    // Question 5: Nhap vao 2 so a va b. Kiem tra xem a chia het cho b khong
    public static void divisible(Scanner scan) {
        System.out.printf("Nhap vao so a: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.printf("Nhap vao so b: ");
        int b = Integer.parseInt(scan.nextLine());
        if (a%b==0){
            System.out.println("a chia het cho b");
        }
    }

    // Question 6: Xep loai sinh vien
    public static void xepLoai(Scanner scan) {
        System.out.printf("Nhap diem mon toan: ");
        int t = Integer.parseInt(scan.nextLine());
        System.out.printf("Nhap diem mon ly: ");
        int l = Integer.parseInt(scan.nextLine());
        System.out.printf("Nhap diem mon hoa: ");
        int h = Integer.parseInt(scan.nextLine());
    }










    public static void in_a(Scanner scan) {
        int n;
        System.out.printf("Nhap vao gia tri cua n: ");
        n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("#");
            }
            System.out.printf("\n");
        }
    }

    public static void in_b(Scanner scan) {
        int n;
        System.out.printf("Nhap vao gia tri cua n: ");
        n = Integer.parseInt(scan.nextLine());
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.printf("# ");
            }
            System.out.printf("\n");
        }
    }

    public static void in_c(Scanner scan) {
        int n;
        System.out.printf("Nhap vao gia tri cua n: ");
        n = Integer.parseInt(scan.nextLine());
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("#");
            }
            System.out.printf("\n");
        }
    }

    public static void in_d(Scanner scan) {
        int n;
        System.out.printf("Nhap vao gia tri cua n: ");
        n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("#");
            }
            System.out.printf("\n");
        }
    }

}
