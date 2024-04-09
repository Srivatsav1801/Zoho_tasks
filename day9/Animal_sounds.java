abstract class Animal {
    abstract void cats();
	abstract void dogs();
}
class Cats extends Animal {
    void cats(){
        System.out.println("Cats meow");
    }
	void dogs(){}
}

class Dogs extends Animal {
    void dogs() {
        System.out.println("Dogs bark");
    }
	void cats(){}
}

public class Animal_sounds{
    public static void main(String[] args) {
        Cats cats_sound = new Cats();
        Dogs dogs_sound = new Dogs();

        cats_sound.cats();
		dogs_sound.dogs();
    }
}
