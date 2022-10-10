package sixth;

public class OuterClass {
    private int a;
    public int b;

    public class InnerClass {
        public void innerM() {
            System.out.println("内部类方法");
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerM();
    }

}
