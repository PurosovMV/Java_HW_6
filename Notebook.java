
public class Notebook {
    String model;
    String color;
    int ramGB;
    int romGB;
    String os;

    public void getInfo() {
        System.out.println(this.model + ":\n\tЦвет: " + this.color + "\n\tОЗУ: " + this.ramGB + "\n\tОбъем ЖД: "
                + this.romGB + "\n\tОперационная система: " + this.os + "\n");
    }

    @Override
    public String toString() {
        return "Laptop [model=" + this.model + ", color=" + this.color + ", ram=" + this.ramGB + ", rom = " + this.romGB
                + ", os=" + this.os + "]";
    }

    public Notebook() {
        this.model = null;
        this.color = null;
        this.ramGB = 0;
        this.romGB = 0;
        this.os = null;
    }

    public Notebook(String model, String color, int ram, int rom, String os) {
        this.model = model;
        this.color = color;
        this.ramGB = ram;
        this.romGB = rom;
        this.os = os;
    }
}
