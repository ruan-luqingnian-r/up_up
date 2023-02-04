package 建造者模式;

/**
 * @author ruanxiangge
 * @date 2022/6/22 下午6:35
 */
public class Computer {

    private String cpu;

    private String GraphicsCard;

    private String MainBoard;

    private String Disk;

    private String Memory;

    private String power;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphicsCard() {
        return GraphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        GraphicsCard = graphicsCard;
    }

    public String getMainBoard() {
        return MainBoard;
    }

    public void setMainBoard(String mainBoard) {
        MainBoard = mainBoard;
    }

    public String getDisk() {
        return Disk;
    }

    public void setDisk(String disk) {
        Disk = disk;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", GraphicsCard='" + GraphicsCard + '\'' +
                ", MainBoard='" + MainBoard + '\'' +
                ", Disk='" + Disk + '\'' +
                ", Memory='" + Memory + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
