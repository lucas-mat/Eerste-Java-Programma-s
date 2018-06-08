package bee.hive;

public class Soldier extends Bij {



        String weapon = "Bazooka";
        int hitPoints = 100;
        int attack = 10;
        int defense = 2;

        public void valAan (Soldier enemy) {

            enemy.hitPoints -= (this.attack * 1.5) - enemy.defense;
            this.hitPoints -= (enemy.attack * 0.5) - this.defense;

        }

        public boolean isDead() {
            return (hitPoints <= 0);

                }
            }







/*

    public void valAan (Soldier enemy) {

        enemy.hitPoints -= (this.attack * 1.5) - enemy.defense;
        this.hitPoints -= (enemy.attack * 0.5) - this.defense;

    }

    public boolean isDead() {
        return (hitPoints <= 0);
*/