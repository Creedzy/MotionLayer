package org.cg.service.impl;
import org.cg.service.*;
import org.cg.Model.User;

@Service
public class DynamoDBServiceImpl implements DynamoDBService
{
	AmazonDynamoDBClient dynamoDB;
	@PostConstruct
	public void initDb(){

		AWSCredentials credentials = null;
		try {

			credentials = new DefaultAWSCredentialsProviderChain().getCredentials();
		} catch (Exception e) {
			throw new AmazonClientException(
				"Cannot load the credentials from the credential profiles file. " +
				"Please make sure that your credentials file is at the correct " +
				"location (C:\\Users\\nas\\.aws\\credentials), and is in valid format.",
				e);
		}
		dynamoDB = new AmazonDynamoDBClient(credentials);
		Region usWest2 = Region.getRegion(Regions.EU_WEST_1);
		dynamoDB.setRegion(usWest2);
	}
	
	public User addUser(User addUser){
		User user = new User();
		user.setRole(addUser.getRole());
		user.setEmail(addUser.getEmail());
		user.setName(addUser.getName());
		user.setUserId(addUser.getUserId());
		user.setContactPreference();
		
		DynamoDBMapper mapper = new DynamoDBMapper(dynamoDB);
		
	}
	public User updateUser(User updateUser){
		
		User user = new User();
		user.setRole(addUser.getRole());
		user.setEmail(addUser.getEmail());
		user.setName(addUser.getName());
		user.setUserId(addUser.getUserId());
		user.setContactPreference();
		
		DynamoDBMapper mapper = new DynamoDBMapper(dynamoDB);
		
		
	}
	
	public User getUser(String hashkey){
		
		User user = new User();
		DynamoDBMapper mapper = new DynamoDBMapper(dynamoDB);
		user = mapper.load(User.class, hashkey);
		return user;
		
	}
	public List<User> getAllUsers(){
		
		List<User> users = new ArrayList<User>();
		users
	}
	
}
