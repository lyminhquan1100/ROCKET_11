package Question7_12;

import java.time.LocalDate;

public class Group {
    private int id;
    private String name;
    private Account[] accounts;
    private LocalDate createDate;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public Group() {
        accounts = new Account[10000];
        input();
    }

    private void input() {
        System.out.println("Nhập id : ");
        id = ScannerUtils.inputInt("Nhap dang int", id);

        System.out.println("Nhập tên : ");
        name = ScannerUtils.inputString("Nhap dang String", name);

        themAccount();
    }

    private void themAccount() {
        System.out.println("Nhap 1: Them Account \nNhap  2: Khong them Account");

        int choose = 0;
        while (true) {
            choose = ScannerUtils.inputInt("Nhap dang int",choose);

            switch (choose) {
                case 1:
                    return;

                case 2:
                    addAccount();
                    return;

                default:
                    System.out.println("Doc lai yeu cau");
                    break;
            }
        }
    }

    private void addAccount() {
        int n=0;
        System.out.println("Nhap so Account trong Group ");
        n = ScannerUtils.inputInt("Nhap dang int",n);

        for (int i = 0; i < n; i++) {
            accounts[i] = new Account();
        }
    }
}
