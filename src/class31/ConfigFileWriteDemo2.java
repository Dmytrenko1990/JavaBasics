package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/test2.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Mercedes", "GLS450");
        properties.setProperty("Mazda", "CX9");
        properties.setProperty("BMW", "X7");
        properties.setProperty("Audi", "Q7");
        properties.store(fileOutputStream, "A new file has been created");


    }
}
