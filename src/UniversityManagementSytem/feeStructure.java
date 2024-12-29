package UniversityManagementSytem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class feeStructure extends JFrame implements ActionListener {

    feeStructure() {
        getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel("Fee Structure");
        heading.setBounds(400, 10, 400, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);

        // Define columns based on the fee table structure
        String[] columnNames = {
                "Course", "Semester 1", "Semester 2", "Semester 3", "Semester 4",
                "Semester 5", "Semester 6", "Semester 7", "Semester 8"
        };

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        JTable table = new JTable();
        table.setModel(model);

        try {
            // Connect to database and fetch data from the fee table
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM fee");

            // Iterate over the ResultSet and add rows to the table
            while (resultSet.next()) {
                String course = resultSet.getString("course");
                String semester1 = resultSet.getString("semester1");
                String semester2 = resultSet.getString("semester2");
                String semester3 = resultSet.getString("semester3");
                String semester4 = resultSet.getString("semester4");
                String semester5 = resultSet.getString("semester5");
                String semester6 = resultSet.getString("semester6");
                String semester7 = resultSet.getString("semester7");
                String semester8 = resultSet.getString("semester8");

                // Add row to table model
                model.addRow(new Object[]{
                        course, semester1, semester2, semester3, semester4,
                        semester5, semester6, semester7, semester8
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Adding JScrollPane for the table
        JScrollPane js = new JScrollPane(table);
        js.setBounds(0, 60, 1000, 700);
        add(js);

        setSize(1000, 700);
        setLocation(250, 50);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implement action if needed
    }

    public static void main(String[] args) {
        new feeStructure();
    }
}
