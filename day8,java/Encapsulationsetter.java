class Encapsulationsetter {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Barath");
        s.display();
    }
}