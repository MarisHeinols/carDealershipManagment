package Cars.parts;

public class Engine {
    private final String type;
    private final double volume;
    private final boolean trubo;

    public Engine(String type, double volume, boolean trubo) {
        this.type = type;
        this.volume = volume;
        this.trubo = trubo;
    }

    public String getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public boolean isTrubo() {
        return trubo;
    }
}
