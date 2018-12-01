package com.roshan.date;

public class TestDateDifferenceProjectVersion2 {

	static MyDate startDate;
	static MyDate endDate;
	static int actualDifference;

	public static void main(String[] args) {
		// @Before
		// public void instanceTest(){
		TestRecords testRecords[] = new TestRecords[15];
		// }

		// @Test
		// public void testRecords(){
		testRecords[0] = new TestRecords(new MyDate(4, 6, 2011), new MyDate(4,
				6, 2011), 0);
		testRecords[1] = new TestRecords(new MyDate(6, 4, 2011), new MyDate(18,
				4, 2011), 12);
		testRecords[2] = new TestRecords(new MyDate(6, 4, 2011), new MyDate(18,
				5, 2011), 42);
		testRecords[3] = new TestRecords(new MyDate(6, 4, 2011), new MyDate(18,
				6, 2011), 73);
		testRecords[4] = new TestRecords(new MyDate(6, 4, 2011), new MyDate(18,
				12, 2011), 256);
		testRecords[5] = new TestRecords(new MyDate(6, 4, 2011), new MyDate(18,
				12, 2012), 621);
		testRecords[6] = new TestRecords(new MyDate(11, 1, 2011), new MyDate(
				22, 12, 2018), 2902);
		testRecords[7] = new TestRecords(new MyDate(6, 4, 2011), new MyDate(18,
				12, 2113), 37511);
		testRecords[8] = new TestRecords(new MyDate(6, 4, 2011), new MyDate(18,
				12, 2413), 147084);
		testRecords[9] = new TestRecords(new MyDate(6, 4, 2011), new MyDate(18,
				12, 2813), 293181);
		testRecords[10] = new TestRecords(new MyDate(6, 1, 2011), new MyDate(6,
				3, 2011), 59);
		testRecords[11] = new TestRecords(new MyDate(6, 1, 2012), new MyDate(6,
				3, 2012), 60);
		testRecords[12] = new TestRecords(new MyDate(6, 2, 2012), new MyDate(6,
				3, 2012), 29);
		testRecords[13] = new TestRecords(new MyDate(22, 1, 2012), new MyDate(
				15, 11, 2012), 298);
		testRecords[14] = new TestRecords(new MyDate(6, 2, 2012), new MyDate(6,
				12, 2012), 304);
		// }

		// @After
		for (int index = 0; index < testRecords.length; index++) {
			int calculatedDiff = DateDifferenceProvider.dateDiff(
					testRecords[index].getStartDate(),
					testRecords[index].getEndDate());
			if (calculatedDiff == testRecords[index].getActualDifference()) {
				System.out.println("Test Case passed");
			} else {
				System.err.println("Test Case failed" + " Actual ="
						+ testRecords[index].getActualDifference()
						+ " calculated =" + calculatedDiff);
			}
		}
	}

}
