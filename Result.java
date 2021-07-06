 class hello {
    

     
    double meal_cost;
    int tip_percent;
    int tax_percent;
    double total_cost;
    double tip;
    double tax;

public  void solve(double meal_cost, int tip_percent, int tax_percent) {
// Write your code here

    this.meal_cost=meal_cost;
    this.tip_percent=tip_percent;
    this.tax_percent=tax_percent;
   
    tip=(this.meal_cost/100)*this.tip_percent;
    System.out.println(tip);   //CORRECT



    tax=(this.meal_cost/100)*this.tax_percent;
    System.out.println(tax);//RUKJA BRO


    total_cost=this.meal_cost+tip+tax;
    
    
    
    System.out.println(Math.round(total_cost));

}

}
public class Result {
    public static void main(String[] args) {
       
       hello r=new hello();
       r.solve(12,20,8);
       
       
       
       
       
    }
}
