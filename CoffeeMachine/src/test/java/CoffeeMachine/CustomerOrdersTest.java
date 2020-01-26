package CoffeeMachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerOrdersTest {

	@Test
	void testTeaNoSugar() {
		CustomerOrders order1 = new CustomerOrders("T::");
		String actualMessage = order1.drinkMakerMessage();
		String expectedMessage = "Drink maker makes 1 tea with no sugar - and therefore no stick";
		assertEquals(expectedMessage, actualMessage, "Doit retourner un message qui contient 1 th� (tea), 0 sucre (sugar) et 0 touillette (stick)");
	}
	
	@Test
	void testCoffeeNoSugar() {
		CustomerOrders order1 = new CustomerOrders("C::");
		String actualMessage = order1.drinkMakerMessage();
		String expectedMessage = "Drink maker makes 1 coffee with no sugar - and therefore no stick";
		assertEquals(expectedMessage, actualMessage, "Doit retourner un message qui contient 1 caf� (coffee), 0 sucre (sugar) et 0 touillette (stick)");
	}
	
	@Test
	void testChocolateNoSugar() {
		CustomerOrders order1 = new CustomerOrders("H::");
		String actualMessage = order1.drinkMakerMessage();
		String expectedMessage = "Drink maker makes 1 chocolate with no sugar - and therefore no stick";
		assertEquals(expectedMessage, actualMessage, "Doit retourner un message qui contient 1 chocolat (chocolate), 0 sucre (sugar) et 0 touillette (stick)");
	}

}
