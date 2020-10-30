public class Athelete
{
private int id;
private int bib;
private String firstName, lastName;
private String gender, club;
private int yearOfBirth;
private float run1, run2;



    public Athelete(int bib, String firstName, String lastName, String gender, String club, int yearOfBirth, float run1, float run2) {
        setBib(bib);
        setFirstName(firstName);
        setLastName(lastName);
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
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
        this.run1 = run1;
    }

    public float getRun2() {
        return run2;
    }

    public void setRun2(float run2) {
        this.run2 = run2;
    }


}
