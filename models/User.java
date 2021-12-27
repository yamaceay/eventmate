public class User {

	private String name;

	private String email;

	private String number;

	private int password;

	private int age;

	private AvailableOn availableOn;

	private int userId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AvailableOn getAvailableOn() {
		return availableOn;
	}

	public void setAvailableOn(AvailableOn availableOn) {
		this.availableOn = availableOn;
	}

	public int getUserId() {
		return userId;
	}

	public User(String name, String email, String number, int password, int age, AvailableOn availableOn) {
		this.name = name;
		this.email = email;
		this.number = number;
		this.password = password;
		this.age = age;
		this.availableOn = availableOn;
		this.userId = hashCode();
	}
	
	

}
