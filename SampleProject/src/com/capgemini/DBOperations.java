package com.capgemini;

public interface DBOperations {
	void read();//read values from db
	void write();//write values from db
	void update();//update values in to db
	abstract void delete(); //delete values from db

}
