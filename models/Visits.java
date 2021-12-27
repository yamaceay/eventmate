public class Visits {

	private int userId;

	private int organizationId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public Visits(int userId, int organizationId) {
		this.userId = userId;
		this.organizationId = organizationId;
	}
	
}
