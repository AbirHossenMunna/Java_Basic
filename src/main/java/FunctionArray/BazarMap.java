package FunctionArray;

import java.util.HashMap;

public class BazarMap {
    public static void main(String[] args) {
        searchItem("Beef");
        totalSum();
    }

    public static void searchItem(String item) {
        HashMap<String, Integer> BazarList = new HashMap<String, Integer>();

        BazarList.put("oil", 900);
        BazarList.put("Mutton", 860);
        BazarList.put("Beef", 1000);
        BazarList.put("Chicken", 200);
        BazarList.put("Onion", 100);
        BazarList.put("Rice", 250);
        System.out.println(BazarList);
        System.out.println("Single Item Price is: " + BazarList.get("Beef"));

    }

    public static void totalSum() {
        HashMap<String, Integer> BazarList = new HashMap<String, Integer>();
        // Add keys and values (Country, City)
        BazarList.put("oil", 900);
        BazarList.put("Mutton", 860);
        BazarList.put("Beef", 1000);
        BazarList.put("Chicken", 200);
        BazarList.put("Onion", 100);
        BazarList.put("Rice", 250);

        int sum = 0;
        for (int value : BazarList.values()) {
            sum += value;
        }

        System.out.println("Total value of sum :" + sum);
    }

}
