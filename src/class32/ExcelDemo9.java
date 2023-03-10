package class32;

import utils.ExcelReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelDemo9 {
    public static void main(String[] args) throws IOException {
     /*   var excelData= ExcelReader.read();
        System.out.println(excelData);*/
        List<Map<String,String>> excelData=ExcelReader.read();
       // Map<String,String>firstRow=excelData.get(0);
       // System.out.println(firstRow.get("Name"));

        for(Map<String,String>row:excelData){
            for(Map.Entry<String,String> entry:row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("**********************");
        }
    }
}
