package com.spartaglobal.json.StudentManager.JSONManager.deserialiser;

import org.json.simple.JSONObject;

public class StudentDTO {

    private JSONObject student;

    public StudentDTO(String filename){
        StudentJSONReader studentJSONReader = new StudentJSONReader(filename);
        student = studentJSONReader.getStudentJSONDetails();
    }

    public String getFirstName(){
        return (String) student.get("firstName");
    }
    public String getLastName(){
        return (String) student.get("lastName");
    }
    public String getDegree(){
        return (String) student.get("degree");
    }
    public Long getAge(){
        return (Long) student.get("age");
    }
}
