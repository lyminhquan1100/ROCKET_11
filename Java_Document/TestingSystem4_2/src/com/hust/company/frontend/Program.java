package com.hust.company.frontend;

import com.hust.company.backend.QLCB;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập chức năng muốn sử dụng: \n" + "1.Thêm mới cán bộ\n"
                + "2.Tìm kiếm theo họ tên\n" + "3.Hiện thị thông tin về danh sách các cán bộ.\n"
                + "4.Nhập vào tên của cán bộ và delete cán bộ đó\n" + "5.Thoát khỏi chương trình.");

        qlcb.data();
        while (true) {
            System.out.print("Mời bạn chọn chức năng: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    qlcb.themCanBo();
                    break;
                case 2:
                    qlcb.timKiemTheoTen();
                    break;
                case 3:
                    qlcb.hienThiThongTinCanBo();
                    break;
                case 4:
                    qlcb.xoaCanBo();
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

// Vi tri nhap Scaner no la ham hay gi, tai sao no lai viet o do, No nam o vi tri thuoc tinh
// Can bo khong cho set ten sao van nhap ten dc vao
// Khong can ham toString em van in duoc ra. Vay minh dung dung ham toString de viet gon ham => in nhung thuoc tinh minh
// muon ra cung 1 luc
// CanBo canBo : canbos em hieu y nghia dung de lam gi nhung khong hieu y nghia tung thanh phan trong do
