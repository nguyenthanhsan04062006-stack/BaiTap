
package Constructor;
public class Student {
    int id;
    String name;

    Student(int i, String n, int par1) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan", 25);
        Student s2 = new Student(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}

