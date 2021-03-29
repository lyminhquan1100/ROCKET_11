package com.hust.company.enity.QLCB;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private int bac;

    private Scanner scan;

    public NhanVien() {
        scan = new Scanner(System.in);
        inputInfo();
    }



    public int getBac() {
        return bac;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.print("Mời bạn nhập vào bac: ");
        bac = scan.nextInt();
    }
}
