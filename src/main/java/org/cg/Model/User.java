package org.cg.Model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
	
	@Id
    @GeneratedValue
    @Column(name = "USER_ID")
	private Long userId;
	private String nickname;
	
	@ElementCollection
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
	private List<Role> role;
	
	private String name;
	private String email;
	private String password;
	private boolean activated;
	private String contactPreference;
	private boolean emailActive;
	private byte[] hashKey;
	
	@ElementCollection
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sender", cascade = CascadeType.ALL)
	private List<Message> sentMessages;
	
	@ElementCollection
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "receiver", cascade = CascadeType.ALL)
	private List<Message> receivedMessages;
	

	@ElementCollection
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "owner", cascade = CascadeType.ALL)
	private List<Request> requests;
	
public List<Message> getSentMessages() {
		return sentMessages;
	}
	public void setSentMessages(List<Message> sentMessages) {
		this.sentMessages = sentMessages;
	}
	public List<Message> getReceivedMessages() {
		return receivedMessages;
	}
	public void setReceivedMessages(List<Message> receivedMessages) {
		this.receivedMessages = receivedMessages;
	}
	public List<Request> getRequests() {
		return requests;
	}
	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
	public String getContactPreference() {
		return contactPreference;
	}
public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId2) {
		this.userId = userId2;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> roles) {
		this.role = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	public String isContactPreference() {
		return contactPreference;
	}

	public void setContactPreference(String contactPreference) {
		this.contactPreference = contactPreference;
	}
	
	public boolean isEmailActive() {
		return emailActive;
	}

	public void setEmailActive(boolean emailActive) {
		this.emailActive = emailActive;
	}
	
	public byte[] getHashKey() {
		return hashKey;
	}

	public void setHashKey(byte[] hashKey) {
		this.hashKey = hashKey;
	}

	@Override
	public String toString(){
		return "User:[Userid="+ userId + ", Nickname=" + nickname + " ,role=" + role + " ,name=" + name + " ,email=" + email + " ,password=" + password
				+ " ,activated=" + activated + " ,contactPreference=" + contactPreference + " ,emailActive=" + emailActive + " .hashKey=" + hashKey + "]";
	}


	
	
}
