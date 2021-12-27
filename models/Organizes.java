public class Organizes {

	private int userId;

	private int organizationId;

	public int getUserId() {
		return userId;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public Organizes(int userId, int organizationId) {
		this.userId = userId;
		this.organizationId = organizationId;
	}

}
