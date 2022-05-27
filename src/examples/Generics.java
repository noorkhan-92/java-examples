package examples;

public class Generics {

    public Generics() {
        System.out.println(test(0).getT());
        System.out.println(test(1).getT());
        System.out.println(test(2).getT());
        System.out.println(test(3).getT());
        System.out.println(test(4).getT());
    }

    private Test test(int a) {
        if (a == 0) {
            return new Test<>(25);
        }
        if (a == 1) {
            Test<Boolean> bool = new Test<>(true);
            return bool;
        }
        if (a == 2) {
            Test<Double> dbl = new Test<>(2.3);
            return dbl;
        }
        if (a == 3) {
            A a1 = new A("my custom class");
            Test<A> dbl = new Test<>(a1);
            return dbl;
        }
        return new Test<Object>("default class");
    }

    public static void main(String args[]) {
        Generics generics = new Generics();
    }

}

//customize class for whatever
class A {

    String a;

    public A(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }
}

//generic class Test which accept whatever and return accordingly
class Test<T> {

    T t;

    public Test(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
