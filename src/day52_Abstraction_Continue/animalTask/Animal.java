package day52_Abstraction_Continue.animalTask;

public abstract class Animal {

    private String breed;
    private char gender;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Animal(String breed, char gender) {
        setBreed(breed);
        setGender(gender);
    }

    public abstract void sleep();

    public abstract void eat();

    public abstract void drink();

    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", gender=" + gender +
                '}';
    }
}
/*
AnimalTask:
	Interface Swimmable
			swim();

	Interface Flyable
			fly();

	Interface Wild
		hunt();

	Interface Playable
		play();


	Abstract Animal:
		eat();
		sleep();
		drink();


	Dog extends Animal implements Playable  (4 methods are inherited)

	Cat extends Animal implements Playable (4 methods are inherited)

	Cow extneds Animal  implements Playable (4 methods are inherited)

	Horse extends Animal implements Playable (4 methods are inherited))

	Lion extends Animal implments Wild (4 methods are inherited)

	Tiger extends Animal implments Wild (4 methods are inherited)

	Eagle extends Animal implments Wild, Flyable  (5 methods are inherited)

	Falcon extends Animal implments Wild, Flyable (5 methods are inherited)

	Parrot extends Animal  implements Playable, Flyable (5 methods are inherited)

	Shark extends Animal implments Wild, Swimable (5 methods are inherited)

	Dolphin extends Animal implements Playable, Wild, Swimable (6 methods are inherited)

	Duck extends Animal implements Playable, Flyable, Swimable (6 methods are inherited)

	Java extends Animal implements Playable, Flyable, Swimabl, wild


 */