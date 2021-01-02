package src.main.java.model.implementation;


import src.main.java.model.IGeneralModel;
//@Entity
public class ObjectAndSecurity implements IGeneralModel {
    private Integer id;
    private String location;

    //publicObjectAndSecurity() {}

    public ObjectAndSecurity(Integer id, String location) {
        this.id = id;
        this.location = location;

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

    public String getLocation() {
        //@Basic
        //@Column(name = "location")
        //public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        //public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "ObjectAndSecurity{" +
                "id=" + id +
                ", location='" + location + '\'' +
        '}';
    }
}

 /*
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       ObjectAndSecurity notificationSettings = (ObjectAndSecurity) o;
        return Objects.equals(id, ObjectAndSecurity.id) &&
                Objects.equals(location, objectAndSecurity.location);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location);
    }


/*
    public String toString() {

        return "ObjectAndSecurity{" +
                "id=" + id +
                ", location='" + location + '\'' +
                '}';
        */
