package 组合设计模式;

/**
 * @author ruanxiangge
 * @since 2022/7/6
 * 文件相当于叶子节点
 */
public class File extends Root {

    public File(String name) {
        super(name);
    }

    @Override
    public void addFile(Root root) {
    }

    @Override
    public void removeFile(Root root) {

    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        sb.append("-".repeat(Math.max(0, depth)));
        System.out.println(sb.toString() + getName());
    }
}
