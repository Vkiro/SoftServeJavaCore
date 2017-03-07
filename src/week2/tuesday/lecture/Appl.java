package week2.tuesday.lecture;

public class Appl {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Name1");
        st1.setRait(1);

        Student st2 = new Student("Name2");
        st1.setRait(4);

        Student st3 = new Student("Name3", 4);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.println(st1.betterStudent(st3));
    }
}
