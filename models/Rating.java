public class Rating {

	private int publicProfileId;

	private int userId;

	private int featureId;

	private int ratingId;

	public int getPublicProfileId() {
		return publicProfileId;
	}

	public void setPublicProfileId(int publicProfileId) {
		this.publicProfileId = publicProfileId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFeatureId() {
		return featureId;
	}

	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}

	public int getRatingId() {
		return ratingId;
	}

	public Rating(int publicProfileId, int userId, int featureId) {
		this.publicProfileId = publicProfileId;
		this.userId = userId;
		this.featureId = featureId;
		this.ratingId = hashCode();
	}

	
}
