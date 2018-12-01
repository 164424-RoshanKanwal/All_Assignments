package com.roshan.assignment3;



public class MyArrayList implements MyList{

	int arrayLen;
	int array[];

	public MyArrayList(int[] array) {
		this.array = array;
		this.arrayLen = array.length;
	}

	@Override
	public void sum() {
		int sum = 0;
		for (int index = 0; index< arrayLen; index++) {
			sum += array[index];	 
		}
		System.out.println(sum);

	}

	@Override
	public void get(int arrayLen) {
		System.out.println(array[arrayLen-1]);

	}

	@Override
	public void getAll() {
		for (int index = 0; index < arrayLen; index++){

			System.out.print(array[index] + " ");

		}
		System.out.println();

	}

	@Override
	public void update(int remove, int insert) {
		for (int index =0; index<arrayLen ; index++){
			if (array[index]==remove){
				array[index] = insert;
			}	

		}
	}

	@Override
	public void remove(int newIndex) {
		int temp=0;
		int index = 0;
		for(index =newIndex-1; index<arrayLen-1; index++ ){
			temp = array[index+1];
			array[index] = array[index+1];
			array[index+1] = temp;
		}
		arrayLen = arrayLen -1;
	}

	public static void main(String[] args) {

		MyArrayList mList = new MyArrayList(new int[] {23,56,74,95,26,88});

		mList.get(4);
		mList.getAll();
		mList.remove(3);
		mList.getAll();
		mList.update(95, 33);
		mList.getAll();
		mList.remove(2);
		mList.getAll();
		mList.add(5, 56);
		mList.getAll();
		mList.add(2, 3);
		mList.getAll();
	}

	@Override
	public void add(int position, int value) {
		arrayLen = arrayLen + 1;

		if(arrayLen == position){
			array[arrayLen-1]=value;
		}
		else{
			int index =0;

			for (index=arrayLen-1; index >= position-1; index--){
				array[index] = array[index-1];
			}
			array[position-1] = value;}

	}



}
