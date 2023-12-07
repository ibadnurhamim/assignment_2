package oops;

public class Pojo {
    private String cityName;
    private String capital;

    public Pojo(String cityName, String capital) {
        this.cityName = cityName;
        this.capital = capital;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
