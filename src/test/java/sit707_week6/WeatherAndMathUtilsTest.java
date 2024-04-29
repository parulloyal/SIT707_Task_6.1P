package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

	@Test
	public void testStudentId() {
		String studentId = "s222303253";
		Assert.assertNotNull(studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Parul Loyal";
		Assert.assertNotNull(studentName);
	}

//////	@Test
//////	public void testFalseNumberIsEven() {
//////		Assert.fail("Not yet implemented");
//////	}
//////	
//////    @Test
////    public void testCancelWeatherAdvice() {
////    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
//    }
//   

	@Test
	public void testIsEvenTrue() {
		int number = 4; // An even number
		boolean isEven = WeatherAndMathUtils.isEven(number);
		Assert.assertTrue(number + " is even", isEven);
	}

	@Test
	public void testIsEvenFalse() {
		int number = 7; // An odd number
		boolean isEven = WeatherAndMathUtils.isEven(number);
		Assert.assertFalse(number + " is not even", isEven);
	}

	@Test
	public void testWeatherAdviceCancel() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0)); // Dangerous weather condition
	}

//	@Test
//	public void testWeatherAdviceWarning() {
//		// Test when wind speed is concerning but precipitation is below threshold
//		Assert.assertEquals("WARNING", WeatherAndMathUtils.weatherAdvice(50.0, 3.0));
//
//		// Test when precipitation is concerning but wind speed is below threshold
//		Assert.assertEquals("WARNING", WeatherAndMathUtils.weatherAdvice(40.0, 5.0));
//
//		// Test when both wind speed and precipitation are concerning
//		Assert.assertEquals("WARNING", WeatherAndMathUtils.weatherAdvice(50.0, 5.0));
//	}
	
	@Test
	public void testWeatherAdviceWarning() {
	    // Test when wind speed is concerning but precipitation is below threshold
	    Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.0));

	    // Test when precipitation is concerning but wind speed is below threshold
	    Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(40.0, 5.0));

	    // Test when both wind speed and precipitation are concerning
	    Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 5.0));
	}


	@Test
	public void testWeatherAdviceAllClear() {
		// Test when both wind speed and precipitation are below thresholds
		Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0, 3.0));

		// Test when both wind speed and precipitation are exactly at the threshold
		// values
		Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(45.0, 4.0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWeatherAdviceNegativeValues() {
		// Test with negative wind speed
		WeatherAndMathUtils.weatherAdvice(-10.0, 3.0);

		// Test with negative precipitation
		WeatherAndMathUtils.weatherAdvice(40.0, -5.0);
	}
	
	 @Test
	    public void testSumUpToN() {
	        // Test for sumUpToN function
	        ConditionalLoopFunctions functions = new ConditionalLoopFunctions();
	        Assert.assertEquals("Test by [Parul Loyal] (s222303253)", 15, functions.sumUpToN(5));
	        Assert.assertEquals("Test by [Parul Loyal] (s222303253)", 55, functions.sumUpToN(10));
	    }

	    @Test
	    public void testCountEvenNumbers() {
	        // Test for countEvenNumbers function
	        ConditionalLoopFunctions functions = new ConditionalLoopFunctions();
	        int[] numbers = {1, 2, 3, 4, 5};
	        Assert.assertEquals("Test by [Parul Loyal] (s222303253)", 2, functions.countEvenNumbers(numbers));
	    }
	
}

