package 组合设计模式;

/**
 * @author ruanxiangge
 * @since 2022/7/6
 * 抽象根
 */
public abstract class Root {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Root(String name) {
        this.name = name;
    }

    /**
     * 添加
     * @param root
     */
    public abstract void addFile(Root root);

    /**
     * 删除
     * @param root
     */
    public abstract void removeFile(Root root);

    /**
     * 列举
     * @param depth
     */
    public abstract void display(int depth);
}
