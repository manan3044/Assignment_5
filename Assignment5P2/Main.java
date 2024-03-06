package Assignment5P2;

public class Main {

    public static void main(String[] args) {

        NormalEmployee ne = new NormalEmployee();
        BonusEmployee be = new BonusEmployee();

        System.out.println("==================NORMAL EMPLOYEE==================");
        ne.getEmployeeDetails();
        ne.salaryCalculation();

        System.out.println("\n\n==================BONUS EMPLOYEE==================");
        be.getEmployeeDetails();
        be.salaryCalculation();
    }
}
