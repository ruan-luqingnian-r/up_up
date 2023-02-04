package 克隆模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanxiangge
 * @date 2022/6/9 下午3:44
 */
public class Humanity implements Cloneable {

    private String name;

    private int age;

    private List<String> skill = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Humanity(){
        System.out.println("调用Humanity构造参数");
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
        return "Humanity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skill=" + skill +
                '}';
    }

    @Override
    protected Humanity clone() throws CloneNotSupportedException {
        return (Humanity) super.clone();
    }
}
