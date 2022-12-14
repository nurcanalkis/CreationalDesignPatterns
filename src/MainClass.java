import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryCreator;
import AbstractFactory.Loan;
import AbstractFactory.Bank;
import Builder.CivilEngineer;
import Builder.House;
import Builder.HouseBuilder;
import Builder.IglooHouseBuilder;
import BuilderCd.CDBuilder;
import BuilderCd.CDType;
import Prototype.EmployeeRecord;
import factorymethod.DomesticPlan;
import factorymethod.GetPlanFactory;
import factorymethod.Plan;
import singleton.A;
import singleton.B;

public class MainClass {

    public static void main(String[] args) {

        //SINGLETON
      /*   System.out.println("main class is operating");
        A a = A.getA();
        a.doSomething();

        B b = B.getB();
        b.doSomething();

        B b2 = B.getB();
        b2.doSomething();

        if (b2.equals(b))
            System.out.println("instances are same");
       */
/*
        //FACTORY METHOD
        GetPlanFactory fact = new GetPlanFactory();
        String planType = "DOMESTICPLAN";
        int units = 10;
        Plan plan = fact.getPlan(planType);
        System.out.print("Bill amount for " + planType + " of  " + units + " units is: ");
        plan.getRate();
        plan.calculateBill(units);
*/
/*
        //ABSRACT FACTORY
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan("Education");
        l.getInterestRate(15);
        l.calculateLoanPayment(15000, 3);
      //  AbstractFactory bankFactory=FactoryCreator.getFactory("bank");
        //Bank bank1= bankFactory.getBank("ICICI");
        //System.out.println(bank1.getBankName());

 */



        //BUILDER HOUSE
      /*  HouseBuilder igloo1 = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(igloo1);
        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Builder constructed: " + house.toString());
*/

/*
        //BUILDER CD

        CDBuilder cdBuilder=new CDBuilder();
        CDType cdType1=cdBuilder.buildSonyCD();
        cdType1.showItems();

        CDType cdType2=cdBuilder.buildSamsungCD();
        cdType2.showItems();
*/


// PROTOTYPE

        EmployeeRecord e1 = new EmployeeRecord(101, "Nurcan", "instructor", 10000, "a@b.com");
        e1.showRecord();
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
        e2.setName("Bayhan");
        System.out.println("------------------------");
        e2.showRecord();
        e1.showRecord();


    }
}
