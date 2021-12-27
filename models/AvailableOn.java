import java.util.Arrays;
import java.util.LinkedList;

public class AvailableOn {

	private LinkedList<LinkedList<Integer>> days = new LinkedList<LinkedList<Integer>>();
	private LinkedList<String> prefixes = new LinkedList<String>(Arrays.asList(
			"Mon: ", "Tue: ", "Wed: ", "Thu: ", "Fri: ", "Sat: ", "Sun: "
			));
	
	
	/*
	 * @param: 	days: LinkedList<LinkedList<Integer>>
	 * @requires: 	The total number of days must be 7. 
	 * 			  	For each day, the day should have a even number of times.
	 * 				Each day must be sorted.
	 * 				Each day has a minimum value of 0 and a maximum value of 1440, 
	 * 				which represents the number of minutes past since 0.00
	 * @return: 	availableOn : AvailableOn
	 */
	
	public AvailableOn(AvailableOn availableOn) {
		this.days = availableOn.getDays();
		this.prefixes = availableOn.getPrefixes();
	}
	
	public AvailableOn (LinkedList<LinkedList<Integer>> days) {
		
		// The number of days is equal to 7
		assert (days.size() == 7); 
		
		for(LinkedList<Integer> day : days) {
			
			// Each day should have an even number of time points
			assert(day.size() % 2 == 0);
			
			// Each day should be sorted ascending
			for (int i = 0; i < day.size() - 2; i++) {
				assert (day.get(i) < day.get(i+1));
			}
			
			// Each time zone should be in range 0 till 1439
			assert(day.get(0) >= 0);
			assert(day.get(day.size() - 1) <= 1439);
		}
		this.days = days;
	}
	
	public AvailableOn () {
		
		this(defaultDays());
				
	}

	@Override
	/*
	 * Converts the days starting from Monday, …, Sunday 
	 * in human-readable format, e.g.:
	 * "Mon: 15.00-17.00, 19.00-21.00
	 *  Tue: 15.00-17.00, 20.00-21.00" 
	 * @ returns: 	daysString : String
	 */
	public String toString() { 
		
		// Create new StringBuilder object
		StringBuilder daysStringBuilder = new StringBuilder()
				.append("\n{");
		
		for (int i = 0; i < 7; i++) {
			daysStringBuilder.append("\n  ");
			LinkedList<Integer> day = days.get(i);
			String prefix = this.prefixes.get(i);
			daysStringBuilder.append(prefix);
			
			// Iterate over each time interval
			for (int j = 0; j < day.size() / 2; j++) {
				
				// Calculate starting and ending hours and minutes
				// Then convert each to 2-digit string
				String startHour = String.format("%02d", day.get(2 * j) / 60);
				String startMinute = String.format("%02d", day.get(2 * j) % 60);
				String endHour = String.format("%02d", day.get(2 * j + 1) / 60);
				String endMinute = String.format("%02d", day.get(2 * j + 1) % 60);
				
				// Append interval to StringBuilder
				daysStringBuilder
					.append(startHour)
					.append('.')
					.append(startMinute)
					.append('-')
					.append(endHour)
					.append('.')
					.append(endMinute);
				
				// If it is not the last interval, append a comma at the end
				if (j < day.size() / 2 - 1) {
					daysStringBuilder.append(", ");
				}
			}			
		}
		
		// Build the string and return 
		String daysString = daysStringBuilder
				.append("\n}")
				.toString();
		return daysString;
	}
	
	public static void main(String[] args) {
		LinkedList<LinkedList<Integer>> sampleDays = new LinkedList<LinkedList<Integer>>();
			
		for (int i = 0; i < 7; i++) {
			LinkedList<Integer> sampleDay;
			if (i > 4) {
				sampleDay = new LinkedList<Integer>(Arrays.asList(60, 120, 180, 240));
			}
			else {
				sampleDay = new LinkedList<Integer>(Arrays.asList(300, 360, 420, 480, 540, 600));
			}
			sampleDays.add(sampleDay);
		}
		
		AvailableOn availableOn = new AvailableOn(sampleDays);
		System.out.println(availableOn);
	}
	
	public LinkedList<Integer> getMonday() {
		return days.get(0);
	}

	public void setMonday(LinkedList<Integer> monday) {
		this.days.set(0, monday);
	}
	
	public LinkedList<Integer> getTuesday() {
		return days.get(1);
	}

	public void setTuesday(LinkedList<Integer> tuesday) {
		this.days.set(1, tuesday);
	}

	public LinkedList<Integer> getWednesday() {
		return days.get(2);
	}

	public void setWednesday(LinkedList<Integer> wednesday) {
		this.days.set(2, wednesday);
	}
	
	public LinkedList<Integer> getThursday() {
		return days.get(3);
	}

	public void setThursday(LinkedList<Integer> thursday) {
		this.days.set(3, thursday);
	}
	
	public LinkedList<Integer> getFriday() {
		return days.get(4);
	}

	public void setFriday(LinkedList<Integer> friday) {
		this.days.set(4, friday);
	}
	
	public LinkedList<Integer> getSaturday() {
		return days.get(5);
	}

	public void setSaturday(LinkedList<Integer> saturday) {
		this.days.set(5, saturday);
	}
	
	public LinkedList<Integer> getSunday() {
		return days.get(6);
	}

	public void setSunday(LinkedList<Integer> sunday) {
		this.days.set(6, sunday);
	}

	public LinkedList<String> getPrefixes() {
		return prefixes;
	}

	public void setPrefixes(LinkedList<String> prefixes) {
		this.prefixes = prefixes;
	}
	
	public LinkedList<LinkedList<Integer>> getDays () {
		return days;
	}
	
	public void setDays (LinkedList<LinkedList<Integer>> days) {
		this.days = days;
	}
	
	public static LinkedList<LinkedList<Integer>> defaultDays () {
		LinkedList<LinkedList<Integer>> days = new LinkedList<LinkedList<Integer>>();
		
		for (int i = 0; i < 7; i++) {
			LinkedList<Integer> day = new LinkedList<Integer>();
			day.add(0);
			day.add(1439);
			days.add(day);
		}
		
		return days;
	}
	
}