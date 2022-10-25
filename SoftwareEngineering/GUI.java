import java.awt.*;

public class GUI {
    private Frame f;
    private Button b1;
    private Button b2;
    private Button b3;
    private Label l;
    private TextField tf;

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.go();
    }
    public void go() {
        Frame frame = new Frame("MyGUI");
        frame.setLayout(new FlowLayout());
        b1 = new Button("Press");
        b2 = new Button("Cancel");
        b3 = new Button("Exit");
        l = new Label("My Java awt GUI");
        tf = new TextField("Write something");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(l);
        frame.add(tf);
        frame.pack();
        frame.setVisible(true);
    }
}
