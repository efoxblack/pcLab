public class Monitor {

    private Resolution resolution;
    private String model;
    private String manufacturer;

    public Monitor(Resolution resolution, String model, String manufacturer) {
        this.resolution = resolution;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    private Resolution getResolution(){
        return resolution;
    }

    private String getModel(){
        return model;
    }

    private String getManufacturer(){
        return manufacturer;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution=" + resolution +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
