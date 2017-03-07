package week2.tuesday.lecture;

public class Student {
    private String name;
    private int rait;
    private static int avgRating;

    public Student() {
    }

    public Student (String name) {
        setName(name);
    }

    public Student(String name, int rait) {
        this.name = name;
        this.rait = rait;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRait() {
        return rait;
    }

    public void setRait(int rait) {
        this.rait = rait;
    }

    public boolean betterStudent(Student st) {
        return this.rait > st.getRait();
    }

    @Override
    public String toString() {
        return "Student: " +
                "name=" + name +
                ", rait=" + rait;
    }
}
