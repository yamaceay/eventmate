public class Badge {

	private String badge;

	private int badgeId;

	private int userId;

	public Badge(String badge, int userId) {
		super();
		this.badge = badge;
		this.userId = userId;
		this.badgeId = hashCode();
	}
	
	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBadgeId() {
		return badgeId;
	}

}
