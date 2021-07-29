public class EmployeeWageComputation2 {

    public int empWage() {
        //Variables
        int isFullTime=1;
        int empCheck=(int) (Math.random()*2);   //Using random check whether Employee is Present or Absent
        int empRatePerHr=8;
        int empHrs=20;
        //Computation
        if (empCheck==isFullTime) {
            int empDailyWage = empRatePerHr * empHrs;   //Employee Daily Salary
            System.out.println("Employee is Present and Employee Fullday Wage is "+ empDailyWage);
        }
        else {
            System.out.println("Employee is Absent");
        }
        return 0;
    }

    public static void main(String [] args) {

        EmployeeWageComputation2 obj1 = new EmployeeWageComputation2();		//Creating Objects

        obj1.empWage();
        System.out.println("");

    }
}

