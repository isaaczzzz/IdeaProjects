public class RunNian {
    public static void main(String[] args) {
        int year = 2008;
        final boolean YES = true;
        final boolean NO = false;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
            System.out.println(YES);
        else
            System.out.println(NO);
    }
}
