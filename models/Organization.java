public class Organization {

	private int minAge;

	private float entryFee;

	private Datetime datetime;

	private Created created;

	private int publicProfileId;

	private int organizationId;

	private int placeId;

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public float getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(float entryFee) {
		this.entryFee = entryFee;
	}

	public Datetime getDatetime() {
		return datetime;
	}

	public void setDatetime(Datetime datetime) {
		this.datetime = datetime;
	}

	public Created getCreated() {
		return created;
	}

	public void setCreated(Created created) {
		this.created = created;
	}

	public int getPublicProfileId() {
		return publicProfileId;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPublicProfileId(int publicProfileId) {
		this.publicProfileId = publicProfileId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public Organization(int minAge, float entryFee, Datetime datetime, Created created, int publicProfileId,
			int placeId) {
		this.minAge = minAge;
		this.entryFee = entryFee;
		this.datetime = datetime;
		this.created = created;
		this.publicProfileId = publicProfileId;
		this.placeId = placeId;
		this.organizationId = hashCode();
	}

}
