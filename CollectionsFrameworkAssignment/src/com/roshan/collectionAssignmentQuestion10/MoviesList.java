package com.roshan.collectionAssignmentQuestion10;

public interface MoviesList {

	void remove_movie(int index);
	void remove_AllMovies();
	String find_movie_By_mov_Name(String movieName);
	void find_movie_By_Genre(String genre);
	void add_movie(String movieName, String leadActor, String leadActress,
			String genre);
	
}
