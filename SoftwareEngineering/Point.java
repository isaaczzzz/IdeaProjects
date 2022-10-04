public class Point {
    private int x;
    private int y;

    public static void main(String[] args) {
        Point point = new Point();
        point.setX(1);
        point.setY(2);
        System.out.println("修改前的point:(" + point.getPoint()[0] + "," + point.getPoint()[1] + ")");
        point.movePoint(2, 3);
        System.out.println("修改后的point:(" + point.getPoint()[0] + "," + point.getPoint()[1] + ")");
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getPoint() {

        int[] point = new int[2];
        point[0] = this.x;
        point[1] = this.y;
        return point;
    }

    public void movePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
