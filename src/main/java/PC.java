public class PC {

    private Case aCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case aCase, Monitor monitor, Motherboard motherboard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private Case getaCase(){
        return aCase;
    }

    private Monitor getMonitor(){
        return monitor;
    }

    private Motherboard getMotherboard(){
        return motherboard;
    }

    private void drawLogo(){
        monitor.drawPixel(960, 540, "blue");
    }

    public void description(){
        System.out.println("Welcome to worst buy, below is the is the description of the PC on sale today." + "\n"
                + motherboard.toString() + monitor.toString() + aCase.toString());
    }

    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("PC");
    }
}
