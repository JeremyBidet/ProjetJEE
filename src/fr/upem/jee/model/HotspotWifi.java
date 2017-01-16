package fr.upem.jee.model;

@Entity
@Table(name="hotspot_wifi")
public class HotspotWifi {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private final Integer ID;
	
	@Column(name="site_name")
	private String site_name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="site_code")
	private String site_code;
	
	@Column(name="district")
	private String district;
	
	@Column(name="coord")
	private Point coord;
	
	public HotspotWifi(Integer iD, String site_name, String address, String site_code, String district, Point coord) {
		super();
		ID = iD;
		this.site_name = site_name;
		this.address = address;
		this.site_code = site_code;
		this.district = district;
		this.coord = coord;
	}

	public Integer getID() {
		return ID;
	}

	public String getSite_name() {
		return site_name;
	}

	public String getAddress() {
		return address;
	}

	public String getSite_code() {
		return site_code;
	}

	public String getDistrict() {
		return district;
	}

	public Point getCoord() {
		return coord;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSite_code(String site_code) {
		this.site_code = site_code;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCoord(Point coord) {
		this.coord = coord;
	}
	
}
