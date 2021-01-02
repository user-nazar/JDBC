package src.main.java.model.implementation;


import src.main.java.model.IGeneralModel;
//@Entity
public class SystemControl implements IGeneralModel {
    private Integer id;
    private int quantityControlProcessings;


    //public SystemControl() {
    //}

    public SystemControl(Integer id, int quantityControlProcessings) {
        this.id = id;
        this.quantityControlProcessings = quantityControlProcessings;

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

    public int getQuantityControlProcessings() {
        //@Basic
        //@Column(resolution = "quantityControlProcessings")
        //public int getQuantityControlProcessings() {

        return quantityControlProcessings;
    }

    public void setQuantityControlProcessings(int quantityControlProcessings) {
        //public void setQuantityControlProcessings(int quantityControlProcessings) {
        this.quantityControlProcessings = quantityControlProcessings;
    }

    /*
    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemControl systemControl = (SystemControl) o;
        return Objects.equals(id, systemControl.id) &&
                Objects.equals(quantityControlProcessings, systemControl.quantityControlProcessings);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rangeSensor, resolution);
    }

     */





    @Override
    public String toString() {
        return "SystemControl{" +
                "id=" + id +
                ", quantityControlProcessings='" + quantityControlProcessings +
                '}';
    }
}

 /*
    public String toString() {

        return "SystemControl{" +
                "id=" + id +
                ", quantityControlProcessings='" + quantityControlProcessings + '\'' +

                '}';
        */


