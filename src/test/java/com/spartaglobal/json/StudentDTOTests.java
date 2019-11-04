package com.spartaglobal.json;

import com.spartaglobal.json.StudentManager.JSONManager.deserialiser.StudentDTO;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class StudentDTOTests {
    private StudentDTO studentDTO = new StudentDTO("resources/student.json");
    @Test
    public void firstNameTest () {
        Assert.assertEquals("Margret", studentDTO.getFirstName());
    }
    @Test
    public void LastNameTest () {
        Assert.assertEquals("Miller", studentDTO.getLastName());
    }
    @Test
    public void DegreeTest () {
        Assert.assertEquals("Chemistry", studentDTO.getDegree());
    }
    @Test
    public void ageTest () {
        Assert.assertEquals(Long.valueOf(21), studentDTO.getAge());
    }
}
