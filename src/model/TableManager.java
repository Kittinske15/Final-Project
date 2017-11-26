package Codes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class tableManage {

    static ArrayList<String> tablenumber = new ArrayList<>();
    static Map<String, Integer> foodQty = new LinkedHashMap<>();

    /**
     * return that table ordered list
     *
     * @throws FileNotFoundException
     */
    public static ArrayList<String> getTable(String number) throws FileNotFoundException {
        File table = new File("src/Texts/table" + number + ".txt");
        Scanner scan = new Scanner(table);
        while (scan.hasNextLine()) {
            tablenumber.add(scan.nextLine().trim());
        }
        scan.close();
        return tablenumber;
    }

    /**
     * return the sum of that table
     */
    public static double returnTotal(ArrayList<String> tablelist) {
        double sum = 0.0;
        for (int i = 0; i < tablelist.size(); i++) {
            sum += Menus.getthatCost(tablelist.get(i));
        }
        return sum;
    }

    /**
     * add each food with quantities to Map
     */
    public static void tableQty(ArrayList<String> tablelist) {
        for (int i = 0; i < tablelist.size(); i++) {
            addtoMap(tablelist.get(i));
        }
    }
    
    /**
     * sort the food quantities
     */
    public static void addtoMap(String name) {
        if (foodQty.containsKey(name)) {
            foodQty.put(name, foodQty.get(name) + 1);
        } else {
            foodQty.put(name, 1);
        }
    }
    /**
    *return the present quantity which is collected
    * in the Map
    */
    public static Map<String, Integer> gettableQty() {
        return foodQty;
    }

    /**
     * add that dish to the list for that table
     */
    public static void addDish(String name) {
        tablenumber.add(name);
        addtoMap(name);
    }

    /**
     * writing orders out to the table text
     */
    public static void ordertoText(String number) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/Texts/table" + number + ".txt", true));
        for (int i = 0; i < tablenumber.size(); i++) {
            bw.write(tablenumber.get(i));
            bw.newLine();
        }
        bw.close();
        tablenumber.removeAll(tablenumber);
    }

    /**
     * reset the text back to empty
     *
     * @throws IOException
     */
    public static void resetText(String number) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/Texts/table" + number + ".txt"));
        bw.write("");
        bw.close();
    }

    /**
     * remove all Map <K,V>
     */
    public static void resetMap() {
        foodQty.clear();
    }
    /**
    *remove all ordered dishes
    */
    public static void resetArrList(){
        tablenumber.clear();
    }
}
