package src.main.java.model.implementation;


import src.main.java.model.IGeneralModel;

//@Entity
public class AccessLevel implements IGeneralModel {
    private Integer id;
    private double rangeSensor;
    private double resolution;

    //public AccessLevel() {
    //}


    public AccessLevel(Integer id, double rangeSensor, double resolution) {
        this.id = id;
        this.rangeSensor = rangeSensor;
        this.resolution = resolution;
    }

    @Override
    public Integer getId() {
        //@Id
        //@Column(name = "id")
        //public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        //public void setId(Integer id) {
        this.id = id;
    }

    public double getRangeSensor() {
        //@Basic
        //@Column(name = "rangeSensor")
        //public double getRangeSensor() {
        return rangeSensor;
    }

    public void setRangeSensor(double rangeSensor) {
        //public void setName(Double rangeSensor) {
        this.rangeSensor = rangeSensor;
    }

    public double getResolution() {
        //@Basic
        //@Column(resolution = "resolution")
        //public Double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        //public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    /*
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessLevel accessLevel = (AccessLevel) o;
        return Objects.equals(id, accessLevel.id) &&
                Objects.equals(rangeSensor, accessLevel.rangeSensor) &&
                Objects.equals(resolution, accessLevel.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rangeSensor, resolution);
    }

     */


    @Override
    public String toString() {
        return "AccessLevel{" +
                "id=" + id +
                ", rangeSensor='" + rangeSensor +
                ", resolution='" + resolution +
        '}';
    }
}

    /*
    public String toString() {

        return "AccessLevel{" +
                "id=" + id +
                ", rangeSensor='" + rangeSensor + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
        */


