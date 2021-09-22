package HomeWork1.Animal.Obstacle;

import HomeWork1.Animal.Animal;
import HomeWork1.Animal.Jump;

public class Wall implements Let{

    private float height;

    public Wall(float height) {
        this.height = height;
    }
    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Jump)
            return ((Jump) animal).jump(height);
        else
            return false;
    }
    public float getHeight(){
        return height;
    }
}
