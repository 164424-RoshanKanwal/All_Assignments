package com.streamAssignments;

import java.util.ArrayList;
import java.util.List;

public class NewsList {
	
	static List<News> newsList = new ArrayList<>();
	
	static{
		newsList.add(new News(1, "Roshan", "Rohit", "This is a very nice blog."));
		newsList.add(new News(1, "Roshan", "kk", "Good Blog."));
		newsList.add(new News(2, "Pandya", "kk", "Seems like you have it all."));
		newsList.add(new News(1, "Roshan", "Rohit", "Well maintained."));
		newsList.add(new News(2, "Pandya", "Rit", "This is a very nice blog."));
		newsList.add(new News(1, "Roshan", "hit", "Great."));
		newsList.add(new News(3, "Kanwal", "Rokesh", "Awesome."));
		newsList.add(new News(1, "Roshan", "Rohit", "Best of I know."));
	}
	
	public List<News> getAllNews(){
		return newsList;
	}
	
	
}
