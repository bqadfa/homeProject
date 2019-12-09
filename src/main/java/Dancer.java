import java.util.ArrayList;

public class Dancer {

    private String name;

    private ArrayList<DanceType> danceSkills; // = new ArrayList<DanceType>();

    private int yearOfBirth;

    private int age = 2019 - yearOfBirth;

    private GENDER gender;

    public Dancer(String name, ArrayList<DanceType> danceSkills, int yearOfBirth, GENDER gender) {
        this.name = name;
        this.danceSkills = danceSkills;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<DanceType> getDanceSkills() {
        return danceSkills;
    }

    public void setDanceSkills(ArrayList<DanceType> danceSkills) {
        this.danceSkills = danceSkills;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }
}
