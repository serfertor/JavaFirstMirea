public class Client {
    private String inn;
    private Fio fio;

    public Client (String inn,String name, String surname, String dadName){
        this.inn = inn;
        this.fio = new Fio(name, surname, dadName);
    }

    public String getInn() {
        return inn;
    }

    public Fio getFio() {
        return fio;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public void setFio(Fio fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Client{" +
                "inn='" + inn + '\'' +
                ", fio=" + fio +
                '}';
    }

}

