public class PetClient {
    public static void main(String[] args) {
        System.out.println("Pet Test:");
        Pet p1 = new Pet("Luna", 3);
        System.out.println(p1.getName()); // Luna
        System.out.println(p1.getAge()); // 3
        System.out.println(p1); // Name: Luna, Age: 3
        p1.makeNoise(); // Growl!

        System.out.println();
        System.out.println("Dog Test:");
        Dog d1 = new Dog("Doggy", 5, "husky");
        System.out.println(d1.getName()); // Doggy
        System.out.println(d1.getAge()); // 5
        System.out.println(d1); // Doggy 5 husky
        p1.makeNoise(); // Bark!


    }
}
