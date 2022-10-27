package entities;

public class HotelBusiness {
	
	private String name;
	private String email;
	
	public HotelBusiness() {
	}

	public HotelBusiness(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return name + ", " + email;
	}

}
