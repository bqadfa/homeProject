import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum DanceType {
    BALLET, WALTZ, RAVEDANCER;


    private int dancersMaxNumber;
    private Map<GENDER, Integer> gender = new HashMap<GENDER, Integer>();

    static {
        BALLET.dancersMaxNumber = 6;
        WALTZ.dancersMaxNumber = 2;
        RAVEDANCER.dancersMaxNumber = 1;

        BALLET.gender.put(GENDER.Male, 3);
        BALLET.gender.put(GENDER.Female, 3);

        WALTZ.gender.put(GENDER.Female, 1);
        WALTZ.gender.put(GENDER.Male, 1);

        RAVEDANCER.gender.put(GENDER.Male, 1);
    }

    public int getDancersMaxNumber() {
        return dancersMaxNumber;
    }

    public void setDancersMaxNumber(int dancersMaxNumber) {
        this.dancersMaxNumber = dancersMaxNumber;
    }

    public Map<GENDER, Integer> getGender() {
        return gender;
    }

    public void setGender(Map<GENDER, Integer> gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "{} dance type";
    }
}
