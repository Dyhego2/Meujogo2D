package enemies;

import static helpz.Constants.Enemies.Alien;

import managers.EnemyManager;

public class Alien extends Enemy {

    public Alien(float x, float y, int ID, EnemyManager em) {
        super(x, y, ID, Alien,em);

    }

}
