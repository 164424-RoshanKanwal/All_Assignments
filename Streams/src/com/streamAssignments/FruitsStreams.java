package com.streamAssignments;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitsStreams {

	public static void main(String[] args) {
		FruitsList fruitsList = new FruitsList();
		List<Fruits> fruits = fruitsList.getFruits();
		
/*		List<Fruits> fruitsWithCaloriesLessThan100InDescOrder = 
				fruits.stream()
									.filter(fruit -> fruit.getCalories()<100)
									.sorted(Comparator.comparing(Fruits::getCalories))
									.collect(Collectors.toList());
		
		System.out.println(fruitsWithCaloriesLessThan100InDescOrder);*/
		
		
		
		/*List<String> fruitsColor = fruits.stream()
				.sorted(Comparator.comparing(Fruits::getColor))
				.map(fruit -> fruit.getName() + " is " + fruit.getColor())		//---2
				.collect(Collectors.toList());
		System.out.println(fruitsColor);
		*/
		
		
		/*List<Fruits> fruitsRed = fruits.stream().filter(fruit -> fruit.getColor().equalsIgnoreCase("red"))
										.sorted(Comparator.comparing(Fruits::getPrice))		//---3
										.collect(Collectors.toList());
		
		System.out.println(fruitsRed);*/
		
		
	/*	NewsList listsOfNews = new NewsList();
		List<News> lNews = listsOfNews.getAllNews();

		Map<Integer, Long> map = lNews.stream().map(s -> s.getNewsId()).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		System.out.println(map);*/
		
	TransactionList tList = new TransactionList();
	List<Transaction> list = tList.getTransactionList();
	
	//list.stream().filter(trans -> trans.getYear()==2017).map(trans-> trans.getYear()+ " "+ trans.getTrader() +" "+ trans.getValue()).sorted().forEach(System.out::println);
	//list.stream().map(trader -> trader.getTrader().getCity()).distinct().forEach(System.out::println);
	/*list.stream().filter(traderPune -> traderPune.getTrader().getCity().equalsIgnoreCase("pune"))
									.map(traderName -> traderName.getTrader().getName()).distinct()
									.sorted()
									.forEach(System.out::println);*/
	
	//list.stream().map(s-> s.getTrader().getName()).distinct().sorted().forEach(System.out::print);//------------CHECK
		
	
	//list.stream().map(s->s.getTrader().getCity()).distinct().filter(s-> s.equalsIgnoreCase("indore")).forEach(System.out::println);
	
	
	/*int total = list.stream().filter(s -> s.getTrader().getCity().equalsIgnoreCase("delhi")).map(s->s.getValue()).reduce(0,(ans,i)-> ans+i);
	System.out.println(total);*/
	
	/*int maxTrans = list.stream().map(s->s.getValue()).sorted().max(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(maxTrans);*/
	
	/*int minTrans = list.stream().map(s->s.getValue()).sorted().min(Comparator.comparing(Integer::valueOf)).get();
	System.out.println(minTrans);*/
	
	
	
	}
	
}
