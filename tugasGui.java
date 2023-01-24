package tugas_sesi_12;
import javax.swing.*;
import java.awt.*;

public class tugasGui extends JFrame {
    
    JTextField tf = new JTextField(44);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bplus = new JButton("+");
        JButton bmin = new JButton("-");
        JButton bkali = new JButton("*");
        JButton bbagi = new JButton("/");
        JButton bsam = new JButton("=");
        JButton bper = new JButton("%");
        JButton bmod = new JButton("Mod");
        JButton bexit = new JButton("Exit");

    tugasGui(){
        super("KALKULATOR");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane(). setBackground(Color.black);
        setLocationRelativeTo(null);
        

        JPanel tff = new JPanel();
        tff.add(tf);
        Container cr = getContentPane();
        cr.setLayout(new BorderLayout());
        cr.add(tff, BorderLayout.NORTH);
        //bagian button
        JPanel gl = new JPanel();
        gl.setLayout(new GridLayout(3,6,0,0));
        cr.add(gl, BorderLayout.CENTER);
        gl.add(b1);
        gl.add(b2);
        gl.add(b3);
        gl.add(b4);
        gl.add(b5);
        gl.add(b6);
        gl.add(b7);
        gl.add(b8);
        gl.add(b9);
        gl.add(b0);
        gl.add(bplus);
        gl.add(bmin);
        gl.add(bkali);
        gl.add(bbagi);
        gl.add(bsam);
        gl.add(bper);
        gl.add(bmod);
        gl.add(bexit);
        
        
    }
    public static void main(String[] args) {
        new tugasGui();
    }

}
class tugasGuiApp extends tugasGui{
    

    
}
