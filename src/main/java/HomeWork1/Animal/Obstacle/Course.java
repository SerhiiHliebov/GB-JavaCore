package HomeWork1.Animal.Obstacle;

import HomeWork1.Animal.Animal;
import HomeWork1.Animal.Team;

import java.util.Random;

public class Course {

    Let[] let = new Let[3];
    Random random = new Random();
    // Создаем полосу препятствий
    public Course() {
        Track track = new Track(random.nextInt(100));
        Wall wall = new Wall(random.nextFloat() * 10);
        Water water = new Water(random.nextInt(100));
        let[0] = track;
        let[1] = wall;
        let[2] = water;
    }
    //Вывод информации о полосе препятствий
    public void printInformationAboutTheObstacle() {
        System.out.println("Length track: " + ((Track) let[0]).getLength());
        System.out.println("Height wall: " + ((Wall) let[1]).getHeight());
        System.out.println("Length water: " + ((Water) let[2]).getLength());
        System.out.println();
    }
    // Проходим полосу препятствий
    public void passObstacles(Team team){
        for(Animal animal : team.teamAnimal){
            for(Let l : let){
                if(!l.doIt(animal)){
                    animal.setPassing(l.doIt(animal));
                    break;
                }
                animal.setPassing(true);
            }
        }
    }
}
