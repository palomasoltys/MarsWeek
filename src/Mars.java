public class Mars {
    public static void main(String[] args) throws InterruptedException {

        String colonyName = "Dragonstone";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;

        shipFood = (shipFood - (shipPopulation * 0.75)) * 2;
        System.out.println("The amount of food left after landing is " + shipFood + ".");

        shipFood = (shipFood * 0.5) + shipFood;
        shipPopulation += 5;

        String landingLocation = "The Plain";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(100);
        new GuessingGame();
        new MarsExpedition();

    }

    public static boolean landingCheck(int loops) throws InterruptedException {
        for (int i = 0; i <= loops ; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Keep Center");
            } else if(i % 5 == 0) {
                System.out.println("Right");
            } else if(i % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);

        }
        System.out.println("Landed");
        return false;
    }
}
