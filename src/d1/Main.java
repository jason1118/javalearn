package d1;

public class Main{
    public static void main(String[] args) {
        A a = null;
        System.out.println(a instanceof A); //false

        a = new B();
        System.out.println(a instanceof A); //true

        B b = new C();
        System.out.println(b instanceof A); // true

        C c = new C();
        System.out.println(c instanceof A); //true

    }
}

interface A {}
class B implements A{}
class C extends B{}
