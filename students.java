package javaswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class students extends JFrame implements ActionListener {
    private JTextField sroll, sname, sdob, sadd;
    private JTextArea sdetails;
    private JButton submitButton;
    private JRadioButton male, female;
    private ButtonGroup genderGroup;
    private JComboBox<String> course;

    public students() {
        setTitle("Student Details Form");
        setSize(700, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel heading = new JLabel("STUDENT DETAILS FORM");
        heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        heading.setForeground(Color.RED);
        heading.setBounds(250, 10, 300, 30);
        add(heading);

        JLabel l1 = new JLabel("Enter student roll no:");
        l1.setBounds(10, 50, 150, 20);
        add(l1);

        sroll = new JTextField(20);
        sroll.setBounds(170, 50, 150, 20);
        add(sroll);

        JLabel l2 = new JLabel("Enter student name:");
        l2.setBounds(10, 80, 150, 20);
        add(l2);

        sname = new JTextField(20);
        sname.setBounds(170, 80, 150, 20);
        add(sname);

        JLabel l3 = new JLabel("Enter student DOB:");
        l3.setBounds(10, 110, 150, 20);
        add(l3);

        sdob = new JTextField(20);
        sdob.setBounds(170, 110, 150, 20);
        add(sdob);

        JLabel l4 = new JLabel("Department:");
        l4.setBounds(10, 140, 150, 20);
        add(l4);

        course = new JComboBox<>(new String[]{"CSE", "ECE", "EEE", "BME", "IT"});
        course.setBounds(170, 140, 150, 20);
        add(course);

        JLabel l5 = new JLabel("Select gender:");
        l5.setBounds(10, 170, 150, 20);
        add(l5);

        male = new JRadioButton("Male");
        male.setBounds(170, 170, 70, 20);
        male.setBackground(Color.LIGHT_GRAY);
        female = new JRadioButton("Female");
        female.setBounds(250, 170, 80, 20);
        female.setBackground(Color.LIGHT_GRAY);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        male.setSelected(true); 

        add(male);
        add(female);

        JLabel l6 = new JLabel("Address:");
        l6.setBounds(10, 200, 150, 20);
        add(l6);

        sadd = new JTextField(150);
        sadd.setBounds(170, 200, 200, 60);
        add(sadd);

        submitButton = new JButton("Submit");
        submitButton.setBounds(170, 270, 100, 30);
        submitButton.addActionListener(this);
        add(submitButton);

        sdetails = new JTextArea();
        sdetails.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(sdetails);
        scrollPane.setBounds(400, 50, 250, 210);
        add(scrollPane);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String gender = male.isSelected() ? "Male" : "Female";

        String strDetails = "Roll No: " + sroll.getText() + "\n";
        strDetails += "Name: " + sname.getText() + "\n";
        strDetails += "DOB: " + sdob.getText() + "\n";
        strDetails += "Department: " + course.getSelectedItem() + "\n";
        strDetails += "Gender: " + gender + "\n";
        strDetails += "Address: " + sadd.getText();

        sdetails.setText(strDetails);
    }

    public static void main(String[] args) {
        new students();
    }

}
