package Practice_19.Exercise_1;

public class Client {
    private String fio;
    private String inn;
    public Client (String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    public String getInn() {
        return inn;
    }
}
