package com.hust.company.backend;

import com.hust.company.enity.Question2.ThiSinh;
import com.hust.company.enity.Question2.ThiSinhKhoiA;
import com.hust.company.enity.Question2.ThiSinhKhoiB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTS {
    private List<ThiSinh> thiSinhs;
    Scanner scan = new Scanner(System.in);

    public QLTS() {
        thiSinhs = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void themThiSinh() {
        ThiSinh thiSinh;

        thiSinh = new ThiSinhKhoiA();
        thiSinhs.add(thiSinh);
    }

}
