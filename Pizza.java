public class Pizza {
    private String size;
    private int chztoping;
    private int peptoping;
    private int hamtoping;
    private double cost;

    public Pizza(String s, int a, int b, int c){
        size = s;
        chztoping = a;
        peptoping= b;
        hamtoping = c;
    }


    public double calcCost(){
        if (size.equals("small")){
            cost = 10+(2*(chztoping+peptoping+hamtoping));
            return cost;
        }
        else if(size.equals("medium")){
            cost = 12+(2*(chztoping+peptoping+hamtoping));
            return cost;
        }
        else if(size.equals("large")){
            cost = 14+(2*(chztoping+peptoping+hamtoping));
            return cost;
        }
        return cost;
    }

    public String getDescription(){
        return "Size: "+size+"\nCheese Topping: "+chztoping+"\nPepperoni Topping: "+peptoping+"\nHam Topping: "+hamtoping;

    }

}
