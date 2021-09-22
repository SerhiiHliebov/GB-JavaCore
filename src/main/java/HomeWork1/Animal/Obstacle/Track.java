package HomeWork1.Animal.Obstacle;

import HomeWork1.Animal.Animal;

public class Track implements Let{

    private int length;

    public Track(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Animal animal) {
        return animal.run(length);
    }
    public int getLength(){
        return length;
    }
}
