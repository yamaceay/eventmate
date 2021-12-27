public class Ticket {

	private Discount discount;

	private Created created;

	private boolean activated;

	private int organizationId;

	private int ticketId;

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public Created getCreated() {
		return created;
	}

	public void setCreated(Created created) {
		this.created = created;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public Ticket(Discount discount, Created created, boolean activated, int organizationId) {
		this.discount = discount;
		this.created = created;
		this.activated = activated;
		this.organizationId = organizationId;
		this.ticketId = hashCode();
	}

	
}
