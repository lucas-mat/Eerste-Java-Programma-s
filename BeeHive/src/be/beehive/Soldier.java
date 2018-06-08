package be.beehive;

public class Soldier {



        String weapon = "Bazooka";
        int hitpoints = 100;
        int attack = 10;
        int defense = 2;

        public void valAan (Soldier enemy) {

            enemy.hitpoints -= (this.attack * 1.5) - enemy.defense;
            this.hitpoints -= (enemy.attack * 0.5) - this.defense;

        }

        public boolean isDead() {
            return (hitpoints <= 0);

                }
            }
