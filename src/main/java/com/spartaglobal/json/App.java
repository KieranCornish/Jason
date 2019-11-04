package com.spartaglobal.json;

import com.spartaglobal.json.StudentManager.JSONManager.deserialiser.StudentDTO;
import com.spartaglobal.json.StudentManager.JSONManager.serialiser.StudentFactory;
import com.spartaglobal.json.StudentManager.JSONManager.serialiser.JsonStudentFactory;

public class App {
    public static void main(String[] args) {
        StudentFactory student = new StudentFactory("Margret", "Miller", "Chemistry", 21);
        JsonStudentFactory student1json = new JsonStudentFactory(student);
        student1json.printStudentJSON();

        StudentDTO studentDTO = new StudentDTO("resources/student.json");
        System.out.println(studentDTO.getAge());
        System.out.println(studentDTO.getFirstName());
    }
}
