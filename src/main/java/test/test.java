package test;

public class test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.type);
        A b = new B();
        System.out.println(b.type);
        Class<?> c = b.getType();
    }
}

class A {
    public String type=getType().getSimpleName();
    public void test() {
        System.out.println("A");
    }

    public Class<?> getType() {
        return this.getClass();
    }
}
class B extends A {
    public void test() {
        System.out.println("B");
    }
//    public Object getType() {
//        return this.getClass();
//    }
}
