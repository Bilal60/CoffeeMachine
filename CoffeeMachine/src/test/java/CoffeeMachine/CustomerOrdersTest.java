package CoffeeMachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerOrdersTest {

	@Test
	void testTeaNoSugar() {
		CustomerOrders order1 = new CustomerOrders("T::");
		String actualMessage = order1.drinkMakerMessage();
		String expectedMessage = "Drink maker makes 1 tea with no sugar - and therefore no stick";
		assertEquals(expectedMessage, actualMessage, "Doit retourner un message qui contient 1 thé (tea), 0 sucre (sugar) et 0 touillette (stick)");
	}
	
	@Test
	void testCoffeeNoSugar() {
		CustomerOrders order1 = new CustomerOrders("C::");
		String actualMessage = order1.drinkMakerMessage();
		String expectedMessage = "Drink maker makes 1 coffee with no sugar - and therefore no stick";
		assertEquals(expectedMessage, actualMessage, "Doit retourner un message qui contient 1 café (coffee), 0 sucre (sugar) et 0 touillette (stick)");
	}
	
	@Test
	void testChocolateNoSugar() {
		CustomerOrders order1 = new CustomerOrders("H::");
		String actualMessage = order1.drinkMakerMessage();
		String expectedMessage = "Drink maker makes 1 chocolate with no sugar - and therefore no stick";
		assertEquals(expectedMessage, actualMessage, "Doit retourner un message qui contient 1 chocolat (chocolate), 0 sucre (sugar) et 0 touillette (stick)");
	}
	
	/*******************************************************************************************************/
	
	@Test
	void testTeaOneSugar() {
		CustomerOrders order1 = new CustomerOrders("T:1:0");
		String actualMessage = order1.drinkMakerMessage();
		String expectedMessage = "Drink maker makes 1 tea with 1 sugar and a stick";
		assertEquals(expectedMessage, actualMessage, "Doit retourner un message qui contient 1 thé (tea), 1 sucre (sugar) et 1 touillette (stick)");
	}
	
	@Test
	void testCoffeeOneSugar() {
		CustomerOrders order1 = new CustomerOrders("C:1:0");
		String actualMessage = order1.drinkMakerMessage();
		String expectedMessage = "Drink maker makes 1 coffee with 1 sugar and a stick";
		assertEquals(expectedMessage, actualMessage, "Doit retourner un message qui contient 1 café (coffee), 1 sucre (sugar) et 1 touillette (stick)");
	}
	
	@Test
	void testChocolateOneSugar() {
		CustomerOrders order1 = new CustomerOrders("H:1:0");
		String actualMessage = order1.drinkMakerMessage();
		String expectedMessage = "Drink maker makes 1 chocolate with 1 sugar and a stick";
		assertEquals(expectedMessage, actualMessage, "Doit retourner un message qui contient 1 chocolat (chocolate), 1 sucre (sugar) et 1 touillette (stick)");
	}
	
	

}
