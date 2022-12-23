package InterviewQuestion.superKeyword;

public class Dog extends Animal{ // subclass (child)

    public void animalSound() {
        super.animalSound(); // Call the superclass method
        System.out.println("The dog says: bow wow");
    }
}
