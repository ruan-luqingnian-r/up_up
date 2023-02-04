package org.example.创建型.原型模式;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student studentRuan = new Student();
        studentRuan.setName("娃娃");
        studentRuan.setAge(22);
        studentRuan.getSkill().add("Java");

        // 浅拷贝
        // Student studentPP = studentRuan.clone();
        // 深拷贝
        Student studentPP = studentRuan.deepClone();
        studentPP.setName("PP");
        studentPP.setAge(18);
        studentPP.getSkill().add("Excel");

        Student student = new Student();
        student.setName("路人甲");

        System.out.println(student.toString());
        System.out.println(studentPP.toString());
        System.out.println(studentRuan.toString());

    }
}