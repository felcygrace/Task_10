package Task_10;

class Tea{
    public boolean hotwater;
    public boolean tealeaves;
    public boolean addmilk;
    public boolean addsugar;

    // creating constructor 
    public Tea(){
        this.hotwater=false;
        this.tealeaves=false;
        this.addmilk=false;
        this.addsugar=false;
    }
    //method to prepare tea
    public void prepareTea(){
        hotwater =true;
        tealeaves=true;
        System.out.println("Preparing basic tea with hotwater tealeaves");
    }
    //method to add milk
    public void addMilk(){
        prepareTea();
        addmilk=true;
        System.out.println("Adding milk to basic tea");
    }
    //method to add sugar
    public void addsugar(){
        prepareTea();
        addsugar=true;
        System.out.println("Adding sugar to basic tea");
    }
    public static void main(String[] args) {
        Tea tea = new Tea();
        // calling each method 
        tea.prepareTea();
        tea.addMilk();
        tea.addsugar();
    }

}
