package AbstractFactoryBankLoanExample;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        //ABSRACT FACTORY
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan("Education");
        l.getInterestRate(15);
        l.calculateLoanPayment(15000, 3);
        //  AbstractFactory bankFactory=FactoryCreator.getFactory("bank");
        //Bank bank1= bankFactory.getBank("ICICI");
        //System.out.println(bank1.getBankName());

    }
}
