package rcc.models;

public class Store {

	private long id;
	private int storeNumber;
	private String ipAddress;

	public Store(long id,int storeno,String ip){
		this.id = id;
		this.storeNumber = storeno;
		this.ipAddress = ip;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
}
