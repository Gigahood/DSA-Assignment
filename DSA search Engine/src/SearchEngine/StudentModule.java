/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchEngine;

import DataClass.Student;

/**
 *
 * @author User
 */
public class StudentModule {
    private Student student;
    private int index;
    
    
    public StudentModule(Student student, int index) {
        this.student = student;
        this.index = index;
        
        
        System.out.println(student);
    }
    
}
