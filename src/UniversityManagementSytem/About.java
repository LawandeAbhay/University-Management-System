package UniversityManagementSytem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class About extends JFrame {

    About() {
        // Set Frame Properties
        setTitle("About Me");
        setSize(700, 400);
        setLocation(400, 150);
        getContentPane().setBackground(new Color(252, 228, 210));
        setLayout(null);

        // Photo Section
            ImageIcon photoIcon = new ImageIcon(ClassLoader.getSystemResource("icon/photo1.jpg"));
            Image photo = photoIcon.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
            JLabel photoLabel = new JLabel(new ImageIcon(photo));
            photoLabel.setBounds(40, 40, 150, 200);
            add(photoLabel);

        // Name Label
        JLabel nameLabel = new JLabel("Name: Abhay Lawande");
        nameLabel.setBounds(220, 60, 400, 30);
        nameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(nameLabel);

        // College Label
        JLabel collegeLabel = new JLabel("College: AVCOE Sangamner");
        collegeLabel.setBounds(220, 100, 400, 30);
        collegeLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(collegeLabel);

        // Branch Label
        JLabel branchLabel = new JLabel("Branch: Computer Science");
        branchLabel.setBounds(220, 140, 400, 30);
        branchLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(branchLabel);

        // Email Label
        JLabel emailLabel = new JLabel("Email: abhaylawande2002@gmail.com");
        emailLabel.setBounds(220, 180, 400, 30);
        emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(emailLabel);

        // Phone Label
        JLabel phoneLabel = new JLabel("Phone: +91 8010877540");
        phoneLabel.setBounds(220, 220, 400, 30);
        phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(phoneLabel);

        // LinkedIn Section
        JLabel linkedinLabel = new JLabel("LinkedIn:");
        linkedinLabel.setBounds(50, 250, 100, 30);
        linkedinLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(linkedinLabel);

        ImageIcon linkedinIcon = new ImageIcon(ClassLoader.getSystemResource("icon/LiniedIn.png")); // Replace with LinkedIn icon path
        Image linkedinImage = linkedinIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JLabel linkedinIconLabel = new JLabel(new ImageIcon(linkedinImage));
        linkedinIconLabel.setBounds(150, 250, 30, 30);
        add(linkedinIconLabel);

        // Make LinkedIn Icon Clickable
        linkedinIconLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        linkedinIconLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/abhay-lawande-2b630326b/")); // Replace with your LinkedIn profile URL
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Footer Note
        JLabel footerNote = new JLabel("Designed by A. S. Lawande");
        footerNote.setBounds(220, 500, 300, 30);
        footerNote.setFont(new Font("Tahoma", Font.ITALIC, 16));
        footerNote.setForeground(Color.GRAY);
        add(footerNote);

        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}
