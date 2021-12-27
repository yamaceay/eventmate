public class PublicProfile {

	private String name;

	private int addressId;

	private String description;

	private int publicProfileId;

	private int forumId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getForumId() {
		return forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
	}

	public int getPublicProfileId() {
		return publicProfileId;
	}

	public PublicProfile(String name, int addressId, String description, int forumId) {
		this.name = name;
		this.addressId = addressId;
		this.description = description;
		this.forumId = forumId;
		this.publicProfileId = hashCode();
	}

	
}
