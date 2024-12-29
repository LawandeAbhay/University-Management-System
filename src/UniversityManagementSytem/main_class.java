package UniversityManagementSytem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    main_class() {
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/MainBG.jpg"));
    Image i2=i1.getImage().getScaledInstance(1540, 950, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel l1=new JLabel(i3);
    add(l1);

    JMenuBar mb=new JMenuBar();

//new

    JMenu newInfo=new JMenu("New Information");
    newInfo.setForeground(Color.black);
    mb.add(newInfo);

    JMenuItem facultyInfo =new JMenuItem("Faculty Information");
    facultyInfo.setBackground(Color.white);
    facultyInfo.addActionListener(this);
    newInfo.add(facultyInfo);

    JMenuItem studentInfo =new JMenuItem("Student Information");
    studentInfo.setBackground(Color.white);
    studentInfo.addActionListener(this);
    newInfo.add(studentInfo);
//Details
        JMenu details=new JMenu("View Details");
        details.setForeground(Color.black);
        mb.add(details);

        JMenuItem facultyDetails=new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.white);
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);

        JMenuItem studentDetails =new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.white);
        studentDetails.addActionListener(this);
        details.add(studentDetails);
//Update Info
       JMenu updateInfo=new JMenu("Update Information");
       updateInfo.setForeground(Color.black);
       mb.add(updateInfo);

       JMenuItem facultyUpdateInfo=new JMenuItem("Update Faculty Details");
       facultyUpdateInfo.setBackground(Color.white);
       facultyUpdateInfo.addActionListener(this);
       updateInfo.add(facultyUpdateInfo);

       JMenuItem studentUpdateInfo=new JMenuItem("Update Student Details");
       studentUpdateInfo.setBackground(Color.white);
       studentUpdateInfo.addActionListener(this);
       updateInfo.add(studentUpdateInfo);

//Examination
        JMenu exam=new JMenu("Examination");
        exam.setForeground(Color.black);
        mb.add(exam);

        JMenuItem Exam=new JMenuItem("Marks Details");
        Exam.setBackground(Color.white);
        Exam.addActionListener(this);
        exam.add(Exam);

        JMenuItem EnterMarks=new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.white);
        EnterMarks.addActionListener(this);
        exam.add(EnterMarks);
//Fess
        JMenu fee=new JMenu("Fees Details");
        fee.setForeground(Color.black);
        mb.add(fee);

        JMenuItem feeStructure=new JMenuItem("Fee Structure");
        feeStructure.setBackground(Color.white);
        feeStructure.addActionListener(this);
        fee.add(feeStructure);

//        JMenuItem feeForm=new JMenuItem("Student Feess Form");
//        feeForm.setBackground(Color.white);
//        fee.add(feeForm);
//Utility
        JMenu utility=new JMenu(("Utility"));
        utility.setForeground(Color.black);
        mb.add(utility);

        JMenuItem notepad=new JMenuItem("Notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calculator=new JMenuItem("Calculator");
        calculator.setBackground(Color.white);
        calculator.addActionListener(this);
        utility.add(calculator);

//About
        JMenu about=new JMenu("About");
        about.setForeground(Color.black);
        mb.add(about);

        JMenuItem About=new JMenuItem("About");
        About.setBackground(Color.white);
        About.addActionListener(this);
        about.add(About);
//Exit
        JMenu exit=new JMenu("Exit");
        exit.setForeground(Color.black);
        mb.add(exit);

        JMenuItem Exit=new JMenuItem("Exit");
        Exit.setBackground(Color.white);
        Exit.addActionListener(this);
        exit.add(Exit);


        setJMenuBar(mb);



     setSize(1540,850);
     setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String sm=e.getActionCommand();
         if(sm.equals("Exit"))
         {
             System.exit(15);
         }
         else if(sm.equals("Calculator"))
         {
             try
             {
                 Runtime.getRuntime().exec("calc.exe");
             } catch (Exception ex) {
                 ex.printStackTrace();
             }
         }
         else if(sm.equals("Notepad"))
         {
             try
             {
                Runtime.getRuntime().exec("notepad.exe") ;
             }catch(Exception ex)
             {
                 ex.printStackTrace();
             }
         }
         else if(sm.equals("Faculty Information"))
         {
             new AddFaculty();
         }
         else if(sm.equals("Student Information"))
         {
             new AddStudent();
         }
         else if(sm.equals("About"))
         {
             new About();
         }
         else if(sm.equals("Fee Structure"))
         {
             new feeStructure();
         }
         else if(sm.equals("Marks Details"))
         {
             new ExaminationDetails();
         }
         else if(sm.equals("Enter Marks"))
         {
             new EnterMarks();
         }
         else if(sm.equals("Update Faculty Details"))
         {
             new UpdateTeacher();
         }
         else if(sm.equals("Update Student Details"))
         {
             new UpdateStudent();
         }
         else if(sm.equals("View Faculty Details"))
         {
             new TeacherDetails();
         }
         else if(sm.equals("View Student Details"))
         {
             new StudentDetails();
         }
    }
    public static void main(String[] args) {
     new main_class();
    }
}
