public class Feature {

	private String featureKey;

	private int featureValue;

	private int featureId;

	public String getFeatureKey() {
		return featureKey;
	}

	public void setFeatureKey(String featureKey) {
		this.featureKey = featureKey;
	}

	public int getFeatureValue() {
		return featureValue;
	}

	public void setFeatureValue(int featureValue) {
		this.featureValue = featureValue;
	}

	public int getFeatureId() {
		return featureId;
	}

	public Feature(String featureKey, int featureValue) {
		this.featureKey = featureKey;
		this.featureValue = featureValue;
		this.featureId = hashCode();
	}

}
