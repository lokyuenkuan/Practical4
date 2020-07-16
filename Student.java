/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuenkuan
 */
//Practical4 Q2
public class Student {
    private String studentId;
    private String studentName;
    private int quizCount;
    private int totalScore;
    private static double contribution;
    
    public Student(){
        this("","");
    }
    
    /*public Student(String id, String name){
        studentId = id;
        studentName = name;
    }*/
    
    public Student(String studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
    
    public String getStudentId(){
        return studentId;
    }
    
    public String getStudentName(){
        return studentName;
    }
    
    public int getQuizCount(){
        return quizCount;
    }
    
    public int getTotalScore(){
        return totalScore;
    }
    
    public void setStudentId(String id){
        this.studentId = id;
    }
    
    public void setStudentName(String name){
        this.studentName = name;
    }
  
    public static void setContribution(double contribution){
        Student.contribution = contribution;
    }
    
    public static double getContribution(){
        return contribution;
    }
    
    public void addQuiz(int score){
        if (score <0 || score >10){
            System.out.printf("Error : Invalid score");
        }
        
        else{
            quizCount++;
            totalScore += score;
        }
        
    }
    
    public double getAverageScore(){
        return totalScore/(double)quizCount;
    }
    
    
    
    
}
