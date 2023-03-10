import java.util.*;

public class Try209 {
    public static void main(String[] args) {
        LinkedList<Map<String, Object>> dataList = new LinkedList<>();
        Map<String,Object>appleMap=new LinkedHashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10);
        dataList.add(appleMap);

        Map<String,Object>orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10);
        dataList.add(orangeMap);
        double totalPurchase=0;
        for(Map map:dataList) {
                Set<Map.Entry<String,Object>> entrySet=map.entrySet();
                for(Map.Entry<String,Object> entry:entrySet){
                    System.out.print(entry.getKey()+" : "+entry.getValue()+" ");
                }
                double price= (double) map.get("Price");
                int quantity= (int)map.get("Quantity");
                totalPurchase=totalPurchase+(price*quantity);
                System.out.println("SubTotal: "+(price*quantity));
            System.out.println();
        }
        System.out.println("Your Purchase total : "+totalPurchase);


        }
}