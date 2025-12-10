package enemies;

import static helpz.Constants.Enemies.Slime;

import managers.EnemyManager;

public class Slime extends Enemy {

    public Slime(float x, float y, int ID, EnemyManager em) {
        super(x, y, ID, Slime,em);
    }

}
