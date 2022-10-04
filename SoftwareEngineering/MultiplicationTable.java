public class MultiplicationTable {

    public static void main(String[] args) {
        six:
        for(int a = 1; a <= 9; a++) {
            for(int b = 1; b <= a; b++) {
                if (a == 6 && b == 6)
                    break six;
                System.out.print(b + "×" + a + " = " + a * b+"\t");
            }
            System.out.println();
        }
    }
}