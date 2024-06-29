import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    LocalDate dob;
    LocalDate dod;
    Gender gender;
    Human father;
    Human mother;
    List<Human> children;

    public Human(String name, LocalDate dob, Gender gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void addChild(Human child) {
        this.children.add(child);
    }

    public List<Human> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ", " + dob + ")";
    }
}