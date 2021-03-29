package com.hust.company.enity.QLCB;

import java.util.Scanner;

public class CanBo {

    protected String ten;
    protected int tuoi;
    protected boolean gioiTinh;
//    private Scanner scanner;
    Scanner scanner = new Scanner(System.in);
    public CanBo() {
        scanner = new Scanner(System.in);
    }

    public CanBo(String ten, int tuoi, boolean gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }


    public void inputInfo() {

        System.out.print("Mời bạn nhập vào tên: ");
        ten = scanner.nextLine();
        System.out.print("Mời bạn nhập vào tuổi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Mời bạn nhập vào giới tính (nam/nu): ");
        String gt = scanner.nextLine();
        gioiTinh = gt.equals("nam") ? true : false;
    }

    public void getInfor() {
        System.out.println("Họ tên      : " + ten);
        System.out.println("Tuổi        : " + tuoi);
        System.out.println("Giới tính   : " + gioiTinh);
    }
}
