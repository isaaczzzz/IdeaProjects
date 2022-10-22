package seventh;

public class ExceptionTest {
    public static void main(String[] args){
        try {
          int a = 1 / 0;
        } catch (ArithmeticException e1) {
            System.out.println("e1 msg: "+e1.getMessage());
            System.out.println("e1 String"+e1);
            try {
                int[] a1 = {1, 2, 3};
                int b = a1[3];
            } catch (IndexOutOfBoundsException e2) {
                System.out.println("e2 msg: "+e2.getMessage());
                System.out.println("e2 String"+e2);
                try {
                    String s = null;
                    int length = s.length();
                } catch (NullPointerException e3) {
                    System.out.println("e3 msg: "+e3.getMessage());
                    System.out.println("e3 String"+e3);
                    String s = "abcd";
                    if(s.length() < 5) {
                        throw new RuntimeException("字符串小于5");
                    }
                }
            }
        }

    }
}
