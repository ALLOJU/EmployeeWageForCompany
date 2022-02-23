
public class EmpWageCalcUc8 {


	//declaring constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	/*
	 * public static final int EMP_RATE_PER_HOUR=20; public static final int
	 * NUM_OF_WORKING_DAYS=20; public static final int MAX_HRS_IN_MONTH=10;
	 */




	private static int computeEmpWage(String company, int empRatePerour, int numOfWorkingDays, int maxHoursPerMonth) {
		//declaring variables
		int empHours=0,totalEmpHours=0,totalWorkingDays=0;
		while(totalEmpHours <= maxHoursPerMonth && totalWorkingDays <= numOfWorkingDays ) {

			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10) % 3;

			switch(empCheck){    
			case  IS_FULL_TIME:    
				empHours=8;
				break;  //optional  
			case IS_PART_TIME:    
				empHours=4;
				break; 
			default:     
				empHours=0;  
				break;
			}
			totalEmpHours+=empHours;
			System.out.println("Day#:" +totalWorkingDays+"Emp Hr :"+empHours);
		}
		int totalEmpWage=empRatePerour*totalEmpHours;
		System.out.println("Total Employee Wage for Company " +company+  "  is  " +totalEmpWage);
		return totalEmpWage;

	}



	public static void main(String[] args) {
		computeEmpWage("Dmart",20,2,10);
		computeEmpWage("Reliance",10,4,20);

		//System.out.println(dmart);


	}


}



