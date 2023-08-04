package E2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Gradebook implements IGradeCalculator {
    private HashMap<String, Student> students;

    public Gradebook() {
        students = new HashMap<>();
    }

    public void load(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                String name = parts[0].trim();
                List<Double> grades = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    grades.add(Double.parseDouble(parts[i].trim()));
                }
                Student student = new Student(name, grades);
                students.put(name, student);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    public void addStudent(Student student) {
        students.put(student.getName(), student);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public Student getStudent(String name) {
        return students.get(name);
    }

    public double calculate(List<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public double calculateAverageGrade(String string) {
        return calculate(students.get(string).getGrades());
    }

    public void printAllStudents() {
        for (String name : students.keySet()) {
            Student student = students.get(name);
            System.out.println(student.getName() + "     |   " + student.getGrades() + "   | Average grade: " + calculate(student.getGrades()));
        }
    }
}
