public class EmployeeWageComputation9 {
    static final int IS_FUllTime = 1;
    static final int IS_PARTTIME = 2;
    static String companyName;
    int maxHrinMonth;
    int numWorkingDays;
    int wagePerHour;


    public EmployeeWageComputation9(String companyName, int maxHrinMonth, int numWorkingDays, int wagePerHour) {
        super();
        this.companyName = companyName;
        this.maxHrinMonth = maxHrinMonth;
        this.numWorkingDays = numWorkingDays;
        this.wagePerHour = wagePerHour;
    }

    public int computeEmpWage() {
        //Variables
        int totalSalary=0;
        int totalEmpHr=0;
        int totalWorkingDay=0;
        int empHr=0;

        //Computation
        while (totalEmpHr <= maxHrinMonth && totalWorkingDay < numWorkingDays ) {
            totalWorkingDay++;
            int empCheck=(int) (Math.random()*3);

            switch  (empCheck) {
                case 0:

                    empHr=0;
                    break;

                case 1:
                    empHr=8;    //Full day hours
                    break;

                case 2:
                    empHr=4;	// Part time hours
                    break;
            }

            totalEmpHr+= empHr ;
        }
        totalSalary = totalEmpHr * wagePerHour;


        return totalSalary;


    }

    public static void main(String[] args) {

        EmployeeWageComputation9 company1 = new EmployeeWageComputation9("Dmart",150,23,60);				//Creating Object
        company1.computeEmpWage();
        int a=company1.computeEmpWage();
        System.out.println( "The total Monthly Salary of "+ companyName + " employee is  " + a+"\n" );

        EmployeeWageComputation9 company2 = new EmployeeWageComputation9("Relience",150,200,22);
        company2.computeEmpWage();
        int b=company2.computeEmpWage();
        System.out.println( "The total Monthly Salary of "+ companyName + " Employee is  " + b+"\n" );

        EmployeeWageComputation9 company3 = new EmployeeWageComputation9("V2",200,120,26);
        company3.computeEmpWage();
        int c=company3.computeEmpWage();
        System.out.println( "The total Monthly Salary of "+ companyName + " Employee is  " + c+"\n" );
    }

}