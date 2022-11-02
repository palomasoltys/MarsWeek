import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingLists {
    public FindingLists() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back from your expedition.Time to catalog everything you found");

        ArrayList<String> rockList = new ArrayList<>();
        System.out.println("Rock data downloaded");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);
        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");
        rockList.remove(rockList.size()-1);
        System.out.println(rockList);
        System.out.println("Perfect");

        Thread.sleep(500);

        HashMap<String, String> fossilDictionary = new HashMap<>();
        System.out.println("Fossil data downloaded");

        fossilDictionary.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDictionary.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDictionary.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        for(String key : fossilDictionary.keySet()) {
            if(fossilChoice.equals(key)) {
                System.out.println("Fossil: " + key);
                System.out.println("Description: " + fossilDictionary.get(key));
            }
        }

        Thread.sleep(500);

        HashSet<String> suppliesBrought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();


        suppliesBrought.add("food");
        suppliesBrought.add("water");
        suppliesBrought.add("medicine");

        suppliesUsed.add("food");
        suppliesUsed.add("water");



        suppliesBrought.removeAll(suppliesUsed);
        System.out.println(suppliesBrought);




    }
}
