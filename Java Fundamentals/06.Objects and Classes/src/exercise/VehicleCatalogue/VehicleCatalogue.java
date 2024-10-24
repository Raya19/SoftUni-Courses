package VehicleCatalogue;

public class VehicleCatalogue {

    private String typeVehicle;
    private String model;
    private String color;
    private int horsePower;


    public VehicleCatalogue(String typeVehicle, String model, String color, int horsePower) {
        this.typeVehicle = typeVehicle;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        String typeVeh = typeVehicle.equals("car") ? "Car" : "Truck";
        return "Type: " + typeVeh + "\n" +
                "Model: " +  model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + horsePower;
    }
}
