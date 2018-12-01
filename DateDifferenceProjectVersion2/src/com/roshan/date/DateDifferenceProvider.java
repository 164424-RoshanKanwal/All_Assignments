package com.roshan.date;

public class DateDifferenceProvider {

	static int months[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	static int sYear ;//2011
	static int eYear ;//2013
	static int yearLen;//2013-2011-1+1
	int years[]= new int[yearLen];
	int numberOfDaysInYear[]= new int[yearLen];

	public static int dateDiff(MyDate startDate, MyDate endDate){

		if ((startDate.getDd()==endDate.getDd())  &&  (startDate.getMm()==endDate.getMm()) && (startDate.getYyyy() == endDate.getYyyy())){
			return 0;
		}
		else if ((startDate.getMm()==endDate.getMm()) && (startDate.getYyyy() == endDate.getYyyy())){
			return endDate.getDd() - startDate.getDd();
		}
		else if((startDate.getYyyy() == endDate.getYyyy())){
			return remainingDaysOfMonths(startDate) + endDate.getDd() + interveningMonths(startDate, endDate) + interveningYear(startDate, endDate);
		}
		else if(startDate.getYyyy() != endDate.getYyyy()) {

			return remainingDaysOfMonths(startDate) + endDate.getDd() + interveningMonths(startDate, new MyDate(31, 12, startDate.getYyyy()) ) + interveningMonths(new MyDate(1, 1, endDate.getYyyy()), endDate) + interveningYear(startDate, endDate) + months[0] + months[11];

		}
		return 0;
	}


	public static int remainingDaysOfMonths(MyDate startDate){
		if(startDate.getYyyy()%4 ==0 ){
			months[1]=29;
			return	months[startDate.getMm()-1] - startDate.getDd();
		}
		else {
			return	months[startDate.getMm()-1] - startDate.getDd();
		}
	}




	public static int interveningMonths(MyDate startDate, MyDate endDate){
		int totalDays = 0;

		for(int index = startDate.getMm(); index < endDate.getMm()-1; index++){
			totalDays += months[index];
		}
		return totalDays;
	}



	public static int interveningYear(MyDate startDate, MyDate endDate){
		int yearsInBetween = endDate.getYyyy()-startDate.getYyyy()-1;

		sYear = startDate.getYyyy();//2011
		eYear = endDate.getYyyy();//2013
		yearLen = yearsInBetween + 1;//2013-2011-1+1
		int years[]= new int[yearLen];
		int numberOfDaysInYear[]= new int[yearLen];
		int totalDays=0;

		int index;
		for(index =1; index < yearLen; index++){
			years[index] = sYear + index;
			//System.out.println(years[index]);
			if(years[index]%4 ==0 ){

				if(years[index]%400 !=0 && years[index]%100 ==0){
					numberOfDaysInYear[index] = 365;
					//months[1]=28;
				}
				else {
					numberOfDaysInYear[index] = 366;
					//months[1]=29;
				}
			}
			else {
				numberOfDaysInYear[index] = 365;
				//months[1]=28;
			}
			//System.out.println(numberOfDaysInYear[index]);

			totalDays += numberOfDaysInYear[index];
		}


		return totalDays;
	}
}