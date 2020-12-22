package com.company.prac9;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Comparator;


public class UI {
    static JFrame frame;
    static Student[] students;
    public static void createUI() throws IOException {
        frame = new JFrame("Student tracker");
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());

        JEditorPane editorPane = new JEditorPane();

        JButton searchButton = new JButton("Search");

        JLabel GPA = new JLabel();
        GPA.setText(" ");

        searchButton.addActionListener(e -> {
            String name = editorPane.getText();
            if (name.equals(""))
                try {
                    throw new EmptyStringException("This field can not be empty");
                } catch (EmptyStringException emptyStringException) {
                    emptyStringException.printStackTrace();
                }
            Student student = null;
            try {
                student = Student.findStudent(name,students);
            } catch (StudentNotFoundException studentNotFoundException) {
                studentNotFoundException.printStackTrace();
            }
            GPA.setText(String.valueOf(student.getGPA()));

            editorPane.setText("");
        });

        JLabel sortedListLabel = new JLabel();
        sortedListLabel.setText("");

        JButton sortButton = new JButton("Sort");
        sortButton.addActionListener(e -> {
            SortingStudentsByGPA sorter = new SortingStudentsByGPA();
            Comparator<Student> comparator = new SortingStudentsByGPA();
            students = sorter.qsort(students, 0, students.length-1, comparator);
            String output = "";
            for (Student student: students) {
                output += student.getName() + " - " + student.getGPA() + " ";
            }
            sortedListLabel.setText(output);
            frame.pack();
            System.out.println("Sorted");
        });

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(editorPane, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(searchButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        panel.add(GPA, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        panel.add(sortButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        panel.add(sortedListLabel, gbc);

        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        students = new Student[] {new Student("A", 15), new Student("B", 7), new Student("C", 10)};
        createUI();
    }
}