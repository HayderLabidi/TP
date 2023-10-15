public class Personne {
     String Name;
     String firstName;
     int dayNaiss;
     int monthNaiss;
     int yearNaiss;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateNaiss(int dayNaiss, int monthNaiss, int yearNaiss) {
        this.dayNaiss = dayNaiss;
        this.monthNaiss = monthNaiss;
        this.yearNaiss = yearNaiss;
    }

    public int ageEn2023() {
        int ThisYear = 2023;
        int age = ThisYear - yearNaiss;
            age--;
        return age;
    }

}

