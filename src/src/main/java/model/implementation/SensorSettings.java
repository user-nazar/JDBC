package src.main.java.model.implementation;

import src.main.java.model.IGeneralModel;

//@Entity

public class SensorSettings implements IGeneralModel {
    private Integer id;
    private double sensorRange;
    private double sensorResolution;
    private Integer systemId;
    //private System SystemBySystemId;

    //public SensorSettings() {}

    public SensorSettings(Integer id, double sensorRange, double sensorResolution, Integer systemId) {
        //public NotificationSettings(final Integer id, final double sensorRange, final double sensorResolution, final System SystemBySystemId) {
        this.id = id;
        this.sensorRange = sensorRange;
        this.sensorResolution = sensorResolution;
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

    public double getSensorRange() {
        //@Basic
        //@Column(name = "sensorRange")
        //public Double getSensorRange() {

        return sensorRange;
    }

    public void setSensorRange(double sensorRange) {
        //public void setSensorRange(double rangeLevel) {

        this.sensorRange = sensorRange;
    }

    public double getSensorResolution() {
        //@Basic
        //@Column(name = "sensorResolution")
        //public Double getSensorResolution() {

        return sensorResolution;
    }

    public void setSensorResolution(double sensorResolution) {
        //public void setSensorResolution(double sensorResolution) {

        this.sensorResolution = sensorResolution;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }
/*
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorSettings sensorSettings = (SensorSettings) o;
        return Objects.equals(id, sensorSettings.id) &&
                Objects.equals(sensorRange sensorSettings.controlAccessLevel) &&
        Objects.equals(sensorResolution, sensorSettings.rangeLevel);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sensorRange, sensorResolution);
    }

    @ManyToOne
    @JoinColumn(name = "system_id", referencedColumnName = "id", nullable = false)
    public System getSystemBySystemId() {
        return systemBySystemId;

     */

    @Override
    public String toString() {
        return "SensorSettings{" +
                "id=" + id +
                ", sensorRange=" + sensorRange +
                ", sensorResolution=" + sensorResolution +
                ", systemId=" + systemId +
                '}';
    }
}

/*
    public String toString() {

        return "SensorSettings{" +
                "id=" + id +
                ", sensorRange='" + sensorRange + '\'' +
                ", sensorResolution='" + sensorResolution + '\'' +
                ", systemBySystemId=" +systemBySystemId.getName() +
                '}';
        */