package tesco.retail.implementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tesco.retail.implementations.controller.StoreController;

public class AppTest {

	@Test
	private void testApp() {
		// TODO Auto-generated method stub
		StoreController storeController = new StoreController();
		storeController.GetStoreByName("9715");
		assertEquals(storeController.GetStoreByName("9715"), "uk09715iss01");
	}
}
