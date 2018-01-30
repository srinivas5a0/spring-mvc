/**
 * 
 */
package tesco.retail.implementations.services;

import java.util.ArrayList;
import java.util.List;

import tesco.retail.implementations.model.Store;

/**
 * @author vagrant
 *
 */

public interface StoreServerServiceFactory {
	
	List<Store> GetAllStores();
	Store GetStoreByName(String storeName);
	void AddStore(Store store);
	void DeleteStore(Store store);
	Store getStoreById(String id);
		
}
