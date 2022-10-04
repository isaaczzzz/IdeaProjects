package fifth.q4;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

/*        a.m1();
        b.m1();
        c.m1();
        d.m1();*/
//        System.out.println("C访问B中方法:");
//        c.mb();
//        System.out.println("B访问C中方法");
//        b.mc();
//        System.out.println("B转换为D，并访问D中方法");
//        D b1 = (D)b;
//        b1.md();
//        System.out.println("D转换为B，并访问B中方法");
//        B d1 = (B)d;
//        d1.mb();
        System.out.println("D转换为C，并访问C中方法");
        C c1 = (C)d;
        c1.mc();
    }
}
