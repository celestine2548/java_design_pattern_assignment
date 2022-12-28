import javax.swing.*;


public class StartGame {
    public static void main(String[] args) {
        // 显示应用 GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame();
            }
        });
    }
}