package com.hust.company.enity.Question2;

public abstract class ThiSinh {
    protected int sbd;
    protected String khoi;
    protected String ten;
    protected String diaChi;
    protected float uuTien;

    public int getSbd() {
        return sbd;
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public String getKhoi() {
        return khoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public float getUuTien() {
        return uuTien;
    }

    public void setUuTien(float uuTien) {
        this.uuTien = uuTien;
    }

    public ThiSinh() {
    }
}
