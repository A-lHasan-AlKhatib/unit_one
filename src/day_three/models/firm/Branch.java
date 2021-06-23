package day_three.models.firm;

import day_three.models.people.Administrative;
import day_three.models.people.Person;

public abstract class Branch {
    private Administrative manager;
    private double lat, lon;
    private String cityName, contactPhone;
    private Brand brand;

    protected Branch() {
        manager = new Administrative.AdministrativeBuilder().build();
        lat = 0;
        lon = 0;
        cityName = Person.EMPTY;
        contactPhone = Person.EMPTY;
        brand = new Brand.BrandBuilder().build();
    }

    public Administrative getManager() {
        return manager;
    }

    public void setManager(Administrative manager) {
        this.manager = manager;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public abstract String getClassName();
}
