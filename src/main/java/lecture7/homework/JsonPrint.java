package lecture7.homework;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lecture1.oop.homework1.Computer;

public class JsonPrint {

    public static String printJson(Object objectForPrint) {

        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
        return GSON.toJson(objectForPrint);

    }


    public static void main(String[] args) {

        Computer laptop = new Computer(1976, 123.34, true, 200, 100, "Windows");
        System.out.println(printJson(laptop));

    }
}
