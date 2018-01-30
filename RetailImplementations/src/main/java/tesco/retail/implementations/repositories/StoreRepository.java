package tesco.retail.implementations.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tesco.retail.implementations.model.Store;

public interface StoreRepository extends CrudRepository<Store, String> {

	List<Store> getStoreByStoreNumber(String storeNumber);
}
