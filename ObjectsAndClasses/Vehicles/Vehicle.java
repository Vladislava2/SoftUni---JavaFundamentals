package ObjectsAndClasses.Vehicles;

public class Vehicle {

    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsepowerOfVehicle;


    public Vehicle(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }


    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public String getColorOfVehicle() {
        return colorOfVehicle;
    }

    public int getHorsepowerOfVehicle() {
        return horsepowerOfVehicle;
    }

    public String toString (){
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", typeOfVehicle, modelOfVehicle, colorOfVehicle, horsepowerOfVehicle);
    }
}
