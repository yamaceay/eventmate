public class Place {

	private AvailableOn availableOn;

	private int publicProfileId;

	private int placeId;

	public AvailableOn getAvailableOn() {
		return availableOn;
	}

	public void setAvailableOn(AvailableOn availableOn) {
		this.availableOn = availableOn;
	}

	public int getPublicProfileId() {
		return publicProfileId;
	}

	public void setPublicProfileId(int publicProfileId) {
		this.publicProfileId = publicProfileId;
	}

	public int getPlaceId() {
		return placeId;
	}

	public Place(AvailableOn availableOn, int publicProfileId) {
		this.availableOn = availableOn;
		this.publicProfileId = publicProfileId;
		this.placeId = hashCode();
	}
	
	

}
