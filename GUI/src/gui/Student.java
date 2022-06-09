/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author lenovo
 */
public class Student {
    String name;
    int age;
    char gender;
    boolean employed;

   //constructore with parameters;
            
    public Student(String name, int age, char gender, boolean employed) {
        //this says the name of the main classn and == name says that the name is of constructor parameter
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.employed = employed;
    }
    
    //set all the variabkles to the RAM

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }
    
    public static void main(String[] args) {
        
    }
    
            
}

//interface of JFrame is called view

