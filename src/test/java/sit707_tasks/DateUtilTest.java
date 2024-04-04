package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = null;
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = null;
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());// Code here
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january1ShouldDecrementToDecember31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());// Code here
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */


	@Test
	public void testMaxFebruary28ShouldIncrementToFebruary29() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("february28ShouldIncrementToFebruary29 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMaxFebruary28LeapYearShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("february28LeapYearShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testMaxFebruary29LeapYearShouldIncrementToMarch1() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("february29LeapYearShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testMaxFebruary29LeapYearShouldDecrementToFebruary28() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("february29LeapYearShouldDecrementToFebruary28 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(28, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("march31ShouldIncrementToApril1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}
	
	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("april30ShouldIncrementToMay1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("may31ShouldIncrementToJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("june30ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void testMaxJuly31ShouldIncrementToAugust1() {
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("july31ShouldIncrementToAugust1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testMaxAugust31ShouldIncrementToSeptember1() {
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("august31ShouldIncrementToSeptember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("september30ShouldIncrementToOctober1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("october31ShouldIncrementToNovember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("november30ShouldIncrementToDecember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testMaxDecember31ShouldIncrementToJanuary1NextYear() {
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("december31ShouldIncrementToJanuary1NextYear > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(2025, date.getYear());
	}

	


	// Write tests for the remaining months of the year 2024 similarly

}
