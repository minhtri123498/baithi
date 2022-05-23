/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public abstract class Person {
    public String name;
    public Date birthday;
    public byte gender;

    public Person(){

    }

    public Person(String name, Date birthday, byte gender){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public byte getGender() {
        return gender;
    }
    public void setGender(byte gender) {
        this.gender = gender;
    }

    public void display(){}
}
