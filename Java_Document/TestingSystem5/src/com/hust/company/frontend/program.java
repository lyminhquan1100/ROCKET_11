package com.hust.company.frontend;

import com.hust.company.backend.QLTS;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        QLTS qlts = new QLTS();
        Scanner scan = new Scanner(System.in);

        System.out.println("Mời bạn nhập chức năng muốn sử dụng: \n" + "1.Thêm mới thi sinh\n"
                + "2.Hien thi thong tinT\n" + "3.Tim kiem theo so bao danh.\n"
                + "4.Thoat khoi chuong trinh");

        while (true) {
            System.out.print("Mời bạn chọn chức năng: ");
            Scanner scanner;
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    qlts.themThiSinh();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Thoát khỏi chương trình.");
                    scanner.close();
                    return;
                default:
                    break;
            }
        }
    }
}
