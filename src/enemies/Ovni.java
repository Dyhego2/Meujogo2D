package enemies;

import static helpz.Constants.Enemies.Ovni;

import managers.EnemyManager;

public class Ovni extends Enemy {

    public Ovni(float x, float y, int ID, EnemyManager em) {
        super(x, y, ID, Ovni,em);

    }

}
