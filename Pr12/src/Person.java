public class Person {
    private String surname;
    private String name;
    private String dadname;

    public Person(String s, String n, String d){
        this.dadname=d;
        this.name=n;
        this.surname=s;
    }

    public Person(String surname) {
        this.surname = surname;
        this.dadname = "";
        this.name = "";
    }

    public StringBuilder getFIO (){
        StringBuilder answer = new StringBuilder(surname);
        if (name.isEmpty() && dadname.isEmpty()){
            return answer;
        } else {
            return answer.append(" ").append(name.charAt(0)).append(". ").append(dadname.charAt(0)).append(".");
        }
    }
}
