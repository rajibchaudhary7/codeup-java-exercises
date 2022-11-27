public class ServerNameGenerator {
    static String getRandom(String[] array) {
        int random = (int) (Math.floor(Math.random() * (array.length - 1)));
        System.out.println(random);
        return array[random];
    }

    public static void main(String[] args) {
        String[] tenAdjectives = {"beautiful", "white", "fat", "fast", "pure", "good", "large", "soft", "tall", "hot"};
        String[] tenNouns = {"house", "car", "boy", "aeroplane", "water", "person", "lake", "bed", "building", "water"};
        System.out.println("Here is your server name: \n" + getRandom(tenAdjectives) + "-" + getRandom(tenNouns ));
    }
}
