import pember.kmeans.geo.GeographicPoint;

import java.math.BigDecimal;

public class point implements GeographicPoint {
       BigDecimal Latitude;
       BigDecimal Longitude;
       String name;

    public point(String name,BigDecimal latitude, BigDecimal longitude) {
        Latitude = latitude;
        Longitude = longitude;
        this.name=name;
    }

    @Override
    public BigDecimal getLatitude() {
        return Latitude;
    }

    @Override
    public void setLatitude(BigDecimal bigDecimal) {
            this.Latitude=bigDecimal;
    }

    @Override
    public BigDecimal getLongitude() {
        return Longitude;
    }

    @Override
    public void setLongitude(BigDecimal bigDecimal) {
        this.Longitude=bigDecimal;
    }
}
