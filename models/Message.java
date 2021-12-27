public class Message {

	private String title;

	private String content;

	private Created created;

	private int messageId;

	private int forumId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Created getCreated() {
		return created;
	}

	public void setCreated(Created created) {
		this.created = created;
	}

	public int getMessageId() {
		return messageId;
	}

	public int getForumId() {
		return forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
	}

	public Message(String title, String content, Created created, int forumId) {
		this.title = title;
		this.content = content;
		this.created = created;
		this.forumId = forumId;
		this.messageId = hashCode();
	}

	
}
