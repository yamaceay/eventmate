public class Forum {

	private String topic;

	private String description;

	private int forumId;
	
	public Forum(String topic, String description) {
		this.topic = topic;
		this.description = description;
		this.forumId = hashCode();
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
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

	/*

	public PublicProfile getPublicProfile() {
		return publicProfile;
	}

	public void setPublicProfile(PublicProfile publicProfile) {
		this.publicProfile = publicProfile;
	}

	public Bag<String> getTags() {
		return tags;
	}

	public void setTags(Bag<String> tags) {
		this.tags = tags;
	}

	public LinkedList<Message> getMessages() {
		return messages;
	}

	public void setMessages(LinkedList<Message> messages) {
		this.messages = messages;
	}
	*/
}

