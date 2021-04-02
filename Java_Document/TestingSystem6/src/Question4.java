public class Question4 {
    public static void main(String[] args) {
        String[] departments = {"Sale","Dev","Employee"};
        System.out.println(departments[2]);
        getIndex(5,departments);
}

    private static void getIndex(int index, String departments[]) {
        try {
            System.out.println(departments[index]);

        } catch (Exception e) {
            System.out.println("Cannot find department !");
        }

    }

}
