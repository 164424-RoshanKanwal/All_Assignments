package com.roshan.collectionAssignmentQuestion9;

import java.util.Comparator;

public class MyComparator implements Comparator<SavingAccount>{

	@Override
	public int compare(SavingAccount savAcc1, SavingAccount savAcc2) {
		
		Integer acc1 = savAcc1.getAccID();
		int acc2 = savAcc2.getAccID();
		
		if(acc1>acc2){
			return 1;
		}
		else if(acc1<acc2)
		{
			return -1;
		}
		
		return 0;
	}

}
