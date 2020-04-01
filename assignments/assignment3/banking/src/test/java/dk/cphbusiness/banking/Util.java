package dk.cphbusiness.banking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class Util {

    public static String loadSqlAsString() {
        try {
            FileReader fr = new FileReader("src/main/scripts/db-bank.sql");
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            Stream<String> sql = br.lines();
            sql.forEach(str -> sb.append(str + "\n"));
            return sb.toString();
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
