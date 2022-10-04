import java.util.Arrays;

public class TestString {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        String s3 = "Hello";
        System.out.println(s1.charAt(0));
        char[] chs = new char[4];
        s1.getChars(0, 4, chs, 0);
        System.out.println(Arrays.toString(chs));
        System.out.println(Arrays.toString(s2.getBytes()));

        System.out.println("java equals java is " + s2.equals("java"));
        System.out.println("java equals Java ignore case is " + s2.equalsIgnoreCase(s1));
        System.out.println("Hello starts with He is" + s3.startsWith("He"));
        System.out.println("First index of a in Java is " + s1.indexOf("a"));
        System.out.println("Last index of a in Java is " + s1.lastIndexOf("a"));

        String substring = s3.substring(2, 4);
        System.out.println("Substring of Hello is " + substring);


    }
}
