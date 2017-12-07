package rcc.data;

import java.util.List;

import rcc.models.Store;

public interface StoreRepository {

	public Store findStoreByNumber(int storeNumber);

	public List<Store> GetAllStores(int numberOfRows);
}
