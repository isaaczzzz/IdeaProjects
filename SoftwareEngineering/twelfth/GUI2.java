package twelfth;

import java.awt.*;
import java.awt.event.*;

public class GUI2 {
    public Frame f;
    public Button b1;
    public Button b2;
    public Label l;
    public TextField tf;

    public static void main(String[] args) {
        GUI2 gui = new GUI2();
        gui.go();
    }
    public void go() {
        Frame frame = new Frame("MyGUI");
        frame.setLayout(new FlowLayout());
        tf = new TextField("Write something");
        String text = tf.getText();
        b1 = new Button("Send");
        b1.addMouseListener(new MyMouseEvent(this, text));
        b2 = new Button("Exit");
        b2.addMouseListener(new MyMouseEvent2(this, frame));
        l = new Label("My Java awt GUI");
        frame.add(l);
        frame.add(tf);
        frame.add(b1);
        frame.add(b2);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300, 150);
        ListenerClose lc = new ListenerClose();
        frame.addWindowListener(lc);
    }
}

class ListenerClose implements WindowListener {
    @Override
    public void windowClosing(WindowEvent e) {
        Window w = e.getWindow();
        w.setVisible(false);
        w.dispose();
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}

class MyMouseEvent implements MouseListener {
    GUI2 gui2;
    String text;

    public MyMouseEvent(GUI2 gui2, String text) {
        this.gui2 = gui2;
        this.text = text;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == gui2.b1) {
            System.out.println(text);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
class MyMouseEvent2 implements MouseListener {
    GUI2 gui2;
    Frame frame;

    public MyMouseEvent2(GUI2 gui2, Frame frame) {
        this.gui2 = gui2;
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == gui2.b2) {
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}