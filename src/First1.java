import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public  class First1 extends JFrame implements ActionListener {
    JButton admin;
    JButton user;
    JButton checkScholership;
    First1()
    {
        Container c = getContentPane();
        JLabel il1 = new JLabel();
        il1.setIcon(new ImageIcon("C:\\\\Users\\\\DELL\\\\Pictures\\\\avatar.png"));
        Dimension size = il1.getPreferredSize();
        il1.setBounds(550,120,size.width, size.height);
        add(il1);


        Container c1 = getContentPane();
        JLabel il2 = new JLabel();
        il2.setIcon(new ImageIcon("C:\\\\Users\\\\DELL\\\\Pictures\\\\avatar1.png"));
        Dimension size1 = il2.getPreferredSize();
        il2.setBounds(50,480,size1.width, size1.height);
        add(il2);

        Container c2 = getContentPane();
        JLabel il3 = new JLabel();
        il3.setIcon(new ImageIcon("C:\\\\Users\\\\DELL\\\\Pictures\\\\avatar1.png"));
        Dimension size2 = il3.getPreferredSize();
        il3.setBounds(50,580,size2.width, size2.height);
        add(il3);
       Container c3 = getContentPane();
        JLabel il4 = new JLabel();
        il4.setIcon(new ImageIcon("C:\\\\Users\\\\DELL\\\\Pictures\\\\avatar1.png"));
        Dimension size3 = il4.getPreferredSize();
        il4.setBounds(860,580,size3.width, size3.height);
        add(il4);


        admin=new JButton("Admin");
        admin.setBounds(200,500,150,40);
        admin.setFont(new Font("Admin",Font.BOLD,18));
        admin.setForeground(Color.WHITE);
        admin.setBackground(Color.BLACK);
        add(admin);

        user=new JButton("user");
        user.setBounds(200,600,150,40);
        user.setFont(new Font("user",Font.BOLD,18));
        user.setForeground(Color.WHITE);
        user.setBackground(Color.BLACK);
        add(user);
        checkScholership=new JButton("CheckScholarship");
        checkScholership.setBounds(1000,600,200,40);
        checkScholership.setFont(new Font("user",Font.BOLD,18));
        checkScholership.setForeground(Color.WHITE);
        checkScholership.setBackground(Color.BLACK);
        add(checkScholership);

        setSize(1350,800);
        setLayout(null);
        setTitle("Login page");
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
         admin.addActionListener(this);
         user.addActionListener(this);
         checkScholership.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
     if (e.getSource() == admin)
        {
            setVisible(false);
            new Admin().setVisible(true);
        }
        if (e.getSource() == user)
        {
            setVisible(false);
            new User().setVisible(true);
        }if (e.getSource() == checkScholership)
        {
            setVisible(false);
            new CheckSchole().setVisible(true);
        }
    }



    public static void main(String[] args)
    {
        new First1();
    }

    }
