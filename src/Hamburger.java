public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String  addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + " is " + price);
    }

    public void addHamburgerAddition1(String name, double price){
        addition1Name = name;
        addition1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHamburgerAddition2(String name, double price){
        addition2Name = name;
        addition2Price = price;
        System.out.println("Added " + name + " for an extra " + price);

    }
    public void addHamburgerAddition3(String name, double price){
        addition3Name = name;
        addition3Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHamburgerAddition4(String name, double price){
        addition4Name = name;
        addition4Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    public double itemizeHamburger(){
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }

}
