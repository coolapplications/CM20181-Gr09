package co.edu.udea.ubiu.Model;

/**
 * Created by amauricio.alvarez on 23/05/18.
 */

public class Dependency {
    String coordinate;
    String officeNumber;
    String officeName;

    public Dependency(String coordinate, String officeNumber, String officeName) {
        this.coordinate = coordinate;
        this.officeNumber = officeNumber;
        this.officeName = officeName;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
}
