public class Lab7Assignment1Runner {

    public static void main(String args[]) {

        Pizza p1 = new Pizza("small",2,3,2);
        System.out.println(p1.getDescription());
        System.out.println("Cost is : "+p1.calcCost()+"\n");

        Pizza p2 = new Pizza("medium",1,2,2);
        System.out.println(p2.getDescription());
        System.out.println("Cost is : "+p2.calcCost()+"\n");

        Pizza p3 = new Pizza("large",4,2,1);
        System.out.println(p3.getDescription());
        System.out.println("Cost is : "+p3.calcCost()+"\n");

        PizzaOrder p = new PizzaOrder(p1,p2,p3);


        System.out.println("Total cost of order is : "+p.calcTotal());
    }

}
