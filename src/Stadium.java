
public class Stadium {

	private String stadiumName = null;
	private String capacity = null;

	public Stadium(String stadiumName, String capacity) {

		this.stadiumName = stadiumName;
		this.capacity = capacity;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

}
