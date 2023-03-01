package factorymethod_plan;

public class PlanFactoryExample {
    public static void main(String[] args) {
        GetPlanFactory fact = new GetPlanFactory();
        String planType = "DOMESTICPLAN";
        int units = 10;
        Plan plan = fact.getPlan(planType);
        System.out.print("Bill amount for " + planType + " of  " + units + " units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
