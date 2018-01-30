/**
 * 
 */
package tesco.retail.implementations.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tesco.retail.implementations.model.Store;
import tesco.retail.implementations.repositories.StoreRepository;

/**
 * @author vagrant
 *
 */
@Service
public class StoreServerServiceFactoryImpl implements StoreServerServiceFactory {
	
	@Autowired
	private StoreRepository storeRepository;

	/* (non-Javadoc)
	 * @see tesco.retail.implementations.services.StoreServerServiceFactory#GetAllStores()
	 */
	@Override
	public List<Store> GetAllStores() {
		// TODO Auto-generated method stub
		/*List<Store> storeList = new ArrayList<Store>();
		Store store = new Store();
		store.setId(1);
		store.setStoreIp("66.30.1.1");
		store.setStoreNumber("9715");
		
		storeList.add(store);
		*/
	
		return (List<Store>) storeRepository.findAll();
	}

	@Override
	public void AddStore(Store store) {
		// TODO Auto-generated method stub
		storeRepository.save(store);
		
	}

	@Override
	public void DeleteStore(Store store) {
		// TODO Auto-generated method stub
		storeRepository.delete(store);
	}
	
	@Override
	public Store getStoreById(String id) {
		// TODO Auto-generated method stub
		return storeRepository.findOne(id);
	}

	@Override
	public Store GetStoreByName(String storeName) {
		// TODO Auto-generated method stub
		return (Store) storeRepository.getStoreByStoreNumber(storeName);
	}

}
