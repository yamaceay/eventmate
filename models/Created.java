public class Created {

	private User createdBy;

	private Datetime createdAt;

	public Created() {
		this.createdAt = new Datetime();
	}
	
	public Created(Created created) {
		this.createdAt = created.getCreatedAt();
		this.createdBy = created.getCreatedBy();
	}
	
	@Override
	public String toString() {
		StringBuilder createdStringBuilder = new StringBuilder();
		
		
		String createdString = createdStringBuilder
				.append("Created by ")
				.append(createdBy)
				.append(" at ")
				.append(createdAt)
				.toString();
		
		return createdString;
	}
	
	public static void main(String[] args) {
		Created created = new Created();
				
		System.out.println(created);
	}
	
	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Datetime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Datetime createdAt) {
		this.createdAt = createdAt;
	}

}