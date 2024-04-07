package Task_10;

class Tea{

    //Instance variable - controlled by the Instance of the class
    public String teaName;
    public  String ingredients;
    public int brewingtime;


    public Tea(String name, String ingredients, int brewingtime){
        this.teaName = name;
        this.ingredients=ingredients;
        this.brewingtime =brewingtime;


     }
    //getters method to get teaname
    public String getName(){
        return teaName;
    }
    //getters method to get ingredients
    public String getIngredients(){
        return ingredients;
    }
    //getters method to get brewingtime
    public int getBrewingtime(){
        return brewingtime;
    }
    //method to prepare tea 
    public void prepareTea(){
        System.out.println("Preparing the Tea " +teaName);
    }

}

class BlackTea extends Tea{
	
	// Constructor
    public BlackTea(String name, String ingredients, int brewingtime) {
        super(name,ingredients,brewingtime);
    }
    // Overridden method to prepare black tea
    @Override
    public void prepareTea(){
        System.out.println("Preparing the Tea " +teaName +" the used ingredients: "+ingredients+" brewing time: "+brewingtime );
    }
}

class GreenTea extends Tea{
	
	// Constructor
    public GreenTea(String name, String ingredients, int brewingtime) {
        super(name,ingredients,brewingtime);
    }
    // Overridden method to prepare green tea
    @Override
    public void prepareTea(){
        System.out.println("Preparing the Tea " +teaName +" the used ingredients: "+ingredients+" brewing time: "+brewingtime );
    }

}
class HerbalTea extends Tea{
	
	// Constructor
    public HerbalTea(String name, String ingredients, int brewingtime) {
        super(name,ingredients,brewingtime);
    }
    // Overridden method to prepare green tea
    @Override
    public void prepareTea(){
        System.out.println("Preparing the Tea " +teaName +" the used ingredients: "+ingredients+" brewing time: "+brewingtime );
    }

}

public class TeaImplementation {

    public static void main(String [] arg){
        Tea [] teas = new Tea[3];
        teas[0] = new BlackTea("Black Tea", "hot water and sugar", 2);
        teas[1] = new GreenTea("Green Tea", "tea bag, sugar and hot water", 4);
        teas[2] = new HerbalTea("Herbal Tea", "herbals, sugar and milk", 6);
        teas[0].prepareTea();
        teas[1].prepareTea();
        teas[2].prepareTea();
        
    }
    
}
