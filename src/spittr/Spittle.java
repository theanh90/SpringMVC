package spittr;

import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Spittle {

	private final Long id;
	private final String message;
	private final Date time;
	private Double latitude;
	private Double longitude;

	public Spittle(String message, Date time) {
		this(message, time, null, null);
	}

	public Spittle(String message, Date time, Double longitude, Double latitude) {
		this.id = null;
		this.message = message;
		this.time = time;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}

	public Double getLongitude() {
		return longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

//	@Override
//	public boolean equals(Object that) {
//		return EqualsBuilder.reflectionEquals(this, that, "id", "time");
//		// return EqualsBuilder.reflectionEquals(this, obj);
//	}
//
//	@Override
//	public int hashCode() {
//		return HashCodeBuilder.reflectionHashCode(this, "id", "time");
//		// return HashCodeBuilder.reflectionHashCode(this);
//	}
	
	@Override
	public String toString(){
		return "Spittle: " + this.getMessage() + " " + this.getTime() + " " + this.getLatitude() 
				+ " " + this.getLongitude();
		
	}
}
