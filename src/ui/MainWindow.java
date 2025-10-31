package ui;

import javax.swing.*;
import java.awt.*;

public final class MainWindow extends JFrame {
    public MainWindow(String title){
        super(title);

        this.setSize(new Dimension(1280, 720));
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.repaint();
        this.revalidate();
    }
}
