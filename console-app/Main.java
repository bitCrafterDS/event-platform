public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Deepanshu", "deepanshu@example.com", "7067384650", "LNCT", "ECE");
        System.out.println(s1.getName() + " |" + s1.getBranch());

        Student s2 = new Student(2, "John", "john@example.com", "7067384651", "LNCT", "CSE");
        System.out.println(s2.getName() + " |" + s2.getBranch());

    }
}