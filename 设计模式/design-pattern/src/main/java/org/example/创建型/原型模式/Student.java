package org.example.创建型.原型模式;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanxiangge
 * @since 2023/1/14
 * 浅拷贝，存在问题
 * 实现Cloneable，浅拷贝。只会拷贝基本类型的数据对象，引用类型的数据对象是直接将地址指向克隆对象
 */

public class Student implements Cloneable, Serializable {

    private String name;

    private int age;


    private List<String> skill = new ArrayList<>();

    public Student(){
        System.out.println("init student constructor method !!!");
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    protected Student deepClone(){
        try {
            // 输出 序列化
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            ObjectOutputStream objOut = new ObjectOutputStream(bOut);
            objOut.writeObject(this);

            // 输入 反序列化
            ByteArrayInputStream bInput = new ByteArrayInputStream(bOut.toByteArray());
            ObjectInputStream objIn = new ObjectInputStream(bInput);
            return (Student)objIn.readObject();

        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSkill() {
        return skill;
    }

    public void setSkill(List<String> skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "ShallowStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skill=" + skill +
                '}';
    }
}
