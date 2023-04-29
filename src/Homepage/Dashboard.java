
package Homepage;

import Homepage.Reception;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame  implements ActionListener {

    JMenuItem reception,addemployee,addroom,adddrivers;
    Dashboard(){
        setBounds(0,0,1550,820);
        setLayout(null);
        JPanel n = new JPanel();
        n.setBounds(0,0,1550,100);
        n.setBackground(Color.BLACK);
        add(n);
        JLabel title = new JLabel("AP Hotels Group are welcomes you");
        title.setBounds(290,10,1100,100);
        Font font=new Font("Bodoni MT Black",Font.BOLD,50);
        title.setForeground(Color.white);
        title.setFont(font);
        n.add(title);

        ImageIcon icon =new ImageIcon(ClassLoader.getSystemResource("z.jpg"));
        Image i1= icon.getImage().getScaledInstance(1550,820,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel image = new JLabel(i2);
        image.setBounds(0,100,1550,820);
        add(image);




        JMenuBar mb =new JMenuBar();
        mb.setBounds(0,0,1550,30);
        mb.setBackground(Color.white);
        image.add(mb);

        Font font1 =new Font("Arial",Font.BOLD,20);

        JMenu hotel =new JMenu("Hotel Management");
        hotel.setForeground(Color.red);
        hotel.setFont(font1);
        mb.add(hotel);

        reception =new JMenuItem("Reception");
        reception.addActionListener(this);
        reception.setFont(font1);
        hotel.add(reception);



        JMenu admin =new JMenu("Admin");
        admin.setForeground(Color.blue);
        admin.setFont(font1);
        mb.add(admin);
        addemployee =new JMenuItem("Add Employee");
        addemployee.addActionListener(this);
        addemployee.setFont(font1);
        admin.add(addemployee);
        addroom =new JMenuItem("Add Rooms");
        addroom.setFont(font1);
        addroom.addActionListener(this);
        admin.add(addroom);
        adddrivers =new JMenuItem("Add Drivers");
        adddrivers.setFont(font1);
        adddrivers.addActionListener(this);
        admin.add(adddrivers);

        setVisible(true);

    }






    public static void main(String[] args) {
        new Dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Add Employee")){

        } else if (ae.getActionCommand().equals("Add Rooms")) {

        }
        else if (ae.getActionCommand().equals("Add Drivers")) {

        }else if (ae.getActionCommand().equals("Reception")) {
            new Reception();
        }
    }
}
