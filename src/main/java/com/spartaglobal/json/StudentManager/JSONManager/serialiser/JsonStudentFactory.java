package com.spartaglobal.json.StudentManager.JSONManager.serialiser;

import org.json.simple.JSONObject;

public class JsonStudentFactory {
    private JSONObject studentjson = new JSONObject();
    private StudentFactory student;

    public JsonStudentFactory(StudentFactory student) {
        this.student = student;
        studentjson.put("firstName",student.getFirstName());
        studentjson.put("lastName",student.getLastName());
        studentjson.put("degree",student.getDegree());
        studentjson.put("age",student.getAge());

    }
    public void printStudentJSON(){
        System.out.println(studentjson);
    }


}
