package tesco.retail.implementations.model;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Store {

	@Id
	@Field
	private int id;
	@Field
	private String storeNumber;
	@Field
	private String storeIp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getStoreIp() {
		return storeIp;
	}

	public void setStoreIp(String storeIp) {
		this.storeIp = storeIp;
	}

}
