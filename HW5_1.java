/*
 * Project Title : Homework 5-1. Grades;
 * Author : Yonghwan Yim
 * Final Update : 2017.09.29
 */
package hw5_1;
import java.util.HashMap;
import java.util.Scanner;

public class HW5_1 {
    private ScoreManager scoremanager;
    
    HW5_1() { scoremanager = new ScoreManager(); }
    void run() { scoremanager.startManager(); }
    
    public static void main(String[] args) {
        HW5_1 hw5_1 = new HW5_1();
        hw5_1.run();
    }
}

class Student // Class definitions for managing student names and scores.
{
    final String name;
    int english_score, math_score, science_score;
    double average;
    
    public String Name() { return name; } // Method to check key in HashMap.
    public Student(String name, int english_score, int math_score, int science_score)
    {
        this.name = name;
        this.english_score = english_score;
        this.math_score = math_score;
        this.science_score = science_score;
        this.average = (double)(english_score + math_score + science_score) / 3;
    }
    public String toString()
    {
        return String.format("Student Name: %s, English: %d, Math: %d, Science: %d, Average: %.2f",
                name, english_score, math_score, science_score, average);
    }
}

class ScoreManager
{
    private HashMap<String, Student> studentDB = new HashMap<String, Student>();
    Scanner scan = new Scanner(System.in);
   
    void startManager()
    {
        int input = 0;
        while((input = select()) != 0) // Run program until 0 is entered.
        {
            switch(input)
            {
                case 1: addStudent(); break;     
                case 2: removeName(); break;
                case 3: nameList(); break;
                case 4: studentList(); break;          
                default: System.out.println("Invalid Input!");
            }
        }
        System.out.println("Exit the program");
    }
    
    int select()
    {
        System.out.println("\n1: Add, 2: Remove, 3: Student Name List, 4: Student-Score List, 0: Exit ");
        int input = scan.nextInt();
        scan.nextLine();  // \n Remover.
        return input;      
    }
    
    void addStudent() // Enter the student's name and score.
    {
        String name;
        System.out.print("Student name: ");
        name = scan.nextLine();
        if(!checkName(name)) // If there is no duplicate name..
        {
            int eng, math, sci;
            System.out.print("English: ");
            eng = scan.nextInt();
            System.out.print("Math: ");
            math = scan.nextInt();
            System.out.print("Science: ");
            sci = scan.nextInt();
            Student student = new Student(name, eng, math, sci);
            studentDB.put(name, student);
            System.out.println(student.toString() + "  Save Complete");
        }
    }
    
    void removeName() // Remove students.
    {
        String name;
        System.out.print("Remove name: ");
        name = scan.nextLine();
        if(studentDB.containsKey(name))
        {
            studentDB.remove(name);
            System.out.println("Remove Complete : " + name);
        }
        else System.out.println("The name does not exist");
    }
    
    boolean checkName(String name)  // Confirm duplication of key.
    {
        if(studentDB.containsKey(name)) System.out.println("Student already entered.");
        return studentDB.containsKey(name);
    }
    
    void studentList() // Print name, score.
    {
        System.out.println("Student List");
        int stu_count = studentDB.size();
        System.out.println(stu_count + " Students");
        for(Student student : studentDB.values())
            System.out.println(student.toString());
    }
    
    void nameList() // Print only student names.
    { 
        for(String name : studentDB.keySet())
            System.out.println(name); 
    }
}