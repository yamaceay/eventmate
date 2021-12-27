public class Tag {

	private String tag;

	private int forumId;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getForumId() {
		return forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
	}

	public Tag(String tag, int forumId) {
		this.tag = tag;
		this.forumId = forumId;
	}

	
}
