////public class Demo {
////}
//
//            String filename="C:\\Users\\DELL\\Desktop\\\\ExcalJtable.xlsx";
//                    JFileChooser excelFileChooser=new JFileChooser("C:\\\\Users\\\\DELL\\\\Desktop\\\\ExcalJtable.xlsx");
//                    XSSFWorkbook workbook  =new XSSFWorkbook();
//                    XSSFSheet sheet = workbook.createSheet("new Sheet");
////                XSSFRow header =new sheet.createRow((short)0);
//                    XSSFRow header = new  sheet.createRow();
//                    header.createCell((short)0).setCellValue("Email");
//                    header.createCell((short)1).setCellValue("Department");
//                    header.createCell((short)2).setCellValue("Name");
//                    header.createCell((short)3).setCellValue("Gender");
//                    header.createCell((short)4).setCellValue("Password");
//                    try{
//                    FileOutputStream fileout = new FileOutputStream(filename);
//                    workbook.write(fileout);
//                    JOptionPane.showMessageDialog(null,"Excel file has been exported");
//                    }catch (Exception e1)
//                    {
//                    JOptionPane.showMessageDialog(null,e1);
//
//                    }

////////import javax.swing.*;
////////import java.awt.event.*;
////////
////////public class Demo {
////////    private JFrame frame;
////////    private JLabel label;
////////    private Timer timer;
////////    private int x, y;
////////
////////    public Demo() {
////////        frame = new JFrame("Moving Label");
////////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////////        frame.setSize(400, 400);
////////        frame.setLayout(null);
////////
////////        label = new JLabel("Move me!");
////////        label.setSize(label.getPreferredSize());
////////        frame.add(label);
////////
////////        x = 0;
////////        y = 0;
////////
////////        timer = new Timer(100, new ActionListener() {
////////            public void actionPerformed(ActionEvent e) {
////////                x += 5;
////////                y += 5;
////////                label.setLocation(x, y);
////////            }
////////        });
////////        timer.start();
////////
////////        frame.setVisible(true);
////////    }
////////
////////    public static void main(String[] args) {
////////        new Demo();
////////    }
////////}
//////////
////////
////////import javax.swing.*;
////////import java.awt.*;
////////import java.awt.event.*;
////////
////////public class Demo {
////////    private JFrame frame;
////////    private JLabel label;
////////    private Timer timer;
////////    private int x, y;
////////    private int count;
////////
////////    public Demo() {
////////        frame = new JFrame("Moving Image");
////////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////////        frame.setSize(1300, 1000);
////////        frame.setLayout(null);
////////
////////        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Pictures\\Screenshot (20).png");
////////        label = new JLabel(icon);
////////        label.setSize(icon.getIconWidth(), icon.getIconHeight());
////////        frame.add(label);
////////
////////        x = 0;
////////        y = 0;
////////        count = 0;
////////
////////        timer = new Timer(100, new ActionListener() {
////////            public void actionPerformed(ActionEvent e) {
////////                x += 5;
////////                y += 5;
////////                label.setLocation(x, y);
////////                count++;
////////                if (count >= 200) {
////////                    timer.start();
////////                }
////////            }
////////        });
////////        timer.start();
////////
////////        frame.setVisible(true);
////////    }
////////
////////    public static void main(String[] args) {
////////        new Demo();
////////    }
////////}
//////
////////import javax.swing.*;
////////import java.awt.*;
////////import java.awt.event.*;
////////
////////public class Demo {
////////    private JFrame frame;
////////    private JLabel label;
////////    private int x, y;
////////    private boolean running;
////////
////////    public Demo() {
////////        frame = new JFrame("Repeating Image");
////////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////////        frame.setSize(400, 400);
////////        frame.setLayout(null);
////////
////////        ImageIcon icon = new ImageIcon("C:\\\\Users\\\\DELL\\\\Pictures\\\\Screenshot (20).png");
////////        label = new JLabel(icon);
////////        label.setSize(icon.getIconWidth(), icon.getIconHeight());
////////        frame.add(label);
////////
////////        x = 0;
////////        y = 0;
////////
////////        running = true;
////////
////////        Thread thread = new Thread(new Runnable() {
////////            public void run() {
////////                while (running) {
////////                    try {
////////                        Thread.sleep(100);
////////                    } catch (InterruptedException e) {
////////                        e.printStackTrace();
////////                    }
////////                    x += 5;
////////                    y += 5;
////////                    if (x > frame.getWidth() || y > frame.getHeight()) {
////////                        x = 0;
////////                        y = 0;
////////                    }
////////                    label.setLocation(x, y);
////////                }
////////            }
////////        });
////////        thread.start();
////////
////////        frame.setVisible(true);
////////    }
////////
////////    public static void main(String[] args) {
////////        new Demo();
////////    }
////////}
//////
////////import javax.swing.*;
////////import java.awt.event.*;
////////
////////public class Demo extends JFrame {
////////    private JLabel label;
////////    private Timer timer;
////////
////////    public Demo() {
////////        label = new JLabel("Move me vertically!");
////////        label.setBounds(100, 100, 100, 20); // set initial position
////////        add(label);
////////
////////        timer = new Timer(10, new ActionListener() {
////////            int y = 100; // initial y-coordinate
////////            int dy = 1; // amount of pixels to move each time
////////
////////            public void actionPerformed(ActionEvent e) {
////////                y += dy; // move the label vertically
////////                label.setBounds(100, y, 100, 20); // set new position
////////
////////                // check if the label has reached the bottom of the frame
////////                if (y + label.getHeight() >= getContentPane().getHeight()) {
////////                    dy = -1; // change direction to move up
////////                }
////////
////////                // check if the label has reached the top of the frame
////////                if (y <= 0) {
////////                    dy = 1; // change direction to move down
////////                }
////////            }
////////        });
////////        timer.start(); // start the timer
////////    }
////////
////////    public static void main(String[] args) {
////////        Demo  frame = new Demo();
////////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////////        frame.setSize(300, 300);
////////        frame.setVisible(true);
////////    }
////////}
//////import javax.swing.*;
//////import java.awt.event.*;
//////
//////public class Demo extends JFrame {
//////    private JLabel label;
//////    private Timer timer;
//////
//////    public Demo() {
//////        label = new JLabel("Move me horizontally!");
//////        label.setBounds(100, 100, 100, 20); // set initial position
//////        add(label);
//////
//////        timer = new Timer(10, new ActionListener() {
//////            int x = 100;
//////            int dx = 1;
//////            public void actionPerformed(ActionEvent e) {
//////                x += dx;
//////                label.setBounds(x, 100, 100, 20);
//////                if (x + label.getWidth() >= getContentPane().getWidth()) {
//////                    dx = -1;
//////                }
//////                if (x <= 0) {
//////                    dx = 1;
//////                }
//////            }
//////        });
//////        timer.start(); // start the timer
//////    }
//////
//////    public static void main(String[] args) {
//////        Demo frame = new Demo();
//////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//////        frame.setSize(300, 300);
//////        frame.setVisible(true);
//////    }
//////}
//////
//////
//////
//////
//////
//////
//////
////
////
////
////
////
////import javax.swing.*;
////import java.awt.*;
////import java.awt.event.ActionEvent;
////import java.awt.event.ActionListener;
////import java.awt.event.ItemEvent;
////import java.awt.event.ItemListener;
////import java.sql.Connection;
////import java.sql.DriverManager;
////import java.sql.ResultSet;
////import java.sql.Statement;
////
////public class Show_Certificate1 extends Frame implements ActionListener {
////
////    JLabel jb0;
////    JLabel jb1;
////    JLabel jb2;
////    JLabel jb3;
////    JLabel jb4;
////    JLabel jb8;
////
////
////    JButton print;
////    JButton back;
////    Choice cho;
////
////
////    JFrame f;
////    Show_Certificate1()
////    {
////        f=new JFrame();
////
////        JLabel il3 = new JLabel();
////        il3.setIcon(new ImageIcon("C:\\Users\\DELL\\Pictures\\Screenshot (20).png"));
////        Dimension size2 = il3.getPreferredSize();
////        il3.setBounds(10, 80, size2.width, size2.height);
////        add(il3);
////
//////
////        jb0 = new JLabel();
////        jb0.setBounds(400, 392, 200, 40);
////        jb0.setFont(new Font("arial", Font.BOLD, 20));
////        il3.add(jb0);
////
////
////        jb1 = new JLabel();
////        jb1.setBounds(750, 392, 200, 40);
////        jb1.setFont(new Font("arial", Font.BOLD, 15));
////        il3.add(jb1);
////
////        jb2 = new JLabel();
////        jb2.setBounds(220, 422, 150, 40);
////        jb2.setFont(new Font("arial", Font.BOLD, 20));
////        il3.add(jb2);
////
////
////        jb3 = new JLabel();
////        jb3.setBounds(460, 423, 200, 40);
////        jb3.setFont(new Font("arial", Font.BOLD, 15));
////        il3.add(jb3);
////
////        jb4 = new JLabel();
////        jb4.setBounds(830, 470, 80, 40);
////        jb4.setFont(new Font("arial", Font.BOLD, 20));
////        il3.add(jb4);
////
////
////        jb8 = new JLabel("Search User RollNO :");
////        jb8.setBounds(20,30,250,40);
////        jb8.setFont(new Font("arial",Font.BOLD,22));
////        jb8.setForeground(Color.blue);
////        add(jb8);
////
////        cho= new Choice();
////        cho.setBounds(275,30,200,40);
////        cho.setFont(new Font("arial",Font.BOLD,22));
////        add(cho);
////        try{
////            String driver = "com.mysql.cj.jdbc.Driver";
////            String datbaseurl = "jdbc:mysql://localhost:3306/university";
////            String Username = "root";
////            String Password = "sachin@123";
////            Class.forName(driver);
////            Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
////            System.out.println("Database Connected");
////            String q1="select * from CheckScholer ";
////            Statement stmt = conn.createStatement();
////            ResultSet rs = stmt.executeQuery(q1);
////            while(rs.next())
////            {
////                cho.add(rs.getString("10th_RollNO"));
////            }
////        }catch (Exception ex1) {
////            ex1.printStackTrace();
////        }
////        cho.addItemListener(new ItemListener() {
////            @Override
////            public void itemStateChanged(ItemEvent e) {
////
////                try {
////                    String driver = "com.mysql.cj.jdbc.Driver";
////                    String datbaseurl = "jdbc:mysql://localhost:3306/university";
////                    String Username = "root";
////                    String Password = "sachin@123";
////                    Class.forName(driver);
////                    Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
////                    System.out.println("Database Connected");
////                    String q1 = "select * from  CheckScholer where 10th_RollNO='"+cho.getSelectedItem()+"'";
////                    Statement stmt = conn.createStatement();
////                    ResultSet rs = stmt.executeQuery(q1);
////                    while (rs.next()) {
////                        jb0.setText(rs.getString("Name"));
////                        jb1.setText(rs.getString("Father"));
////                        jb2.setText(rs.getString("Course"));
////                        jb3.setText(rs.getString("Branch"));
////
////                    }
////                } catch (Exception ex1) {
////                    ex1.printStackTrace();
////                    System.out.println(ex1);
////                }
////
////            }
////        });
////
////
////
////
////        print = new JButton("Print");
////        print.setBounds(900, 30, 100, 30);
////        print.setFont(new Font("user", Font.BOLD, 18));
////        print.setForeground(Color.WHITE);
////        print.setBackground(Color.blue);
////        add(print);
////
////        back = new JButton("back");
////        back.setBounds(750, 30, 100, 30);
////        back.setFont(new Font("user", Font.BOLD, 18));
////        back.setForeground(Color.WHITE);
////        back.setBackground(Color.black);
////        add(back);
////
////
////        setSize(1100,730);
////        setLayout(null);
////        setTitle("Certificate");
////        setVisible(true);
////        print.addActionListener(this);
////        back.addActionListener(this);
////
////    }
////    public void actionPerformed(ActionEvent e) {
////
//////        if (e.getSource() == print) {
//////            try{
//////               f.print();
//////            }catch (Exception ex) {
//////                ex.printStackTrace();
//////            }
//////        }
////        if (e.getSource() == back)
////        {
////            setVisible(false);
////            new First1().setVisible(true);
////        }
////
////    }
////
////    public static void main(String[] args) {
////        new Show_Certificate1();
////
////    }
////}
//
//
//
//
//
//
//
//import javax.swing.*;
//import javax.swing.table.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.io.*;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.*;
//
//public class JTableToExcel extends JFrame {
//
//    private JTable table;
//    private JButton exportButton;
//
//    public JTableToExcel() {
//        super("JTable to Excel");
//
//        // Create sample data for JTable
//        Object[][] data = {
//                {"John", "Doe", 28},
//                {"Jane", "Doe", 25},
//                {"Bob", "Smith", 35},
//                {"Alice", "Johnson", 20},
//                {"Peter", "Lee", 42}
//        };
//        String[] columnNames = { "First Name", "Last Name", "Age" };
//        table = new JTable(data, columnNames);
//
//        // Create export button
//        exportButton = new JButton("Export");
//        exportButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                exportToExcel();
//            }
//        });
//
//        // Add components to content pane
//        JPanel contentPane = (JPanel) getContentPane();
//        contentPane.setLayout(new BorderLayout());
//        contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
//        contentPane.add(exportButton, BorderLayout.SOUTH);
//
//        // Set window properties
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 300);
//        setLocationRelativeTo(null);
//        setVisible(true);
//    }
//
//    private void exportToExcel() {
//        try {
//            // Create Excel workbook and sheet
//            XSSFWorkbook workbook = new XSSFWorkbook();
//            XSSFSheet sheet = workbook.createSheet("JTable Data");
//
//            // Get JTable data and column names
//            TableModel model = table.getModel();
//            int rowCount = model.getRowCount();
//            int columnCount = model.getColumnCount();
//            Object[] columns = new Object[columnCount];
//            for (int i = 0; i < columnCount; i++) {
//                columns[i] = model.getColumnName(i);
//            }
//
//            // Write column names to first row of Excel sheet
//            XSSFRow header = sheet.createRow(0);
//            for (int i = 0; i < columnCount; i++) {
//                XSSFCell cell = header.createCell(i);
//                cell.setCellValue(columns[i].toString());
//            }
//
//            // Write JTable data to remaining rows of Excel sheet
//            for (int i = 0; i < rowCount; i++) {
//                XSSFRow row = sheet.createRow(i+1);
//                for (int j = 0; j < columnCount; j++) {
//                    XSSFCell cell = row.createCell(j);
//                    cell.setCellValue(model.getValueAt(i, j).toString());
//                }
//            }
//
//            // Save Excel file
//            JFileChooser fileChooser = new JFileChooser();
//            int result = fileChooser.showSaveDialog(this);
//            if (result == JFileChooser.APPROVE_OPTION) {
//                File file = fileChooser.getSelectedFile();
//                FileOutputStream outputStream = new FileOutputStream(file);
//                workbook.write(outputStream);
////////                workbook.close();
////////                JOptionPane.showMessageDialog(this, "Excel file saved successfully!");
////////            }
////////        } catch (IOException ex) {
////////            ex.printStackTrace();
////////            JOptionPane.showMessageDialog(this, "Error exporting to Excel.");
////////        }
////////    }
////////
////////    public static void main(String[] args) {
////////        new JTableToExcel();
////////    }
////////}
//////
//////
//////
//////import javax.swing.*;
//////import javax.swing.table.*;
//////import java.awt.*;
//////import java.awt.event.*;
//////import java.io.*;
//////import java.sql.*;
//////import org.apache.poi.ss.usermodel.*;
//////import org.apache.poi.xssf.usermodel.*;
//////
//////public class JTableToExcel extends JFrame {
//////
//////    private JTable table;
//////    private JButton exportButton;
//////    private Connection conn;
//////
//////    public JTableToExcel() {
//////        super("JTable to Excel");
//////
//////        // Connect to MySQL database
//////        try {
//////            Class.forName("com.mysql.cj.jdbc.Driver");
//////            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "password");
//////        } catch (Exception ex) {
//////            ex.printStackTrace();
//////            JOptionPane.showMessageDialog(this, "Error connecting to database.");
//////        }
//////
//////        // Create JTable from MySQL data
//////        String query = "SELECT * FROM mytable";
//////        try {
//////            Statement stmt = conn.createStatement();
//////            ResultSet rs = stmt.executeQuery(query);
//////            ResultSetMetaData rsmd = rs.getMetaData();
//////            int columnCount = rsmd.getColumnCount();
//////            String[] columnNames = new String[columnCount];
//////            for (int i = 0; i < columnCount; i++) {
//////                columnNames[i] = rsmd.getColumnLabel(i+1);
//////            }
//////            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//////            while (rs.next()) {
//////                Object[] row = new Object[columnCount];
//////                for (int i = 0; i < columnCount; i++) {
//////                    row[i] = rs.getObject(i+1);
//////                }
//////                model.addRow(row);
//////            }
//////            table = new JTable(model);
//////        } catch (Exception ex) {
//////            ex.printStackTrace();
//////            JOptionPane.showMessageDialog(this, "Error creating JTable from database.");
//////        }
//////
//////        // Create export button
//////        exportButton = new JButton("Export");
//////        exportButton.addActionListener(new ActionListener() {
//////            public void actionPerformed(ActionEvent e) {
//////                exportToExcel();
//////            }
//////        });
//////
//////        // Add components to content pane
//////        JPanel contentPane = (JPanel) getContentPane();
//////        contentPane.setLayout(new BorderLayout());
//////        contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
//////        contentPane.add(exportButton, BorderLayout.SOUTH);
//////
//////        // Set window properties
//////        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//////        setSize(400, 300);
//////        setLocationRelativeTo(null);
//////        setVisible(true);
//////    }
//////
//////    private void exportToExcel() {
//////        try {
//////            // Create Excel workbook and sheet
//////            XSSFWorkbook workbook = new XSSFWorkbook();
//////            XSSFSheet sheet = workbook.createSheet("JTable Data");
//////
//////            // Get JTable data and column names
//////            TableModel model = table.getModel();
//////            int rowCount = model.getRowCount();
//////            int columnCount = model.getColumnCount();
//////            Object[] columns = new Object[columnCount];
//////            for (int i = 0; i < columnCount; i++) {
//////                columns[i] = model.getColumnName(i);
//////            }
//////
//////            // Write column names to first row of Excel sheet
//////            XSSFRow header = sheet.createRow(0);
//////            for (int i = 0; i < columnCount; i++) {
//////                XSSFCell cell = header.createCell(i);
//////                cell.setCellValue(columns[i].toString());
//////            }
//////
//////            // Write JTable data to remaining rows of Excel sheet
//////            for (int i = 0; i < rowCount; i++) {
//////                XSSFRow row = sheet.createRow(i+1);
//////                for (int j = 0; j < columnCount; j++) {
//////                    XSSFCell cell = row.createCell(j);
//////                    cell.setCellValue(model.getValueAt(i, j).toString
////
////
////
////
////import java.awt.BorderLayout;
////import java.awt.event.ActionEvent;
////import java.awt.event.ActionListener;
////import java.io.FileOutputStream;
////import java.sql.Connection;
////import java.sql.DriverManager;
////import java.sql.ResultSet;
////import java.sql.Statement;
////import javax.imageio.stream.ImageInputStream;
////import javax.swing.JButton;
////import javax.swing.JFrame;
////import javax.swing.JOptionPane;
////import javax.swing.JPanel;
////import javax.swing.JScrollPane;
////import javax.swing.JTable;
////import javax.swing.table.DefaultTableModel;
////import org.apache.poi.ss.usermodel.Cell;
////import org.apache.poi.ss.usermodel.Row;
////import org.apache.poi.xssf.usermodel.XSSFSheet;
////import org.apache.poi.xssf.usermodel.XSSFWorkbook;
////
////public class Demo extends JFrame {
////
////    private JTable table;
////    private JButton exportButton;
////    private Connection conn;
////    private String query = "SELECT * FROM mytable";
////
////    public Demo() {
////        super("JTable to Excel");
////        initializeDB();
////        initializeTable();
////        initializeExportButton();
//////        initializeUI();
////    }
////
////    private void initializeDB() {
////        try {
////            // Replace databaseName, username and password with your MySQL database details
////            String databaseName = "your_database_name";
////            String username = "your_username";
////            String password = "your_password";
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, username, password);
////        } catch (Exception ex) {
////            ex.printStackTrace();
////            JOptionPane.showMessageDialog(this, "Error connecting to database.");
////            System.exit(1);
////        }
////    }
////
////    private void initializeTable() {
////        try {
////            Statement stmt = conn.createStatement();
////            ResultSet rs = stmt.executeQuery(query);
////            DefaultTableModel model = new DefaultTableModel();
////            int columnCount = rs.getMetaData().getColumnCount();
////            for (int i = 1; i <= columnCount; i++) {
////                model.addColumn(rs.getMetaData().getColumnName(i));
////            }
////            while (rs.next()) {
////                Object[] rowData = new Object[columnCount];
////                for (int i = 1; i <= columnCount; i++) {
////                    rowData[i - 1] = rs.getObject(i);
////                }
////                model.addRow(rowData);
////            }
////            table = new JTable(model);
////        } catch (Exception ex) {
////            ex.printStackTrace();
////            JOptionPane.showMessageDialog(this, "Error creating JTable from database.");
////            System.exit(1);
////        }
////    }
////
////    private void initializeExportButton() {
////        exportButton = new JButton("Export");
////        exportButton.addActionListener(new ActionListener() {
////            public void actionPerformed(ActionEvent e) {
////                try {
////                    XSSFWorkbook workbook = new XSSFWorkbook();
////                    XSSFSheet sheet = workbook.createSheet("JTable Data");
////                    DefaultTableModel model = (DefaultTableModel) table.getModel();
////                    Object[] columnNames = new Object[model.getColumnCount()];
////                    for (int i = 0; i < model.getColumnCount(); i++) {
////                        columnNames[i] = model.getColumnName(i);
////                    }
////                    Row header = sheet.createRow(0);
////                    for (int i = 0; i < columnNames.length; i++) {
////                        Cell cell = header.createCell(i);
////                        cell.setCellValue(columnNames[i].toString());
////                    }
////                    for (int i = 0; i < model.getRowCount(); i++) {
////                        Row row = sheet.createRow(i + 1);
////                        for (int j = 0; j < model.getColumnCount(); j++) {
////                            Cell cell = row.createCell(j);
////                            cell.setCellValue(model.getValueAt(i, j).toString());
////                        }
////                    }
////                    FileOutputStream outputStream = new FileOutputStream(12);
////                    ImageInputStream
//
//
//
//import java.io.FileOutputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ShowAdmin {
//
//    public static void main(String[] args) {
//        try{
////
////        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database_name";
////        String username = "your_username";
////        String password = "your_password";
////        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
////            Statement statement = connection.createStatement();
////            String query = "SELECT * FROM your_table_name";
////            ResultSet resultSet = statement.executeQuery(query);
//            String driver = "com.mysql.cj.jdbc.Driver";
//            String datbaseurl = "jdbc:mysql://localhost:3306/university";
//            String Username = "root";
//            String Password = "sachin@123";
//            Class.forName(driver);
//            Connection conn = DriverManager.getConnection(datbaseurl, Username, Password);
//            System.out.println("Database Connected");
//            String q2="select * from  adminsup ";
//            Statement stmt = conn.createStatement();
//            ResultSet resultSet = stmt.executeQuery(q2);
//            XSSFWorkbook workbook = new XSSFWorkbook();
//            XSSFSheet sheet = workbook.createSheet("Book1.xlsx");
//            int rowNum = 0;
//            Row row = sheet.createRow(rowNum++);
//            int columnCount = resultSet.getMetaData().getColumnCount();
//
//            // Create header row
//            for (int i = 1; i <= columnCount; i++) {
//                Cell cell = row.createCell(i - 1);
//                cell.setCellValue(resultSet.getMetaData().getColumnLabel(i));
//            }
//
//            // Create data rows
//            while (resultSet.next()) {
//                row = sheet.createRow(rowNum++);
//                for (int i = 1; i <= columnCount; i++) {
//                    Cell cell = row.createCell(i - 1);
//                    cell.setCellValue(resultSet.getString(i));
//                }
//            }
//
//            // Write to Excel file
//            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\DELL\\Desktop");
//            workbook.write(outputStream);
//            workbook.close();
//            System.out.println("Data exported successfully to Book1.xlsx");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}


//import java.awt.print.PrinterException;
//import java.awt.print.PrinterJob;
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import javax.swing.JPanel;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class Demo {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Print Frame");
//        JPanel panel = new JPanel();
//        frame.add(panel);
//        JButton printButton = new JButton("Print");
//        printButton.setActionCommand("print");
//        panel.add(printButton);
//        printButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                if ("print".equals(e.getActionCommand())) {
//                    PrinterJob job = PrinterJob.getPrinterJob();
//                    if (job.printDialog()) {
//                        try {
//                            job.print();
//                        } catch (PrinterException ex) {
//                            // handle exception
//                        }
//                    }
//                }
//            }
//        });
//        frame.setSize(400, 400);
//        frame.setVisible(true);
//    }
//}
//




