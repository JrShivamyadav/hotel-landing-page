package Homepage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame  implements ActionListener {
    JFrame frame;
    Homepage(){
        frame =new JFrame();
        frame.setBounds(0,0,1366,565);
        frame.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("f.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1366,565,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,1366,565);
        frame.add(image);

        JLabel text=new JLabel("AP Hotels Group");
        text.setBounds( 480,50,700,120);
        image.add(text);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Broadway",Font.PLAIN,48));

        JLabel q=new JLabel("Stay with us Feel at home");
       q.setBounds( 700,90,700,120);
        q.setForeground(Color.RED);
        q.setFont(new Font("Harlow Solid Italic",Font.PLAIN,25));
        image.add(q);


        JButton btnnext= new JButton("Next");
        btnnext.setBounds(650,480,150,35);
        image.add(btnnext);
        btnnext.setBackground(Color.ORANGE);
        btnnext.setForeground(Color.WHITE);
        btnnext.setFont(new Font("Arial",Font.BOLD,20));
        btnnext.addActionListener(this);
        frame.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);


        new Dashboard();
    }
    public  static void main(String[] args){
        new Homepage();
    }


}