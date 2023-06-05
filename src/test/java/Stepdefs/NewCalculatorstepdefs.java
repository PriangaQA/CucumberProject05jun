package Stepdefs;

import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewCalculatorstepdefs {
	
	
	Map<String, Integer> prices;
	int totalBill=0;

	@Given("i want to buy the below items")
	public void i_want_to_buy_the_below_items(Map<String, Integer> priceList) {
	    
		this.prices = priceList;
	


	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}

	@When("I purchase them")
	public void i_purchase_them() {
	    // Write code here that turns the phrase above into concrete actions
for(String key: prices.keySet() ) {
			
			totalBill = totalBill + prices.get(key);
		}
	  
	

	}

	@Then("i should get the bill amount as {int}")
	public void i_should_get_the_bill_amount_as(int expResult) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(expResult, totalBill);

	}




}
