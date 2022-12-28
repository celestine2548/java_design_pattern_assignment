import javax.swing.*;


public class GameFrame extends JFrame{

    public GameFrame() {
        init();
    }

    public void init() {
        this.setTitle("celestine设计模式小游戏");
        //添加面板
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        PlayGamePanel play = new PlayGamePanel();
        add(play);
        play.startRun();

    }
}