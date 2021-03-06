package com.roshan.collectionAssignmentQuestion10;

import java.util.ArrayList;
import java.util.Collections;


public class Movie_DetailsList implements MoviesList{

	
	static ArrayList<Object> movieList = new ArrayList<>();
	static Movie_Details movieDetails ;
	
	
	
	@Override
	public void add_movie(String movieName, String leadActor, String leadActress, String genre) {
		movieDetails = new Movie_Details(movieName, leadActor, leadActress, genre);
		movieList.add(movieName);
		movieList.add(leadActor);
		movieList.add(leadActress);
		movieList.add(genre);
		
		
	}

	@Override
	public void remove_movie(int index) {
		
		movieList.remove(index*4-1);
		movieList.remove(index*4-2);
		movieList.remove(index*4-3);
		movieList.remove(index*4-4);
		
	}

	@Override
	public void remove_AllMovies() {
		
		movieList.removeAll(movieList);
	}

	@Override
	public String find_movie_By_mov_Name(String movieName) {
		
		if(movieList.contains(movieName)){
			
			int movieIndex = movieList.indexOf(movieName);
			
			
			return "Movie Name : " + movieName + " Lead Actor: " + movieList.get(movieIndex+1) + " Lead Actress: " +  movieList.get(movieIndex+2) + " Genre: " +  movieList.get(movieIndex+3);//last object
			
		}
		else{
			
			return "Movie Details are unavailable";
		}
		
	}

	@Override
	public void find_movie_By_Genre(String genre) {
		
		int listlen = movieList.size();
		
		System.out.println("Genre : " + genre);
		
		for (int index=0; index < listlen; index++){
			if(movieList.get(index).equals(genre)){
	
			System.out.println("Movie Name: " + movieList.get(index-3) + " Lead Actor: " + movieList.get(index-2) + " Lead Actress: " + movieList.get(index-1));
				}			
			
		}
		
	}

	
	public static void main(String[] args) {
		
		Movie_DetailsList mv = new Movie_DetailsList();
		mv.add_movie("Movie One", "Hero 11", "Actress 1", "Genre1");
		mv.add_movie("Movie Two", "Hero 132", "Actress 2", "Genre2");
		mv.add_movie("Movie Three", "Hero 143", "Actress 1", "Genre3");
		mv.add_movie("Movie Four", "Hero 13", "Actress 43", "Genre4");
		mv.add_movie("Movie Five", "Hero 1", "Actress 15", "Genre2");
		mv.add_movie("Movie Six", "Hero 1e", "Actress 13", "Genre2");
		mv.add_movie("Movie Seven", "Hero 14", "Actress 12", "Genre1");
				
		System.out.println(movieList);
		mv.remove_movie(3);
		System.out.println(movieList);
		System.out.println(mv.find_movie_By_mov_Name("Movie Six"));
		
		mv.find_movie_By_Genre("Genre2");
		
		mv.remove_AllMovies();
		System.out.println(movieList);
		
		
		
	}
}
