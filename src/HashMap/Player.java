package HashMap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Player {
    private String name;
    private int number;

    public  Player (String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return " Player {" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return number == player.number &&
                name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
class Main{
    public static void main(String[] args) {
        Set<  Player > set = new HashSet< Player >();
        Player player1 = new Player("Mehmet",7);
        Player player2 = new Player("Okan",11);
        Player player3 = new Player("Ayse",9);
        Player player4 = new Player("Mehmet",7);
        set.add(player1);
        set.add(player2);
        set.add(player3);
        set.add(player4);
        for(Player p :set){
            System.out.println(p);
        }
    }
}
