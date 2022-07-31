package json_file_Manupulation_Practice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class json_Manupulation {
    public static void main(String[] args) throws IOException, ParseException {
        writeJsonList();
        //jsonRead();
        //jsonWrite();
    }

    private static void jsonWrite() throws IOException {
        JSONObject emObj = new JSONObject();
        emObj.put("name", "Mr. Shajib");
        emObj.put("Department", "IT");
        emObj.put("Designation", "Software Engineer");
        JSONObject addressObj = new JSONObject();
        addressObj.put("present_address", "Badda,Gulshan-1");
        addressObj.put("PO", "Gulshan");
        addressObj.put("Area", "Gulshan-1");
        emObj.put("address", addressObj);
        emObj.put("phone_number", "01620141540");
        FileWriter file = new FileWriter("./src/main/resources/Employee.json");
        file.write(emObj.toJSONString());
        file.flush();
        System.out.print(emObj);
    }

    private static void jsonRead() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(".\\src\\main\\resources\\Employee.json"));
        JSONObject emObj = (JSONObject) obj;
        System.out.println(emObj);
        String name = (String) emObj.get("name");
        System.out.println(name);
        String department = (String) emObj.get("Department");
        System.out.println(department);
        String designation = (String) emObj.get("Designation");
        System.out.println(designation);
        JSONObject addressObj = (JSONObject) emObj.get("address");
        String area=(String) addressObj.get("Area");
        System.out.println(area);
        String po=(String) addressObj.get("PO");
        System.out.println(po);
        String present_address=(String) addressObj.get("present_address");
        System.out.println(present_address);
        String phone_number = (String) emObj.get("phone_number");
        System.out.println(phone_number);
    }

    private static void writeJsonList() throws IOException, ParseException {
        char ch='y';
        String fileName="./src/main/resources/student.json";
        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject studentObj = new JSONObject();
            Scanner input = new Scanner(System.in);
            System.out.println("Input student ID: ");
            studentObj.put("id", input.next());
            System.out.println("Input student name: ");
            studentObj.put("name", input.next());
            System.out.println("Input Department ");
            studentObj.put("department", input.next());
            JSONArray jsonArray = (JSONArray) obj;
            jsonArray.add(studentObj);
            System.out.print(jsonArray);
            FileWriter file = new FileWriter(fileName);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();
            System.out.println("Saved!");
            System.out.print(jsonArray);
            System.out.println("\nDo you want to add more?[y/n]");
            ch=input.next().charAt(0);
        }
        while(ch!='n');
    }
}

