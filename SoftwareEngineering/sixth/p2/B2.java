package sixth.p2;

import sixth.p1.A1;

public class B2 extends A1 {
    private int a;
    protected int b;
    int c;
    public int d;

    public void a1ProtectedM() {
        System.out.println("super's protected "+super.b);
    }
//    public void a1DefaultM() {
//        System.out.println("super's default "+super.c);
//    }
}
