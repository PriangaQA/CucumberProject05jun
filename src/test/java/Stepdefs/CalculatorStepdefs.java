package Stepdefs;

import java.util.List;

import org.junit.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalculatorStepdefs {
	
	int num1,num2;
	int result=0;
	List<Integer>Values;
	
	
	@Given("I have two numbers {int} and {int}")
	public void i_have_two_numbers_and(int val1, int val2) {
	    // Write code here that turns the phrase above into concrete actions
	   
	    this.num1=val1;
	    this.num2=val2;
	}

	@When("I add those two numbers")
	public void i_add_those_two_numbers() {
	    // Write code here that turns the phrase above into concrete actions
	     result=num1+num2;
	    }

	@Then("I should get the result as {int}")
	    
	public void i_should_get_the_result_as(int expResult) {
	    // Write code here that turns the phrase above into concrete actions
	   
		Assert.assertEquals(expResult, result);
		
	}
	
	
	@Then("i should get the sum as {int}")
	public void i_should_get_the_sum_as(int expResult) {
	    // Write code here that turns the phrase above into concrete actions
Assert.assertEquals(expResult, result);
		
	}

	@When("I sub those two numbers")
	public void i_sub_those_two_numbers() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    
	    result = num1-num2;
}
	
	@Given("i have below numbers")
	public void i_have_below_numbers(List<Integer> numbers) {
		   
			this.Values = numbers;

	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@When("i add those numbers")
	public void i_add_those_numbers() {
	    // Write code here that turns the phrase above into concrete actions
		
for(int num:Values) {
			
			result = result+num;
			
		}

	    
	}

	}

	
	




