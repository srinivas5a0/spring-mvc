package tesco.retail.implementations.services;

import java.util.ArrayList;
import java.util.List;

import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import tesco.retail.implementations.model.Store;

public class StoreServiceTests {

	public void GetAllStores_Success(){
		List<Store> storeList = createStoreList(20);
		StoreServerServiceFactoryImpl storeService = 
				Mockito.mock(StoreServerServiceFactoryImpl.class);
		
		Mockito.when(storeService.GetAllStores()).then((Answer<?>) storeList);
		
	}
	
	public List<Store> createStoreList(int numberOfStores) {

		List<Store> storeList = new ArrayList<Store>();
		for (int i = 2001, j = 0; i < (2001 + numberOfStores); i++, j++) {
			Store store = new Store();
			store.setId(j);
			store.setStoreIp("66.30.1." + (j + 10));
			store.setStoreNumber(i+"");
			storeList.add(store);
		}
		
		return storeList;
	}
}
