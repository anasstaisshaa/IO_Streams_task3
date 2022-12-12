package edu.AnastasiiaTkachuk.App;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Service {
    public List<Integer> getInt (Path path) throws IOException {
        List<Integer> list = Files.readAllLines(path).stream()
                .map(Service::findMaxDigitsCount).toList();
        return list;
    }

    private static  Integer findMaxDigitsCount(String line) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < line.length(); i++){
            if(Character.isDigit(line.charAt(i))) {
                counter ++;
            } else {
                if ( result < counter){
                    result = counter;
                }
                counter = 0;
            }
        }
        return result;
    }
}
