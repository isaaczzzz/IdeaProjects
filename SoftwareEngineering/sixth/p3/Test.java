package sixth.p3;

import sixth.p1.A1;
import sixth.p1.A2;
import sixth.p2.B1;
import sixth.p2.B2;

public class Test {
    public static void main(String[] args) {
        A1 a1 = new A1();
        A2 a2 = new A2();
        B1 b1 = new B1();
        B2 b2 = new B2();

        //不同(同)包非子类
//        a1.a = 1;
//        a1.b = 1;
//        a1.c = 1;
        a1.d = 1;
        //System.out.println("a1.d: "+a1.d);
        //a1.publicM();
        //a1.protectedM();

        //不同同包中子类
        //b2.a1DefaultM();
        //b2.a1ProtectedM();

    }
}
