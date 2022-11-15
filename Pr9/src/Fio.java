public class Fio{
    private String name;
    private String surname;
    private String dadName;

    public Fio(String name, String surname, String dadName) {
        this.name = name;
        this.surname = surname;
        this.dadName = dadName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDadName() {
        return dadName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDadName(String dadName) {
        this.dadName = dadName;
    }

    @Override
    public String toString() {
        return "Fio{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dadName='" + dadName + '\'' +
                '}';
    }


    public boolean equalsing(Fio f2) {
        if (name.equals(f2.getName()) && surname.equals(f2.getSurname()) && dadName.equals(f2.getDadName())){
            return true;
        } else {
            return false;
        }
    }

}