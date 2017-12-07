package rcc.services;

import java.util.List;
import rcc.models.Store;

public interface IStoreService {

	public List<Store> GetAllStores(int numberOfRows);
}
