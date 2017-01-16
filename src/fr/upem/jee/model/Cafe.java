package fr.upem.jee.model;

import java.util.Date;

@Entity
@Table(name="cafe")
public class Cafe {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private final Integer ID;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="cafe_name")
	private String cafe_name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="district")
	private String district;
	
	@Column(name="counter_price")
	private Double counter_price;
	
	@Column(name="indoor_price")
	private Double indoor_price;
	
	@Column(name="outdoor_price")
	private Double outdoor_price;
	
	@Column(name="coord")
	private Point coord;
	
	public Cafe(Integer ID, Date date, String cafe_name, String address, String district, Double counter_price,
			Double indoor_price, Double outdoor_price, Point coord) {
		super();
		this.ID = ID;
		this.date = date;
		this.cafe_name = cafe_name;
		this.address = address;
		this.district = district;
		this.counter_price = counter_price;
		this.indoor_price = indoor_price;
		this.outdoor_price = outdoor_price;
		this.coord = coord;
	}

	public Integer getID() {
		return ID;
	}

	public Date getDate() {
		return date;
	}

	public String getCafe_name() {
		return cafe_name;
	}

	public String getAddress() {
		return address;
	}

	public String getDistrict() {
		return district;
	}

	public Double getCounter_price() {
		return counter_price;
	}

	public Double getIndoor_price() {
		return indoor_price;
	}

	public Double getOutdoor_price() {
		return outdoor_price;
	}

	public Point getCoord() {
		return coord;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setCafe_name(String cafe_name) {
		this.cafe_name = cafe_name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCounter_price(Double counter_price) {
		this.counter_price = counter_price;
	}

	public void setIndoor_price(Double indoor_price) {
		this.indoor_price = indoor_price;
	}

	public void setOutdoor_price(Double outdoor_price) {
		this.outdoor_price = outdoor_price;
	}

	public void setCoord(Point coord) {
		this.coord = coord;
	}
	
}
