package com.streamAssignments;

import java.util.ArrayList;
import java.util.List;

public class TransactionList extends TradersList{
private static List<Transaction> transList = new ArrayList<Transaction>();
	
	static{
		transList.add(new Transaction(trader1, 2017, 3254));
		transList.add(new Transaction(trader1, 2018, 12345));
		transList.add(new Transaction(trader2, 2017, 1200));
		transList.add(new Transaction(trader2, 2018, 12000));
		transList.add(new Transaction(trader3, 2017, 1200));
		transList.add(new Transaction(trader3, 2018, 12009));
		transList.add(new Transaction(trader4, 2017, 32540));
		transList.add(new Transaction(trader4, 2018, 12345));
		transList.add(new Transaction(trader5, 2017, 12000));
		transList.add(new Transaction(trader5, 2018, 12000));
		transList.add(new Transaction(trader6, 2017, 22003));
		transList.add(new Transaction(trader6, 2018, 12009));
	}
	
	public List<Transaction> getTransactionList(){
		return transList;
	}
}
