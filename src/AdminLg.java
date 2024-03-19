


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public  class AdminLg extends JFrame implements ActionListener {

    JMenuBar mb;
    JMenu  Insert, Update,Delete,ShowData ,about,Home,EXIT;
    JMenu INSERTAdmin,INSERTUser,UpdateAdmin,UpdateUser,DELETEAdmin,DELETEUser,ShowAdmin,ShowUser ,Showcertificate;
     JMenuItem AdminSup,UserSUp,From1,From2,ForgetPass,FrogetPass1,UpdateUserF1,UpdateUserF2,DeleteAdmin,DeleteUser,DeleteUserF1,
    DeleteUserF2,ShowAdminD,ShowUserD,ShowUserF1,ShowUserF2,HOME,Exit,About,Showcertificate1;
JLabel label;
JLabel label1;
Timer timer;
    AdminLg(){
        Container c4 = getContentPane();
        JLabel il3 = new JLabel();
        il3.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Screenshot (22).png"));
        Dimension size2 = il3.getPreferredSize();
        il3.setBounds(00, 00, size2.width, size2.height);
        add(il3);

        mb=new JMenuBar();
        mb.setBackground(Color.black);
//        mb.setForeground(Color.white);


        Insert=new JMenu(" INSERT DATA");
        Insert.setFont(new Font("arial",Font.BOLD,15));
        Insert.setForeground(Color.white);

        Update=new JMenu(" UPDATE DATA");
        Update.setFont(new Font("arial",Font.BOLD,15));
        Update.setForeground(Color.white);

        Delete=new JMenu(" DELETE DATA");
        Delete.setFont(new Font("arial",Font.BOLD,15));
        Delete.setForeground(Color.white);

        ShowData=new JMenu(" SHOW DATA");
        ShowData.setFont(new Font("arial",Font.BOLD,15));
        ShowData.setForeground(Color.white);

        about=new JMenu(" ABOUT");
        about.setFont(new Font("arial",Font.BOLD,15));
        about.setForeground(Color.white);
        Showcertificate=new JMenu("SHOW CERTIFICATE");
        Showcertificate.setFont(new Font("arial",Font.BOLD,15));
        Showcertificate.setForeground(Color.white);

        Home=new JMenu("Home");
        Home.setFont(new Font("arial",Font.BOLD,15));
        Home.setForeground(Color.white);

        EXIT=new JMenu(" EXIT");
        EXIT.setFont(new Font("arial",Font.BOLD,15));
        EXIT.setForeground(Color.white);

        mb.add(Home);mb.add(Insert);  mb.add(Update);mb.add(Delete);mb.add(ShowData);mb.add(about);mb.add(Showcertificate);mb.add(EXIT);


        INSERTAdmin=new JMenu("INSERT ADMIN");
        INSERTUser=new JMenu("INSERT USER");
        UpdateAdmin=new JMenu("UPDATE ADMIN");
        UpdateUser=new JMenu("UPDATE USER");
        DELETEAdmin=new JMenu("DELETE ADMIN");
        DELETEUser=new JMenu("DELETE USER");
        ShowAdmin =new JMenu("SHOW ADMIN");
        ShowUser =new JMenu("SHOW USER");
//        Showcertificate =new JMenu("SHOW CERTIFICATE");
        Insert.add(INSERTAdmin);  Insert.add(INSERTUser);
        Update.add(UpdateAdmin);Update.add(UpdateUser);
        Delete.add(DELETEAdmin);Delete.add(DELETEUser);
        ShowData.add(ShowAdmin);ShowData.add(ShowUser);


        AdminSup=new JMenuItem("AdminSignUp");
        UserSUp=new JMenuItem("UserSignUp");
        From1=new JMenuItem("StudentInsertDataF1");
        From2=new JMenuItem("StudentInsertDataF2");
        ForgetPass=new JMenuItem("AdminForgetPassword");
        FrogetPass1=new JMenuItem("UserForgetPassword");
        UpdateUserF1=new JMenuItem("UpdateUserF1");
        UpdateUserF2=new JMenuItem("UpdateUserF2");
        DeleteAdmin=new JMenuItem("Delete Admin");
        DeleteUser=new JMenuItem("Delete User");
        DeleteUserF1=new JMenuItem("DeleteUserF1");
        DeleteUserF2=new JMenuItem("DeleteUserF2");
        ShowAdminD=new JMenuItem("Delete Admin");
        ShowUserD=new JMenuItem("Delete User");
        ShowUserF1=new JMenuItem("DeleteUserF1");
        ShowUserF2=new JMenuItem("DeleteUserF2");
        Showcertificate1=new JMenuItem("SHOW CERTIFICATE");
        HOME=new JMenuItem("Home");
        Exit=new JMenuItem("Exit");
        About=new JMenuItem("About");
        INSERTAdmin.add(AdminSup);INSERTUser.add(UserSUp);INSERTUser.add(From1);INSERTUser.add(From2);
        UpdateAdmin.add(ForgetPass);UpdateUser.add(FrogetPass1);UpdateUser.add(UpdateUserF1);UpdateUser.add(UpdateUserF2);
        DELETEAdmin.add(DeleteAdmin); DELETEUser.add(DeleteUser); DELETEUser.add(DeleteUserF1); DELETEUser.add(DeleteUserF2);
        ShowAdmin.add(ShowAdminD);  ShowUser.add(ShowUserD);  ShowUser.add(ShowUserF1);  ShowUser.add(ShowUserF2);Showcertificate.add(Showcertificate1);
         Home.add(HOME);EXIT.add(Exit);about.add(About);

        il3.add(mb);

        setJMenuBar(mb);
        setLayout(null);
        setSize(1200,900);
        setVisible(true);

            AdminSup.addActionListener(this); UserSUp.addActionListener(this);From1.addActionListener(this);
            From2.addActionListener(this);ForgetPass.addActionListener(this);FrogetPass1.addActionListener(this);
            UpdateUserF1.addActionListener(this);UpdateUserF2.addActionListener(this);
            DeleteAdmin.addActionListener(this);DeleteUser.addActionListener(this);DeleteUserF1.addActionListener(this);
            DeleteUserF2.addActionListener(this);ShowAdminD.addActionListener(this);ShowUserD.addActionListener(this);
            ShowUserF1.addActionListener(this);ShowUserF2.addActionListener(this);
        Showcertificate1.addActionListener(this);
        About.addActionListener(this);
            HOME.addActionListener(this);
            Exit.addActionListener(this);


        label = new JLabel("Shobhit University Gangoh ");
        label.setFont(new Font("arial",Font.BOLD,50));
        label.setForeground(Color.green);
       il3. add(label);

       label1 = new JLabel("      Scholership  Project  ");
        label1.setFont(new Font("arial",Font.BOLD,50));
        label1.setForeground(Color.magenta);
       il3. add(label1);
       timer = new Timer(10, new ActionListener() {
            int x = 100;
            int dx = 2;
            public void actionPerformed(ActionEvent e) {
                x += dx;

                label.setBounds(x, 200, 700, 70);
                label1.setBounds(x, 280, 700, 70);
                if (x + label.getWidth() >= getContentPane().getWidth()) {
                    dx = -2;
                }if (x + label1.getWidth() >= getContentPane().getWidth()) {
                    dx = -2;
                }
                if (x <= 0) {
                    dx = 2;
                }
            }
       });
        timer.start();
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == AdminSup) {
        setVisible(false);
        new AdminSUp().setVisible(true);
    } if (e.getSource() == UserSUp) {
        setVisible(false);
        new UserSUp().setVisible(true);
    } if (e.getSource() == From1) {
        setVisible(false);
        new From1().setVisible(true);
    } if (e.getSource() == From2) {
        setVisible(false);
        new From2("").setVisible(true);
    } if (e.getSource() == ForgetPass) {
        setVisible(false);
        new ForgetPass().setVisible(true);
    } if (e.getSource() == FrogetPass1) {
        setVisible(false);
        new ForgetPass1().setVisible(true);
    } if (e.getSource() == UpdateUserF1) {
        setVisible(false);
        new UpdateUserF1().setVisible(true);
    } if (e.getSource() == UpdateUserF2) {
        setVisible(false);
        new UpdateUserF2("").setVisible(true);
    }if (e.getSource() == DeleteAdmin) {
        setVisible(false);
        new DeleteAdmin().setVisible(true);
    }if (e.getSource() == DeleteUser) {
        setVisible(false);
        new DeleteUser().setVisible(true);
    }if (e.getSource() == DeleteUserF1) {
        setVisible(false);
        new DeleteUserF1().setVisible(true);
    }if (e.getSource() == DeleteUserF2) {
        setVisible(false);
        new DeleteUserF2("").setVisible(true);
    }if (e.getSource() == ShowAdminD) {
        setVisible(false);
        new ShowAdmin().setVisible(true);
    }if (e.getSource() == ShowUserD) {
        setVisible(false);
        new ShowUser().setVisible(true);
    }if (e.getSource() == ShowUserF1) {
        setVisible(false);
        new ShowUserF1().setVisible(true);
    }if (e.getSource() == ShowUserF2) {
        setVisible(false);
        new ShowUserF2().setVisible(true);
    }if (e.getSource() == Showcertificate1) {
        setVisible(false);
//        new Show_CertificateWF().setVisible(true);
    }if (e.getSource() == HOME) {
        setVisible(false);
        new First1().setVisible(true);
    }if (e.getSource() == About ) {
        setVisible(false);
        new Demo1().setVisible(true);
    }if (e.getSource() == Exit) {
        setVisible(false);
        new Admin().setVisible(true);
    }
         }
    public static void main(String[] args) {
        new AdminLg();
    }
}
