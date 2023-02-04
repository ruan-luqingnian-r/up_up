package 克隆模式;

/**
 * @author ruanxiangge
 * @date 2022/6/9 下午3:52
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Humanity humanity1 = new Humanity();
        humanity1.setAge(18);
        humanity1.setName("赵赵赵");
        humanity1.getSkill().add("前端");


        Humanity humanity2 = humanity1.clone();
        humanity2.setName("阮阮阮");
        humanity2.getSkill().add("后端");

        System.out.println("humanity1:" + humanity1);
        System.out.println("humanity2:" + humanity2);
    }

}
