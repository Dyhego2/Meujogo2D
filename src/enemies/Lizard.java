package enemies;

import static helpz.Constants.Enemies.Lizard;

import managers.EnemyManager;

public class Lizard extends Enemy {

    public Lizard(float x, float y, int ID, EnemyManager em) {
        super(x, y, ID, Lizard, em);
    }

}
