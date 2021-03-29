package com.hust.company.enity.QLCB;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;
    private Scanner scan;

    public KySu() {
        scan = new Scanner(System.in);
        inputInfo();

    }

    public String getNghanhDaoTao() {
        return nganhDaoTao;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.printf("Nhap nganh dao tao: ");
        nganhDaoTao = scan.nextLine();
    }
}
