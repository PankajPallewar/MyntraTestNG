package ExtControllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

// Class to control data flow within the framework
public class DataController {

    public static HashMap<String, String> getAppConfigurations() {
        HashMap<String, String> configData = new HashMap<String, String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(
                    System.getProperty("user.dir")+"//application.properties")));
            String line = null;
            while ((line = br.readLine())!=null){
                if (!line.startsWith("#")) {
                    String[] data = line.split("=", 0);
                    configData.put(data[0].trim(), data[1].trim());
                }
            }

        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return configData;
    }

    public static HashMap<String, String> getTestData(String fileName) {
        HashMap<String, String> testData = new HashMap<String, String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(
                    System.getProperty("user.dir")+"//testData//"+fileName+".properties")));
            String line = null;
            while ((line = br.readLine())!=null){
                if (!line.startsWith("#")) {
                    String[] data = line.split("=", 0);
                    testData.put(data[0].trim(), data[1].trim());
                }
            }

        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return testData;
    }
}
