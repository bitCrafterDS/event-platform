public class Student {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String college;
    private String branch;
    


public Student(int id, String name, String email, String phone, String college, String branch) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.college = college;
        this.branch = branch;
}

public int getId() { return id; }
public String getName() { return name; }
public String getEmail() { return email; }
public String getPhone() { return phone; }
public String getCollege() { return college; }
public String getBranch() { return branch; }

}
