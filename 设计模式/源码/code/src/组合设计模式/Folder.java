package 组合设计模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanxiangge
 * @since 2022/7/6
 * 文件夹相当于非叶子节点
 */
public class Folder extends Root{

    List<Root> folders = new ArrayList<>();

    public List<Root> getFolders() {
        return folders;
    }

    public void setFolders(List<Root> folders) {
        this.folders = folders;
    }

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addFile(Root root) {
        folders.add(root);
    }

    @Override
    public void removeFile(Root root) {
        folders.remove(root);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(Math.max(0, depth)));
        System.out.println(sb.toString()+getName());
        for (Root folder : folders) {
            folder.display(depth + 2);
        }
    }


}
