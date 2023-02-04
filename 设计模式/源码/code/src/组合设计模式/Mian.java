package 组合设计模式;

/**
 * @author ruanxiangge
 * @since 2022/7/6
 */
public class Mian {
    public static void main(String[] args) {
        // 创造根文件夹
        Root root = new Folder("C://");

        //创建子文件夹
        Folder desktop = new Folder("desktop");
        Folder myComputer = new Folder("myComputer");

        //创建文件
        File file1 = new File("HelloWold.java");
        File file2 = new File("HelloWold.class");

        //建立关系
        root.addFile(desktop);
        root.addFile(myComputer);

        desktop.addFile(file1);
        desktop.addFile(file2);

        root.display(0);
    }
}
