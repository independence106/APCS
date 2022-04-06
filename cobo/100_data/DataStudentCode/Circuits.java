public class Circuits {
    private String circuitId;
    private String circuitRef;
    private String name;
    private String location;
    private String country;
    private double lat;
    private double lng;
    private int alt;
    private String url;

    public Circuits(String circuitId, String circuitRef, String name, String location, String country, double lat, double lng, int alt, String url) {
        this.circuitId = circuitId;
        this.circuitRef = circuitRef;
        this.name = name;
        this.location = location;
        this.lat = lat;
        this.lng = lng;
        this.alt =  alt;
        this.url = url;
    }

    public String getCircuitId() {
        return this.circuitId;
    }

    public String getCircuitRef() {
        return this.circuitRef;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public String getCountry() {
        return this.country;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }

    public int getAlt() {
        return this.alt;
    }

    public String getUrl() {
        return this.url;
    }

}
