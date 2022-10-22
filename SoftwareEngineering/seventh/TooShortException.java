package seventh;

public class TooShortException extends Throwable{
    public TooShortException() {
    }

    public static void main(String[] args) throws TooShortException{
        String s = "abcd";
        try {
            if (s.length() < 5) {
                throw new TooShortException();
            }
        } catch (TooShortException e) {
            System.out.println(e);
            System.out.println("字符串短于5");
        }
    }
}
