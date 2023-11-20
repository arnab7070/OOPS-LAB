// Show that ordinary block is executed when object is created and also the order of execution of these blocks (for multiple blocks/
// inherited block).
class A {
    {
        System.out.println("1st instance block of parent(A)");
    }
    {
        System.out.println("2nd instance block of parent(A)");
    }
    static {
        System.out.println("Static block of Child (A)");
    }
    {
        System.out.println("3rd instance block of parent(A)");
    }

    A() {
        System.out.println("Constuctor-->A");
    }
}

class B extends A {
    static {
        System.out.println("Static block of Child (B)");
    }

    {
        System.out.println("1st instance block of child(B)");
    }
    {
        System.out.println("2nd instance block of child(B)");
    }
    {
        System.out.println("3rd instance block of child(B)");
    }

    B() {
        System.out.println("Constuctor-->B");
    }
}

class Prog1 {
    public static void main(String[] args) {
        B b = new B();

    }
}