import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sort(scan);
    }

    // QUESTION 1: Liet ke cac phan tu xuat hien dung 1 lan
    public static void ques3(Scanner scan) {
        System.out.printf("Nhap so phan tu co trong day:  ");
        int n = Integer.parseInt(scan.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int pt : arr) {
            System.out.print(pt + "\t");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println("So " + arr[i] + " xuat hien " + (count + 1) + " lan");
                count = 0;
            }
        }
        System.out.println("So " + arr[arr.length - 1] + " xuat hien " + (count + 1) + " lan");
    }

    // QUESTION 2:
    public static void ques2(Scanner scan) {

        System.out.printf("Nhap so phan tu co trong day:  ");
        int n = Integer.parseInt(scan.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int pt : arr) {
            System.out.print(pt + "\t");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    System.out.println("So " + arr[i] + " xuat hien " + (count + 1) + " lan");
                }
                count = 0;
            }
        }
    }

    // QUESTION 1:
    public static void ques1(Scanner scan) {
        System.out.printf("Nhap so phan tu co trong day:  ");
        int n = Integer.parseInt(scan.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int pt : arr) {
            System.out.print(pt + "\t");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 0) {
                    System.out.println("So " + arr[i] + " xuat hien " + (count + 1) + " lan");
                }
                count = 0;
            }
        }
        if (count == 0) {
            System.out.println("So " + arr[arr.length - 1] + " xuat hien " + (count + 1) + " lan");
        }
    }

    // QUESTION 4: VIET CHUONG TRINH TINH TONG CAC CHU SO CUA MOT SO NGUYEN BAT KY
    public static void sum(Scanner scan) {
        int s = 0;
        int temp;
        System.out.printf("Nhap vao mot so nguyen bat ky: ");
        int n = Integer.parseInt(scan.nextLine());
        for (; n != 0; ) {
            temp = n % 10;
            s += temp;
            n /= 10;
        }
        System.out.println(s);
    }

    //QUESTION 5: VIET CHUONG TRINH PHAN TICH 1 SO NGUYEN THANH CAC THUA SO NGUYEN TO
    public static void prime5(Scanner scan) {
        System.out.printf("Nhap vao mot so nguyen bat ky: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                if (i < n) {
                    System.out.print("x");
                }
                n /= i;
            }
        }
    }

    //QUESTION 6: VIET CHUONG TRINH LIET KE TAT CA SO NGUYEN TO NHO HON N CHO TRUOC
    public static void prime6(Scanner scan) {
        int count = 0;
        System.out.printf("Nhap vao mot so nguyen bat ky: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + "\t");
            }
            count = 0;
        }
    }

    //QUESTION 7: VIET CHUONG TRINH LIET KE N SO NGUYEN TO DAU TIEN
    public static void prime7(Scanner scan) {
        int count = 0;
        int temp = 0;
        System.out.printf("Nhap vao mot so nguyen bat ky: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 2; ; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + "\t");
                temp++;

            }
            count = 0;
            if (temp == n) break;
        }
    }

    //QUESTION 8: TIM UOC CHUNG LON NHAT VA NHO NHAT CUA A VA B
    public static void uclnBcnn(Scanner scan) {
        System.out.printf("Nhap vao so tu nhien a");
        int a = Integer.parseInt(scan.nextLine());
        System.out.printf("Nhap vao so tu nhien b");
        int b = Integer.parseInt(scan.nextLine());
    }

    //QUESTION 9: DAY FIBONACCI
    public static void fibonacci(Scanner scan) {
        int n;
        do {
            System.out.printf("Nhap vao so tu nhien n: ");
            n = Integer.parseInt(scan.nextLine());
        } while (n < 2);

        int f0 = 1;
        int f1 = 1;
        int fn = 2;
        for (int i = 3; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
        }
        System.out.print("So Fibonacci thu n la: " + fn);
    }


    //QUESTION 12: GOP 2 MANG DA SAP XEP LAI THEO THU TU TANG DAN
    public static void sort(Scanner scan) {
        System.out.printf("Nhap so phan tu co trong day 1:  ");
        int m = Integer.parseInt(scan.nextLine());
        int arr1[] = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Nhap phan tu thu " + (i + 1) + ": ");
            arr1[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.printf("Nhap so phan tu co trong day 2:  ");
        int n = Integer.parseInt(scan.nextLine());
        int arr2[] = new int[n];
        for (int j = 0; j < arr2.length; j++) {
            System.out.printf("Nhap phan tu thu " + (j + 1) + ": ");
            arr2[j] = Integer.parseInt(scan.nextLine());
        }

        for (int pt : arr1) {
            System.out.print(pt + "\t");
        }
        System.out.println();

        for (int pt : arr2) {
            System.out.print(pt + "\t");
        }
        System.out.println();
        int i = 0,j = 0,k = 0;
        int arr3[] = new int[m + n];
        while (i < m || j < n) {
            if (i < m && j < n) {
                if (arr1[i] < arr2[j]) {
                    arr3[k] = arr1[i];
                    k++;
                    i++;
                } else {
                    arr3[k] = arr2[j];
                    k++;
                    j++;
                }
            } else {
                if (i < m && j >= n) {
                    arr3[k] = arr1[i];
                    k++;
                    i++;
                } else if (i >= m && j < n) {
                    arr3[k] = arr2[j];
                    k++;
                    j++;
                }
            }
        }
        for(int pt : arr3) {
            System.out.print(pt + "\t");
        }
    }
}
