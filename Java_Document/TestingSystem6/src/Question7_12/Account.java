package Question7_12;

public class Account {

    private int id;
    private String email;
    private String username;
    private String fullname;
    private int age;


    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public Account() {

    }

    private void iput() {
        System.out.printf("Nhap id: ");
        id = ScannerUtils.inputInt("Nhap mot so dang int",id);
        System.out.println("Nhập email: ");
        email = ScannerUtils.inputString("Nhap dang String.",email);

        System.out.println("Nhập username: ");
        username = ScannerUtils.inputString("Nhap dang String.", username);

        System.out.println("Nhập fullname: ");
        fullname = ScannerUtils.inputString("Nhap dang String.",fullname);

        System.out.println("Nhập tuổi của bạn: ");
        age = inputAccountAge();

    }
    private int inputAge() {
        int age =0;
         age = ScannerUtils.inputInt("Nhap dang int",age);

        if (age < 0) {
            throw new ArithmeticException("The age must be greater than 0, please input again.");
        }

        return age;
    }
    private int inputAccountAge() {
        while (true) {
            try {
                int age = inputAge();
                if (age < 18) {
                    System.out.println("Your age must be greater than 18, please input again.");
                } else {
                    return age;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
