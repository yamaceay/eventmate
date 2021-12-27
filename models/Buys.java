public class Buys {

	private int userId;

	private int ticketId;

	public int getUserId() {
		return userId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Buys(int userId, int ticketId) {
		this.userId = userId;
		this.ticketId = ticketId;
	}

}
