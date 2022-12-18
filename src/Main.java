import org.j2os.common.Http;
import org.j2os.common.Request;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter your family");
        String family = scanner.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        String json = Http.get(String.format(Request.PERSON_SAVE, name, family));
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(json);
        for (Object o : jsonArray) {
            JSONObject jsonObject = (JSONObject) o;
            System.out.println("ID     " + jsonObject.get("id"));
            System.out.println("NAME   " + jsonObject.get("name"));
            System.out.println("FAMILY " + jsonObject.get("family"));
            System.out.println("---------------------------------------------");
        }

    }
}
