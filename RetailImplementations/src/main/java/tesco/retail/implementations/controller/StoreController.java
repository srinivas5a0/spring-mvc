package tesco.retail.implementations.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tesco.retail.implementations.model.Store;
import tesco.retail.implementations.services.StoreServerServiceFactory;

@RestController
@RequestMapping("/api/v1")
public class StoreController {
	
	@Autowired
	private StoreServerServiceFactory storeService;
	
	private static final Logger logger = LoggerFactory.getLogger(StoreController.class);
		
	@RequestMapping(value = "/stores", method = RequestMethod.GET)
	public ResponseEntity<List<Store>> GetAllStores(){
		logger.info("Inside StoreService GetAllStores");
		List<Store> storeList = storeService.GetAllStores();
		if(storeList.isEmpty()){
	    	   return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	       }
	       return new ResponseEntity<List<Store>>(storeList,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/store/{id}", method = { RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
	public Store getStoreById(@PathVariable String id) {
		logger.info("Find student by id: {}", id);
		return storeService.getStoreById(id);		
	}
	
	@RequestMapping(value="/store", method=RequestMethod.GET, produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Store GetStoreByName(String storeName){
		return storeService.GetStoreByName(storeName);
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST, produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public void addStore(@RequestBody Store store){
		storeService.AddStore(store);
	}
}
