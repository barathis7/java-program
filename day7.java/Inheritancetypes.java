// Single Inheritance
class A {
    void displayA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Class B");
    }
}

// Multilevel Inheritance
class C extends B {
    void displayC() {
        System.out.println("Class C");
    }
}

// Hierarchical Inheritance
class D extends A {
    void displayD() {
        System.out.println("Class D");
    }
}

// Multiple Inheritance using Interface
interface X {
    void showX();
}

interface Y {
    void showY();
}

class E implements X, Y {
    public void showX() {
        System.out.println("Interface X");
    }

    public void showY() {
        System.out.println("Interface Y");
    }
}

public class Inheritancetypes {
    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("Single Inheritance");
        B obj1 = new B();
        obj1.displayA();
        obj1.displayB();

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance");
        C obj2 = new C();
        obj2.displayA();
        obj2.displayB();
        obj2.displayC();

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance");
        D obj3 = new D();
        obj3.displayA();
        obj3.displayD();

        // Multiple Inheritance using Interface
        System.out.println("\nMultiple Inheritance");
        E obj4 = new E();
        obj4.showX();
        obj4.showY();

        // Hybrid Inheritance (Combination)
        System.out.println("\nHybrid Inheritance");
        obj2.displayA();
        obj2.displayB();
        obj2.displayC();
        obj4.showX();
        obj4.showY();
    }
}