package src.main.java.model.implementation;


import src.main.java.model.IGeneralModel;
//@Entity
public class User implements IGeneralModel {
    private Integer id;
    private String firstName;
    private String lastName;
    private String country;
    private Integer systemId;
    //private System systemBySystemId;

    //public User() {}

    public User(Integer id, String firstName, String lastName, String country, Integer systemId) {
        //public User(final Integer id, final String firstName, final String lastName, final String country, final System SystemBySystemId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.systemId = systemId;
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

    public String getFirstName() {
        //@Basic
        //@Column(name = "firstName")
        //public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        //public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        //@Basic
        //@Column(name = "lastName")
        //public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        //public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getCountry() {
        //@Basic
        //@Column(name = "country")
        //public String getCountry() {

        return country;
    }

    public void setCountry(String country) {
        //public void setCountry(String country) {

        this.country = country;
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
       User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                 Objects.equals(lastName, user.lastName,) &&
                  Objects.equals(country, user.country);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, country);
    }

    @ManyToOne
    @JoinColumn(name = "system_id", referencedColumnName = "id", nullable = false)
    public System getSystemBySystemId() {
        return systemBySystemId;

     */


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName=" + firstName + '\'' +
                ", lastName=" + lastName + '\'' +
                ", country=" + country + '\'' +
                ", systemId=" + systemId +
                '}';
    }
}

/*
    public String toString() {

        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", systemBySystemId=" + systemBySystemId.getName() +
                '}';
        */