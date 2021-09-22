package HomeWork1.Animal;

import HomeWork1.Animal.Obstacle.Course;

public class App {

    public static void main(String[] args) {
        Team team1 = new Team("1");
        team1.printTeamInfo();
        Team team2 = new Team("2");
        team2.printTeamInfo();
        Course course = new Course();
        course.printInformationAboutTheObstacle();
        course.passObstacles(team1);
        course.passObstacles(team2);
        team1.passedTheDistance();
        team2.passedTheDistance();
    }
}
