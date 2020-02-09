package lecture3.threads.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;

public class ReadConsole {


    public Callable<String> readConsole() {
        Callable<String> readConsole = () -> {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();

            return name;
        };
        return readConsole;
    }
}
