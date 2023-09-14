package Proj4;

public enum Season {
    Весна("Весна", "Холодное время года", 15),
    Лето("Лето", "Теплое время года", 25),
    Осень("Осень", "Холодное время года", 10),
    Зима("Зима", "Холодное время года", 0);

    private final String naming;
    private final String description;
    private final int temp;

    Season(String naming, String description, int temp) {
        this.naming = naming;
        this.description = description;
        this.temp = temp;
    }

    public String getName() {
        return naming;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return description;
    }
}
