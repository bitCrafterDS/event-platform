public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Deepanshu", "deepanshu@example.com", "9999999991", "LNCT", "ECE");
        System.out.println(s1.getName() + " | " + s1.getBranch());

        Student s2 = new Student(2, "John", "john@example.com", "9999999992", "LNCT", "CSE");
        System.out.println(s2.getName() + " | " + s2.getBranch());

        Event e1 = new Event(
            1,
            "A GitHub talk and presentation session on learning, collaboration and getting more out of GitHub",
            "Join us for an engaging session on GitHub, where we will explore the power of collaboration, version control, and open-source contributions. Learn how to leverage GitHub for your projects and enhance your coding skills.",
            "27 September 2026",
            "4:30 PM",
            "Apogee Rooftop, Minal",
            30
        );
        
        System.out.println(e1.getTitle() + " | " + e1.getVenue() + " | seats: " + e1.getSeatLimit());
    }
}