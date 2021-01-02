package src.main.java.model.implementation;


import src.main.java.model.IGeneralModel;
//@Entity
public class NotificationSettings implements IGeneralModel {
    private Integer id;
    private double controlAccessLevel;
    private Integer systemId;
    //private System SystemBySystemId;

    //public NotificationSettings() {}

    public NotificationSettings(Integer id, double controlAccessLevel, Integer systemId) {
    //public NotificationSettings(final Integer id, final double controlAccessLevel, final System SystemBySystemId) {
        this.id = id;
        this.controlAccessLevel = controlAccessLevel;
        this.systemId = systemId;
        //this.systemBySystemId = systemBySystemId;
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

    public double getControlAccessLevel() {
        //@Basic
        //@Column(name = "controlAccessLevel")
        //public double getControlAccessLevel() {
        return controlAccessLevel;
    }

    public void setControlAccessLevel(double controlAccessLevel) {
        //public void setControlAccessLevel(double controlAccessLevel) {
        this.controlAccessLevel = controlAccessLevel;
    }

    public Integer getSystemId() {
        return systemId;
    }

    /*
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       NotificationSettings notificationSettings = (NotificationSettings) o;
        return Objects.equals(id, notificationSettings.id) &&
                Objects.equals(controlAccessLevel, notificationSettings.controlAccessLevel);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, controlAccessLevel);
    }

    @ManyToOne
    @JoinColumn(name = "system_id", referencedColumnName = "id", nullable = false)
    public System getSystemBySystemId() {
        return systemBySystemId;

     */

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
        // public void setSystemBySystemId(System systemBySystemId) {
        //        this.systemBySystemId = systemBySystemId;
    }

    @Override
    public String toString() {
        return "NotificationSettings{" +
                "id=" + id +
                ", controlAccessLevel='" + controlAccessLevel +
                ", systemId='" + systemId +
                '}';
    }
}

 /*
    public String toString() {

        return "NotificationSettings{" +
                "id=" + id +
                ", controlAccessLevel='" + controlAccessLevel + '\'' +
                ", systemBySystemId=" +systemBySystemId.getName() +
                '}';
        */

