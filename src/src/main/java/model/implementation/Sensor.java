package src.main.java.model.implementation;


import src.main.java.model.IGeneralModel;
//@Entity
public class Sensor implements IGeneralModel {
    private Integer id;
    private double processingTime;
    private String nameModel;
    private String typeSensor;
    private int calibration;
    private String classification;

    //public AccessLevel() {
    //}

    public Sensor(Integer id, double processingTime, String nameModel, String typeSensor, int calibration, String classification) {
        this.id = id;
        this.processingTime = processingTime;
        this.nameModel = nameModel;
        this.typeSensor = typeSensor;
        this.calibration = calibration;
        this.classification = classification;
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

    public double getProcessingTime() {
        //@Basic
        //@Column(name = "processingTime")
        //public Double getProcessingTime() {

        return processingTime;
    }

    public void setProcessingTime(double processingTime) {

        //public void setProcessingTime(double processingTime) {
        this.processingTime = processingTime;
    }

    public String getNameModel() {
        //@Basic
        //@Column(name = "nameModel")
        //public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        //public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getTypeSensor() {
        //@Basic
        //@Column(name = "typeSensor")
        //public String getTypeSensor() {
        return typeSensor;
    }

    public void setTypeSensor(String typeSensor) {

        //public void setTypeSensor(String typeSensor) {
        this.typeSensor = typeSensor;
    }

    public int getCalibration() {
        //@Basic
        //@Column(name = "calibration")
        //public int getCalibration() {

        return calibration;
    }

    public void setCalibration(int calibration) {
        //public void setCalibration(int calibration) {

        this.calibration = calibration;
    }

    public String getClassification() {
        //@Basic
        //@Column(name = "classification")
        //public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        //public void setClassification(String classification) {

        this.classification = classification;
    }

    /*
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sensor sensor = (Sensor) o;
        return Objects.equals(id, sensor.id) &&
                Objects.equals(processingTime, sensor.processingTime) &&
                  Objects.equals(nameModel, sensor.nameModel) &&
                    Objects.equals(typeSensor, sensor.typeSensor) &&
                     Objects.equals(calibration, sensor.calibration) &&
                      Objects.equals(classification, sensor.classification);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, processingTime, nameModel, typeSensor, calibration, classification);
    }

     */

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", processingTime='" + processingTime +
                ", nameModel='" + nameModel + '\'' +
                ", typeSensor=" + typeSensor + '\'' +
                ", calibration='" + calibration +
                ", classification='" + classification + '\'' +
        '}';
    }
}

 /*
    public String toString() {

        return "Sensor{" +
                "id=" + id +
                ", processingTime='" + processingTime + '\'' +
                ", nameModel='" + nameModel + '\'' +
                ", typeSensor=" + typeSensor +
                ", calibration='" + calibration +
                ", classification='" + classification + '\'' +

                '}';
        */

