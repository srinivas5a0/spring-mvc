package rcc.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages={"rcc.data"})
public class CouchDBConfig extends AbstractCouchbaseConfiguration{

	@Override
	protected List<String> getBootstrapHosts() {
		// TODO Auto-generated method stub
		return Arrays.asList("localhost");
	}

	@Override
	protected String getBucketName() {
		// TODO Auto-generated method stub
		return "RetailImplementations";
	}

	@Override
	protected String getBucketPassword() {
		// TODO Auto-generated method stub
		return "srinivas";
	}

	
}
