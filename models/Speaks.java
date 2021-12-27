public class Speaks {

	private int languageId;

	private int userId;

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Speaks(int languageId, int userId) {
		this.languageId = languageId;
		this.userId = userId;
	}

	
}
