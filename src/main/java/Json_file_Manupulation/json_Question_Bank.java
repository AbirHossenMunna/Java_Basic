package Json_file_Manupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class json_Question_Bank {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner input = new Scanner(System.in);

        System.out.println("1.Add Quiz\n" +
                "2.Start Quiz");
        System.out.println("Select Any One?");

        int bb = input.nextInt();
        switch (bb) {
            case 1: addQuizLIst();
                break;
            case 2: startQuiz();
                break;
        }

    }

    private static void addQuizLIst() throws IOException, ParseException {
        char ch = 'y';
        String fileName = "./src/main/resources/question.json";

        do {
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(fileName));
            JSONObject quizObj = new JSONObject();
            Scanner input = new Scanner(System.in);
            System.out.println("Please add a question here:");
            quizObj.put("Questions", input.nextLine());
            System.out.println("Input Options");
            System.out.println("Option a: ");
            quizObj.put("a", input.nextLine());

            System.out.println("Option b: ");
            quizObj.put("b", input.nextLine());

            System.out.println("Option c: ");
            quizObj.put("c", input.nextLine());

            System.out.println("Option d: ");
            quizObj.put("d", input.nextLine());

            System.out.println("Please Input Correct Answer: ");
            quizObj.put("Correct ans", input.nextLine());
            JSONArray questionBank = (JSONArray) obj;

            questionBank.add(quizObj);
            System.out.println(questionBank);
            FileWriter file = new FileWriter(fileName);
            file.write(questionBank.toJSONString());
            file.flush();
            file.close();
            System.out.println("Saved");
            System.out.println("\nDo You Want to add more?[y/n]");
            ch = input.next().charAt(0);

        }
        while (ch != 'n');
    }

    private static void startQuiz() throws IOException, ParseException {
        String fileName = "./src/main/resources/question.json";
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONArray jArray = (JSONArray) obj;

        int points = 0;
        for (int i = 0; i < 5; i++) {
            int random1 = (int) (Math.random() * 10) + 1;
            JSONObject jsonObject = (JSONObject) jArray.get(random1);

            String question = (String) jsonObject.get("Questions");
            String a = (String) jsonObject.get("a");
            String b = (String) jsonObject.get("b");
            String c = (String) jsonObject.get("c");
            String d = (String) jsonObject.get("d");
            String answer = (String) jsonObject.get("correct ans");

            System.out.println(question);
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);
            System.out.println("d: " + d);

            Scanner input = new Scanner(System.in);
            char cha = input.next().charAt(0);

            if (answer.charAt(0) == cha) {
                System.out.println("correct");
                points++;
            } else {
                System.out.println("not correct");
            }
        }
        System.out.println("You get " + points + "out of 5");
    }
}