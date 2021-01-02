package src.main.java.model.implementation;


import src.main.java.model.IGeneralModel;
//@Entity
public class Zone implements IGeneralModel {
    private Integer id;
    private int quantityRooms;
    private double levelRange;

    //public Zone() {
    //}

    public Zone(Integer id, int quantityRooms, double levelRange) {
        this.id = id;
        this.quantityRooms = quantityRooms;
        this.levelRange = levelRange;

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

    public int getQuantityRooms() {
        //@Basic
        //@Column(name = "quantityRooms")
        //public int getQuantityRooms() {

        return quantityRooms;
    }

    public void setQuantityRooms(int quantityRooms) {
        //public void setQuantityRooms(int quantityRooms) {

        this.quantityRooms = quantityRooms;
    }

    public double getLevelRange() {
        //@Basic
        //@Column(name = "levelRange")
        //public double getLevelRange() {

        return levelRange;
    }

    public void setLevelRange(double levelRange) {
        //public void setLevelRange(double levelRange) {


        this.levelRange = levelRange;
    }

    /*
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zone zone = (Zone) o;
        return Objects.equals(id, zone.id) &&
                Objects.equals(quantityRooms, zone.quantityRooms) &&
                Objects.equals(levelRange, zone.levelRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantityRooms, levelRange);
    }

     */


    @Override
    public String toString() {
        return "Zone{" +
                "id=" + id +
                ", quantityRooms=" + quantityRooms +
                ", levelRange=" + levelRange +
                '}';
    }
}

/*
    public String toString() {

        return "Zone{" +
                "id=" + id +
                ", quantityRooms='" + quantityRooms + '\'' +
                ", levelRange='" + levelRange + '\'' +
                '}';
        */

