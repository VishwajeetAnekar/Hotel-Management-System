
package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        setForeground(Color.CYAN);
        setLayout(null);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/wallpaper.png"));
        Image i2 = i1.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, screenWidth, screenHeight);
        add(NewLabel);

        JLabel hotelNameLabel = new JLabel("EYLYSIUM");
        hotelNameLabel.setForeground(Color.DARK_GRAY);
        hotelNameLabel.setFont(new Font("Script MT Bold", Font.BOLD, 100));
        hotelNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        hotelNameLabel.setVerticalAlignment(SwingConstants.TOP);
        hotelNameLabel.setBounds(0, 0, screenWidth, screenHeight);
        NewLabel.add(hotelNameLabel);


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu hms = new JMenu("HOTEL");
        hms.setForeground(Color.BLUE);
        menuBar.add(hms);

        JMenuItem hotelDetails = new JMenuItem("RECEPTION");
        hms.add(hotelDetails);

        JMenu adminDetails = new JMenu("ADMIN");
        adminDetails.setForeground(Color.blue);
        menuBar.add(adminDetails);

        JMenuItem admin1 = new JMenuItem("ADD EMPLOYEE");
        adminDetails.add(admin1);

        admin1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
        });


        JMenuItem admin2 = new JMenuItem("ADD ROOMS");
        adminDetails.add(admin2);

        admin2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
        });


        hotelDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
        });


        JMenuItem admin3 = new JMenuItem("ADD DRIVERS");
        adminDetails.add(admin3);

        admin3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
        });


        setSize(screenWidth,screenHeight);
        setVisible(true);
        getContentPane().setBackground(Color.black);
    }
}
