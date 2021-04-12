public class PizzaOrder {

    private Pizza piz1;
    private Pizza piz2;
    private Pizza piz3;
    private double totalCost;

    PizzaOrder(Pizza x){
        piz1=x;
    }

    PizzaOrder(Pizza x,Pizza y){
        piz1=x;
        piz2=y;
    }

    PizzaOrder(Pizza x,Pizza y, Pizza z){
        piz1=x;
        piz2=y;
        piz3=z;
    }

    public double calcTotal(){
        if(piz3==null && piz2 == null){
            totalCost = piz1.calcCost();
        }else if(piz3 == null){
            totalCost = piz1.calcCost()+piz2.calcCost();
        }else{
            totalCost = piz1.calcCost()+piz2.calcCost()+piz3.calcCost();
        }
        return totalCost;
    }
}
