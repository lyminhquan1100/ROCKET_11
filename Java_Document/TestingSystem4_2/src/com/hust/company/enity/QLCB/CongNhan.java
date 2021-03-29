package com.hust.company.enity.QLCB;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String congViec;
    private Scanner scan;

    public CongNhan() {
        scan = new Scanner(System.in);
        inputInfo();
    }

    public String getCongViec() {
        return congViec;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.printf("Nhap vao cong viec cua ban: ");
        congViec = scan.nextLine();
    }
}
