package rcc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import rcc.models.Store;

@Service
public class StoreServiceImpl implements IStoreService {

	@Override
	public List<Store> GetAllStores(int numberOfRows) {
		// TODO Auto-generated method stub
		List<Store> storeList = createStoreList(30);
		
		return storeList;
	}
	
	public List<Store> createStoreList(int numberOfStores) {
		
		List<Store> storeList = new ArrayList<Store>();
		for (int i = 2001, j = 0; i < (2001 + numberOfStores); i++, j++) {
			storeList.add(new Store(j, i, "66.30.1." + (j + 10)));
		}
		
		return storeList;
	}

}
