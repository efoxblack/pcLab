public class Main {

    public static void main(String[] args) {

        Motherboard motherboard = new Motherboard("MPG Z390", "MSI", 4, 2, "Windows");
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor(resolution, "24F", "HP");
        Dimensions dimensions = new Dimensions(9, 20, 20);
        Case aCase = new Case("P600S", "Phanteks", " N/A", dimensions);


        PC pc = new PC(aCase, monitor, motherboard);

        pc.description();

        pc.powerUp();
    }
}
