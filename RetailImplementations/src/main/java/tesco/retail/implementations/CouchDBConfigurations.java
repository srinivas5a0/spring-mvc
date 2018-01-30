package tesco.retail.implementations;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages={"tesco.retail.implementations"})
public class CouchDBConfigurations extends AbstractCouchbaseConfiguration {

	@Autowired
	Environment env;
	
	@Override
	protected List<String> getBootstrapHosts() {
		return Arrays.asList("localhost","127.0.0.1");
	}

	@Override
	protected String getBucketName() {
		return "RetailImplementations";
	}

	@Override
	protected String getBucketPassword() {
		return "srinivas";
	}
	@Override
	public String typeKey() {
	    // use "javaClass" instead of "_class"
	    return "class";
	}
	
	
}
