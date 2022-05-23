/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text;

import baithi.Person;
import java.util.Date;

/**
 *
 * @author Administrator
 */
class Student extends Person {
    public String studentID;
    public String major;
    public Date enrolledDate;
    
    public Student(){

    }
    
    public Student(String name, Date birthday, int gender, String studentID, String major, Date enrolledDate){        
        this.studentID = studentID;
        this.major = major;
        this.enrolledDate = enrolledDate;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getStudentID() {
        return studentID;
    }
    
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }
    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Birth Date: "+getBirthday());
        System.out.println("Gender: "+getGender());
        System.out.println("Studen ID: "+getStudentID());
        System.out.println("Major: "+getMajor());
        System.out.println("Enrolled Date: "+getEnrolledDate());
    }

    private String getBirthday() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
