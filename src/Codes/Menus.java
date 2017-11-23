package Codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menus {

    static List<EachDish> foods = new ArrayList<>();
    static List<EachDish> drinks = new ArrayList<>();

    /**
     * import all foods from text file
     */
    public static void setMenu() throws FileNotFoundException {
        File file = new File("src/Texts/Foods.txt");
        file.getParentFile().mkdirs();
        Scanner search = new Scanner(file);
        while (search.hasNextLine()) {
            String phrase = search.nextLine().trim();
            String[] dish = phrase.split(";");
            for (int i = 0; i < dish.length; i++) {
                if (dish[i].equals("eat")) {
                    foods.add(new EachDish(dish[0], dish[1], dish[2]));
                } else if (dish[i].equals("drink")) {
                    drinks.add(new EachDish(dish[0], dish[1], dish[2]));
                }
            }
        }
        search.close();
    }

    /**
     * return list foods
     */
    public static String[] getfoodList() {
        String[] foodlist = new String[foods.size()];
        for (int i = 0; i < foodlist.length; i++) {
            foodlist[i] = foods.get(i).getFood();
        }
        return foodlist;
    }

    /**
     * return list drinks
     */
    public static String[] getdrinkList() {
        String[] drinklist = new String[drinks.size()];
        for (int i = 0; i < drinklist.length; i++) {
            drinklist[i] = drinks.get(i).getFood();
        }
        return drinklist;
    }

    /**
     * return list of prices either type depends on the @param
     */
    public static double[] getCostOf(String choice) {
        if (choice.equals("food")) {
            double[] foodlist = new double[foods.size()];
            for (int i = 0; i < foodlist.length; i++) {
                foodlist[i] = foods.get(i).getCost();
            }
            return foodlist;
        } else if (choice.equals("drinks")) {
            double[] drinklist = new double[drinks.size()];
            for (int i = 0; i < drinklist.length; i++) {
                drinklist[i] = drinks.get(i).getCost();
            }
            return drinklist;
        } else {
            return null;
        }
    }

    /**
     * return the cost of the food due to @param
     */
    public static double getthatCost(String food) {
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getFood().equals(food)) {
                return foods.get(i).getCost();
            }
        }
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getFood().equals(food)) {
                return drinks.get(i).getCost();
            }
        }
        return 0.0;
    }

    /**
     * return the name of the food due to @param
     */
    public static String getthatFood(String food) {
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getFood().equals(food)) {
                return foods.get(i).getFood();
            }
        }
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getFood().equals(food)) {
                return drinks.get(i).getFood();
            }
        }
        return null;
    }

}
