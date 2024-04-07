package Task_10;

class Tea {
    // Instance variables
    public String teaName;
    public String ingredients;
    public int brewingTime;

    // Constructor
    public Tea(String name, String ingredients, int brewingTime) {
        this.teaName = name;
        this.ingredients = ingredients;
        this.brewingTime = brewingTime;
    }

    // Getter for tea name
    public String getName() {
        return teaName;
    }

    // Getter for ingredients
    public String getIngredients() {
        return ingredients;
    }

    // Getter for brewing time
    public int getBrewingTime() {
        return brewingTime;
    }

    // Method to prepare tea
    public void prepareTea() {
        System.out.println("Preparing the Tea " + teaName);
    }
}

class BlackTea extends Tea {
    // Constructor
    public BlackTea(String name, String ingredients, int brewingtime) {
        super(name, ingredients, brewingtime);
    }

    // Overridden method to prepare black tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing the " + teaName + " with the ingredients: " + ingredients + " and the brewing time: " + brewingTime);
    }
}

class GreenTea extends Tea {
    // Constructor
    public GreenTea(String name, String ingredients, int brewingTime) {
        super(name, ingredients, brewingTime);
    }

    // Overridden method to prepare green tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing the " + teaName + " with the ingredients: " + ingredients + " and the brewing time: " + brewingTime);
    }
}

class HerbalTea extends Tea {
    // Constructor
    public HerbalTea(String name, String ingredients, int brewingTime) {
        super(name, ingredients, brewingTime);
    }

    // Overridden method to prepare herbal tea
    @Override
    public void prepareTea() {
        System.out.println("Preparing the " + teaName + " with the ingredients: " + ingredients + " and the brewing time: " + brewingTime);
    }
}

public class TeaSubClass {
    public static void main(String[] arg) {
        BlackTea blackTea = new BlackTea("Black Tea", "hot water and sugar", 2);
        GreenTea greenTea = new GreenTea("Green Tea", "tea bag, sugar and hot water", 4);
        HerbalTea herbalTea = new HerbalTea("Herbal Tea", "herbals, sugar and milk", 6);

        blackTea.prepareTea();
        greenTea.prepareTea();
        herbalTea.prepareTea();
    }
}

