public class Athelete
{
private int id;
private int bib;
private String fullName;
private String gender, club;
private int yearOfBirth;
private float run1, run2;



    public Athelete(int bib, String fullName,  String gender, String club, int yearOfBirth, float run1, float run2) {
        setBib(bib);
        setFirstName(fullName);
        setGender(gender);
        setClub(club);
        setYearOfBirth(yearOfBirth);
        setRun1(run1);
        setRun2(run2); }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id >0)
        this.id = id;
        else
            throw new IllegalArgumentException("Id needs to be greater than 0");
    }

    public int getBib() {
        return bib;
    }

    public void setBib(int bib) {
        this.bib = bib;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("[A-Z][a-zA-Z]*[-]?[A-z]*?"))
            this.fullName = firstName;
        else
            throw new IllegalArgumentException("First name must start with a capital and have more than 1 letter");
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.equals("male")|| gender.equals("female"))
        this.gender = gender;
        else
            throw new IllegalArgumentException(" Gender can be male or female");
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        if(!club.isBlank())
        this.club = club;

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth == 2004 || yearOfBirth == 2005)
        this.yearOfBirth = yearOfBirth;
        else
            throw new IllegalArgumentException("Year of birth can either be 2004 or 2005");
    }

    public float getRun1() {
        return run1;
    }

    public void setRun1(float run1) {
        if(run1>=40)
        this.run1 = run1;
        else throw new  IllegalArgumentException("Run duration should be equal to or greater than 40");
    }

    public float getRun2() {
        return run2;
    }

    public void setRun2(float run2) {
        if(run2>=40)
            this.run2 = run2;
        else throw new  IllegalArgumentException("Run duration should be equal to or greater than 40");
    }

    public float getFastestRun(){
        if(run1>run2)
            return run1;

        else return run2;
    }
    public double getCombinedTime(){
        return run1+run2;
}
        public String getCombinedTimeString(){
        return(String.format("%.2f",run1+run2));
        }


}
