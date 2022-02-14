package com.example.domain;

public class Ex2 {
	private Integer id;
	private String areaName;
	private String hotelName;
	private String addless;
	private String nearestStation;
	private String price;
	
	public int getIntPrice() {
		return Integer.parseInt(price);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddless() {
		return addless;
	}

	public void setAddless(String addless) {
		this.addless = addless;
	}

	public String getNearestStation() {
		return nearestStation;
	}

	public void setNearestStation(String nearestStation) {
		this.nearestStation = nearestStation;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ex2 [id=" + id + ", areaName=" + areaName + ", hotelName=" + hotelName + ", addless=" + addless
				+ ", nearestStation=" + nearestStation + ", price=" + price + "]";
	}

}
