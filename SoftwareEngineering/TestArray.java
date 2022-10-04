public class TestArray {
    public static void main(String[] args) {
        int[] sim = {12, 2, 3, 8, 5, 9, 1};
        System.out.print("origin: ");
        for(int n : sim) {
            System.out.print(n + " ");
        }
        System.out.println();
        for(int i = 0; i < sim.length; i++)
            for(int j = 1; j < sim.length - i; j++) {
                if(sim[j - 1] > sim[j]) {
                    int tmp = sim[j];
                    sim[j] = sim[j - 1];
                    sim[j - 1] = tmp;
                }
            }
        for(int n : sim) {
            System.out.print(n + " ");
        }
    }
}
