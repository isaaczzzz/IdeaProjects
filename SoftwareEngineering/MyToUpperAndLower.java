public class MyToUpperAndLower {
    public static void main(String[] args) {
        String s = "Java Hello";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }

    public String toUpperCase(String source) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < source.length(); i++) {
            char ch = source.charAt(i);
            if(ch >= 'a' && ch <= 'z')
                result.append((char) (ch - ('a' - 'A')));
            else
                result.append(ch);
        }
        return result.toString();
    }

    public String toLowerCase(String source) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < source.length(); i++) {
            char ch = source.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                result.append((char) (ch + ('a' - 'A')));
            else
                result.append(ch);
        }
        return result.toString();
    }
}
