package com.streamAssignments;

import java.util.ArrayList;
import java.util.List;

public class TradersList {
private static List<Trader> traderList = new ArrayList<Trader>();
	
	
		
static Trader trader1 = new Trader("shan","Mumbai");
static Trader trader2 = new Trader("oshan","Pune");
static Trader trader3 = new Trader("R","delhi");
static Trader trader4 = new Trader("Ro","Pune");
static Trader trader5 = new Trader("Ros","Pune");
static Trader trader6 = new Trader("Roshan","Delhi");
		
		static{
		traderList.add(trader1);
		traderList.add(trader2);
		traderList.add(trader3);
		traderList.add(trader4);
		traderList.add(trader5);
		traderList.add(trader6);
		
	}
	
	public List<Trader> getTradersList(){
		return traderList;
	}
}
