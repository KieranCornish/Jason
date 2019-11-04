package com.spartaglobal.json.StudentManager.JSONManager.deserialiser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class StudentJSONReader {

    private JSONObject studentJSONDetails;

    public StudentJSONReader(String fileName){
        try{
            //A simple file reader object
            FileReader studentJSON = new FileReader(fileName);
            //Deserialising string to object
            JSONParser jasonParser = new JSONParser();
            Object studentObject = jasonParser.parse(studentJSON);

            //JSON simple needs a cast from object to the JSON simple object of JSONObject
            studentJSONDetails = (JSONObject) studentObject;

        }catch (ParseException | IOException e ){
            e.printStackTrace();
        }
    }

    public JSONObject getStudentJSONDetails() {
        return studentJSONDetails;
    }

}
