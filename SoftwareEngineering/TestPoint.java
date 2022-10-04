public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("默认的坐标:(" + point.getPoint()[0] + "," + point.getPoint()[1] + ")");
        point.movePoint(10, 20);
        System.out.println("修改后的坐标:(" + point.getPoint()[0] + "," + point.getPoint()[1] + ")");
    }
}
