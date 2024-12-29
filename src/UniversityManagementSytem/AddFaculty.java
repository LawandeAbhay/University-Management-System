package UniversityManagementSytem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddFaculty extends JFrame implements ActionListener {

    JTextField textName,textAddress,textPhone,textEmail,textM10,textFather,textM12,textAadhar;
    JLabel  empText;
    Random ran=new Random();
    JComboBox courseBox,departmentBox;
    JDateChooser cdob;
    JButton submit,cancle;
    long f4=Math.abs((ran.nextLong()% 9000L)+1000L);

    AddFaculty() {

        getContentPane().setBackground(new Color(200, 160, 250));


        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
//Name
        JLabel name = new JLabel("Name");
        name.setBounds(50, 150, 100, 30);
        name.setFont(new Font("serif",Font.BOLD,20));
        add(name);

        textName = new JTextField();
        textName.setBounds(200, 150, 150, 30);
        add(textName);
//Fathers Name
        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(400, 150, 200, 30);
        fname.setFont(new Font("serif",Font.BOLD,20));
        add(fname);

        textFather = new JTextField();
        textFather.setBounds(600, 150, 150, 30);
        add(textFather);
//Employee ID

        JLabel empID = new JLabel("Empoyee ID");
        empID.setBounds(50, 200, 200, 30);
        empID.setFont(new Font("serif",Font.BOLD,20));
        add(empID);

        empText = new JLabel(""+f4);
        empText.setBounds(200, 200, 200, 30);
        empText.setFont(new Font("serif",Font.BOLD,20));
        add(empText);

// Date of Birth
        JLabel dob = new JLabel("Data of Birth");
        dob.setBounds(400, 200, 200, 20);
        dob.setFont(new Font("serif",Font.BOLD,20));
        add(dob);

        cdob=new JDateChooser();
        cdob.setBounds(600, 200, 150, 30);
        add(cdob);
//Address
        JLabel adrress = new JLabel("Address");
        adrress.setBounds(50, 250, 200, 30);
        adrress.setFont(new Font("serif",Font.BOLD,20));
        add(adrress);

        textAddress = new JTextField();
        textAddress.setBounds(200, 250, 150, 30);
        add(textAddress);

//Phone
        JLabel phone = new JLabel("Phone");
        phone.setBounds(400, 250, 200, 30);
        phone.setFont(new Font("serif",Font.BOLD,20));
        add(phone);

        textPhone = new JTextField();
        textPhone.setBounds(600, 250, 150, 30);
        add(textPhone);
//Email ID
        JLabel email = new JLabel("Email ID");
        email.setBounds(50, 300, 200, 30);
        email.setFont(new Font("serif",Font.BOLD,20));
        add(email);

        textEmail = new JTextField();
        textEmail.setBounds(200, 300, 150, 30);
        add(textEmail);

//X Marks
        JLabel M10 = new JLabel("Class X (%)");
        M10.setBounds(400, 300, 200, 30);
        M10.setFont(new Font("serif",Font.BOLD,20));
        add(M10);

        textM10 = new JTextField();
        textM10.setBounds(600, 300, 150, 30);
        add(textM10);

//XII Marks
        JLabel M12 = new JLabel("Class XII (%)");
        M12.setBounds(50, 350, 200, 30);
        M12.setFont(new Font("serif",Font.BOLD,20));
        add(M12);

        textM12 = new JTextField();
        textM12.setBounds(200, 350, 150, 30);
        add(textM12);

//Aadhar Card
        JLabel AadharNo = new JLabel("Aadhar Number");
        AadharNo.setBounds(400, 350, 200, 30);
        AadharNo.setFont(new Font("serif",Font.BOLD,20));
        add(AadharNo);

        textAadhar = new JTextField();
        textAadhar.setBounds(600, 350, 150, 30);
        add(textAadhar);
//Qualification
        JLabel qualification = new JLabel("Qualification");
        qualification.setBounds(50, 400, 200, 30);
        qualification.setFont(new Font("serif",Font.BOLD,20));
        add(qualification);

        String course[]={"B.Tech","BCA","BBA","BSC","B.E","MBA","M.COM","B.A","B.Pharma","D Pharma"};
        courseBox=new JComboBox(course);
        courseBox.setBounds(200, 400, 150, 30);
        courseBox.setBackground(Color.WHITE);
        add(courseBox);
//Department
        JLabel Department = new JLabel("Department");
        Department.setBounds(400, 400, 200, 30);
        Department.setFont(new Font("serif",Font.BOLD,20));
        add(Department);

        String dept[]={"Computer Science","Mechanical","AIDS","CIVIL","Production"};
        departmentBox=new JComboBox(dept);
        departmentBox.setBounds(600, 400, 150, 30);
        departmentBox.setBackground(Color.WHITE);
        add(departmentBox);
//Buttons
        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        cancle = new JButton("Cancel");
        cancle.setBounds(450, 550, 120, 30);
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.addActionListener(this);
        add(cancle);
//






        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            String name=textName.getText();
            String father=textFather.getText();
            String empid=empText.getText();
            String dob=((JTextField) cdob.getDateEditor().getUiComponent()).getText();
            String address=textAddress.getText();
            String phone=textPhone.getText();
            String email=textEmail.getText();
            String class_X=textM10.getText();
            String class_XII=textM12.getText();
            String aadhar=textAadhar.getText();
            String education=(String)courseBox.getSelectedItem();
            String department=(String)departmentBox.getSelectedItem();
            try
            {
//                String q="insert into teacher values('"+name+"','"+fname+"','"+empID+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+class_X+"','"+class_XII+"','"+aadhar+"','"+education+"','"+department+"',)";
//                String q = "INSERT INTO teacher(name, fname, empID, dob, address, phone, email, class_X, class_XII, aadhar, education, department) " +
//                        "VALUES('" + name + "', '" + father + "', '" + empid + "', '" + dob + "', '" + address + "', '" + phone + "', '" + email + "', '" + class_X + "', '" + class_XII + "', '" + aadhar + "', '" + education + "', '" + department + "')";
                Conn c=new Conn();
                if (c.statement != null) {
                    // Proceed with your SQL query
                    String q = "INSERT INTO teacher(name, fname, empID, dob, address, phone, email, class_X, class_XII, aadhar, education, department) " +
                            "VALUES('" + name + "', '" + father + "', '" + empid + "', '" + dob + "', '" + address + "', '" + phone + "', '" + email + "', '" + class_X + "', '" + class_XII + "', '" + aadhar + "', '" + education + "', '" + department + "')";
                    c.statement.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "Record Inserted");
                } else {
                    JOptionPane.showMessageDialog(null, "Statement not initialized!");
                }


//                c.statement.executeUpdate(q);

//                System.out.println("Statement successful");
//                JOptionPane.showMessageDialog(null,"Record Inserted");
//                setVisible(false);

            }catch (Exception E)
            {
                E.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddFaculty();
    }
}
