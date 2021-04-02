package Question7_12;

public class Department {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department() {
        input();
    }

    public void input() {
        System.out.printf("Nhap id: ");
        id = ScannerUtils.inputInt("Nhap mot so dang int",id);
        System.out.println("Nhập email: ");
        name = ScannerUtils.inputString("Nhap dang String.",name);
    }
}
