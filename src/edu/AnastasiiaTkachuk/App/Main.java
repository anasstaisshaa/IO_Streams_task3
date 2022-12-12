package edu.AnastasiiaTkachuk.App;


import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "task3.txt");
        Service service = new Service();
        System.out.println(service.getInt(path));
    }

}
