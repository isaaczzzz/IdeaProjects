public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 1, "男", 19);
        Student student2 = new Student("李四", 2, "女", 20);
        Student student3 = new Student("王五", 3, "男", 20);

        System.out.println(student1.getName()+"的年龄是"+student1.getAge());
        student1.changeAge(21);
        System.out.println(student1.getName()+"修改后的年龄是"+student1.getAge());

        System.out.println(student2.getName()+"的年龄是"+student2.getAge());
        student2.changeAge(21);
        System.out.println(student2.getName()+"修改后的年龄是"+student2.getAge());

        System.out.println(student3.getName()+"的学号和性别是"+student3.getId()+", "+student3.getGender());
    }
}
