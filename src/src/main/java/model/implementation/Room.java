package src.main.java.model.implementation;

import src.main.java.model.IGeneralModel;
//@Entity
public class Room implements IGeneralModel {
    private Integer id;
    private String nameRoom;
    private double square;

    //publicRoom() {}


    public Room(Integer id, String  nameRoom, double square) {
        this.id = id;
        this.nameRoom = nameRoom;
        this.square = square;
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

    public String getNameRoom() {
        //@Basic
        //@Column(name = "nameRoom")
        //public String getNameRoom() {

        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        //public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public double getSquare() {
        //@Basic
        //@Column(name = "square")
        //public Double getSquare() {

        return square;
    }

    public void setSquare(double square) {
        //public void setSquare(double square) {

        this.square = square;
    }

    /*
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       Room room = (Room) o;
        return Objects.equals(id, Room.id) &&
                Objects.equals(nameRoom, room.nameRoom) &&
                Objects.equals(square, room.square);


    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location);
    }

     */

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", nameRoom='" + nameRoom + '\'' +
                ", square='" + square +
                '}';
    }
}

/*
    public String toString() {

        return "Room{" +
                "id=" + id +
                ", nameRoom='" + nameRoom + '\'' +
                ", square='" + square + '\'' +
                '}';
        */

