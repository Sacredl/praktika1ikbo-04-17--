public class Student {
    public int gpa;
    public String name;
    public Student()
    {
        this.name = "John Doe";
        this.gpa = 1;
    }

    public int getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
