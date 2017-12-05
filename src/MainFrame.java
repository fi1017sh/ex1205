import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private int fmW=900,fmH=700,screenW= dim.width,screenH=dim.height;
    private Container cp;
    private JPanel jpset = new JPanel(new GridLayout(4,1,3,3));//按扭區
    private JPanel jpn = new JPanel(new GridLayout(5,5,3,3));//地鼠
    private JButton jbstart = new JButton("Start");
    private JButton jbexit = new JButton("Exit");
    private JLabel jlt = new JLabel("秒數");
    private JLabel jls = new JLabel("分數");
    private JButton jbs[] = new JButton[25];

    public MainFrame(){initComp();}

    public void initComp() {
        this.setBounds(screenW / 2 - fmW / 2, screenH / 2 - fmH / 2, fmW, fmH);
        this.setTitle("打地鼠");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jpset,BorderLayout.EAST);
        jpset.add(jlt);
        jpset.add(jbstart);
        jpset.add(jls);
        jpset.add(jbexit);

        cp.add(jpn,BorderLayout.CENTER);
        for(int i =0; i<25 ;i++) {

            jbs[i] = new JButton(Integer.toString(i+1));
            jpn.add(jbs[i]);
        }
    }
}
