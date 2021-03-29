package com.hust.company.backend;

import com.hust.company.enity.QLCB.CanBo;
import com.hust.company.enity.QLCB.CongNhan;
import com.hust.company.enity.QLCB.KySu;
import com.hust.company.enity.QLCB.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canbos;
    private Scanner scanner;

    public QLCB() {
        canbos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void data(){
        CanBo canBo = new CanBo("quan",21,true);
        CanBo canBo2 = new CanBo("quan2",32,true);
        CanBo canBo3 = new CanBo("quan3",23,true);
        canbos.add(canBo);
        canbos.add(canBo2);
        canbos.add(canBo3);

    }
    public void themCanBo() {
        System.out.print("Bạn muốn thêm cán bộ nào (1.CongNhan, 2.KySu, 3.NhanVien): ");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1:
                CongNhan cn = new CongNhan();
                canbos.add(cn);
                System.out.println("Them thanh cong!");
                break;
            case 2:
                KySu ks = new KySu();
                canbos.add(ks);
                System.out.println("Them thanh cong");
                break;
            case 3:
                NhanVien c = new NhanVien();
                canbos.add(c);
                System.out.println("Thêm thành công!");
                break;
            default:
                break;
        }

    }

    public void timKiemTheoTen() {
        System.out.printf("Moi ban nhap ho ten can bo: ");
        String hoTen = scanner.nextLine();

        for (CanBo canBo : canbos) {
            if (hoTen.equals(canBo.getTen())) {
                canBo.getInfor();
            }
        }
    }

    public void hienThiThongTinCanBo() {
        System.out.println("Hiển thị thông tin về danh sách cán bộ đó: ");
        for (CanBo canBo : canbos) {
            canBo.getInfor();
        }
    }

        public void xoaCanBo() {
            System.out.println("Nhập vào tên của cán bộ và delete cán bộ đó");
            Scanner scanner = new Scanner(System.in);
            boolean hasCanBo = false;
            String hoTen;
            System.out.print("Nhập họ tên cần xóa: ");
            hoTen = scanner.nextLine();
//            canbos.removeIf(cb -> hoTen.equals(cb.getTen()));

            for(int i=0;i<canbos.size();i++) {
                if (hoTen.equals(canbos.get(i).getTen())) {
                    canbos.remove(i);
                    hasCanBo = true;
                    System.out.println("Da xoa xong");
                }
            }
//            for (CanBo canBo : canbos) {
//                if (hoTen.equals(canBo.getTen())) {
//                    canbos.remove(hoTen);
//                    hasCanBo = true;
//                }
//            }
            if(hasCanBo == false){
                System.out.println("Khong tim thay can bo");
            }



        }
}
