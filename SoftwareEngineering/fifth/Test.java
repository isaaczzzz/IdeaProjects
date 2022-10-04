package fifth;

public class Test {
    public static void main(String[] args) {
        CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.setData("张三", 'M', 19, 123455, 117496, "计算机", "计算机视觉");
        System.out.println("大学生: "+collegeStudent.getData());
        Undergraduate undergraduate = new Undergraduate();
        undergraduate.setData("张三", 'M', 19, 123455, 117496, "计算机", "计算机视觉", "计算机学院");
        System.out.println("本科生: "+undergraduate.getData());
        Postgraduate postgraduate = new Postgraduate();
        postgraduate.setData("李四", 'F', 23, 54816, 74446, "软件工程", "大数据", "ZSJ");
        System.out.println("硕士生: "+postgraduate.getData());
        PhD phD = new PhD();
        phD.setData("王五", 'F', 26, 14871, 54441, "计算机", "机器学习", "WSF");
        System.out.println("博士生: "+phD.getData());
    }
}
