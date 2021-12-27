public class IsSpoken {

	private int languageId;

	private int organizationId;

	public int getLanguageId() {
		return languageId;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}
	
	public IsSpoken(int languageId, int organizationId) {
		this.languageId = languageId;
		this.organizationId = organizationId;
	}

}
