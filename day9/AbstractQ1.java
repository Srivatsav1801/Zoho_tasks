abstract class Parent {
    abstract void message();
}
class First_sub_class extends Parent {
    void message() {
        System.out.println("This is first subclass");
    }
}

class Second_sub_class extends Parent {
    void message() {
        System.out.println("This is second subclass");
    }
}

public class AbstractQ1{
    public static void main(String[] args) {
        First_sub_class first = new First_sub_class();
        Second_sub_class second = new Second_sub_class();

        first.message();
        second.message();
    }
}
