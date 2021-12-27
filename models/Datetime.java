import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.StringBuilder;

public class Datetime {

	private String date;
	
	private String time;
	
	public String getCurrentDate() {
		setCurrent();
		return date;
	}
	
	public String getCurrentTime() {
		setCurrent();
		return time;
	}
	
	public void setCurrent() {
		Date datetime = new Date();
				
		SimpleDateFormat timePattern = new SimpleDateFormat("HH:mm");
		SimpleDateFormat datePattern = new SimpleDateFormat("dd/MM/yy");
		
		String timeString = timePattern.format(datetime);
		String dateString = datePattern.format(datetime);
		
		this.time = timeString;
		this.date = dateString;
	}
	
	@Override
	public String toString() {
		StringBuilder dateTimeStringBuilder = new StringBuilder();
		
		String dateTimeString = dateTimeStringBuilder
				.append(time)
				.append(" - ")
				.append(date)
				.toString();
		
		return dateTimeString;
	}
	
	public Datetime() {
		setCurrent();
	}
	
	public Datetime(Datetime datetime) {
		this.date = datetime.getDate();
		this.time = datetime.getTime();
	}
	
	public static void main(String[] args) {
		Datetime newDateTime = new Datetime();
		newDateTime.setDate("07/09/21");
		newDateTime.setTime("12:08");
		System.out.println(newDateTime);
		
		newDateTime.setCurrent();
		System.out.println(newDateTime);
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}
