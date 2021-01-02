package src.main.java.model.implementation;


import src.main.java.model.IGeneralModel;
//@Entity
public class SensorNotification implements IGeneralModel {
    private Integer id;
    private double rangeLevel;
    private double resolutionLevel;
    private Integer systemId;
    //private System SystemBySystemId;

    //public SensorNotification() {}


    public SensorNotification(Integer id, double rangeLevel, double resolutionLevel, Integer systemId) {
        //public NotificationSettings(final Integer id, final double rangeLevel, final double resolutionLevel, final System SystemBySystemId) {
        this.id = id;
        this.rangeLevel = rangeLevel;
        this.resolutionLevel = resolutionLevel;
        this.systemId = systemId;
        // this.systemBySystemId = systemBySystemId;
    }

    @Override
    public Integer getId() {
        //@Id
        //@Column(name = "id")
        //public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        // public void setId(Integer id) {
        // this.id = id;

        this.id = id;
    }

    public double getRangeLevel() {
        //@Basic
        //@Column(name = "rangeLevel")
        //public Double getRangeLevel() {

        return rangeLevel;
    }

    public void setRangeLevel(double rangeLevel) {
        //public void setRangeLevel(double rangeLevel) {
        this.rangeLevel = rangeLevel;
    }

    public double getResolutionLevel() {
        //@Basic
        //@Column(name = "resolutionLevel")
        //public Double getResolutionLevel() {

        return rangeLevel;
    }

    public void setResolutionLevel(double resolutionLevel) {
        this.resolutionLevel = resolutionLevel;
    }

    public Integer getSystemId() {
        //public void setResolutionLevel(double resolutionLevel) {
        return id;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

     /*
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
      SensorNotification sensorNotification = (SensorNotification) o;
        return Objects.equals(id, sensorNotification.id) &&
                 Objects.equals(rangeLevel, sensorNotification.rangeLevel) &&
                 Objects.equals(resolutionLevel, sensorNotification.resolutionLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rangeLevel, resolutionLevel );
    }

    @ManyToOne
    @JoinColumn(name = "system_id", referencedColumnName = "id", nullable = false)
    public System getSystemBySystemId() {
        return systemBySystemId;

     */

    @Override
    public String toString() {
        return "SensorNotification{" +
                "id=" + id +
                ", rangeLevel='" + rangeLevel +
                ", resolutionLevel='" + resolutionLevel +
                ", systemId='" + systemId +
                '}';
    }
}

/*
    public String toString() {

        return "SensorNotification{" +
                "id=" + id +
                ", rangeLevel='" + rangeLevel + '\'' +
                ", resolutionLevel='" + resolutionLevel + '\'' +
                ", systemBySystemId=" +systemBySystemId.getName() +
                '}';
        */

