/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuenkuan
 */
public class TestStudent {
    public static void main(String[] args){
        
        Student s1=new Student();
        Student s2=new Student("w45678","Abu");

        //s1.setStudentName("Ali");
        //s1.setStudentId("w12345");
        
        s1.addQuiz(10);
        s2.addQuiz(8);
        
        /*s1.addQuiz(10);
        s2.addQuiz(5);
        
        s1.addQuiz(10);
        s2.addQuiz(9);*/
        
        s1.setContribution(20);
        
        System.out.printf("%-10s %s %s %s %s\n","Name","No.Quiz","Total","Score","Average","Contribution");
        System.out.printf("%-15s %3d %3d %5.2f %5.2f\n",s1.getStudentName(),s1.getQuizCount(),
                s1.getTotalScore(),s1.getAverageScore(),s1.getAverageScore()/10 * Student.getContribution());
        System.out.printf("%-15s %3d %3d %5.2f %5.2f\n",s2.getStudentName(),s2.getQuizCount(),
                s2.getTotalScore(),s2.getAverageScore(),s2.getAverageScore()/10 * Student.getContribution());
    }
}
