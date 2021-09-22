package HomeWork1.Animal;

import java.util.Random;

public class Team {

    private String nameTeam;
    Animal[] zoo = {new Cat("Boris"), new Dog("Sharik"), new Cow("Alenka")};
    public Animal[] teamAnimal = new Animal[4];
    Random random = new Random();
    // Формируем команду
    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int ran = random.nextInt(3);
            teamAnimal[i] = zoo[ran];
        }
    }
    // Вывод информации о членах команды
    public void printTeamInfo() {
        System.out.println("Team: " + nameTeam);
        for(Animal a : teamAnimal) {
            System.out.println(a);
            System.out.println("Run limit: " + a.run_limit);
            if (a instanceof Swim)
                System.out.println("Swim limit: " + ((Swim) a).getSwimLimit());
            if (a instanceof Jump)
                System.out.println("Jump limit: " + ((Jump) a).getJumpLimit());
        }
        System.out.println();
    }
    // Вывод информации кто прошел дистанцию
    public void passedTheDistance(){
        System.out.println(nameTeam + "\n");
        for (Animal a : teamAnimal){
            if(a.passing){
                System.out.println(a + " successfully passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }
        System.out.println();
    }
}
