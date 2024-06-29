import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        
        // Добавляем людей в генеалогическое древо
        familyTree.addPerson("Nikolay", LocalDate.of(1970, 4, 19), Gender.Male);
        familyTree.addPerson("Olga", LocalDate.of(1969, 1, 11), Gender.Female);
        familyTree.addPerson("Anna", LocalDate.of(2000, 3, 3), Gender.Female);
        familyTree.addPerson("Alexei", LocalDate.of(1999, 3, 6), Gender.Male);
        
        // Устанавливаем родителей для детей
        familyTree.setParents("Anna", "Olga", "Nikolay");
        familyTree.setParents("Alexei", "Olga", "Nikolay");
        
        // Получаем всех детей Olga
        List<Human> children = familyTree.getChildren("Olga");
        System.out.println("Children of Olga:");
        for (Human child : children) {
            System.out.println(child);
            
        }
    }
}