package hello;

import org.springframework.boot.jackson.JsonComponent;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tony on 17/11/2016.
 */
public class Valencia {

    Set<FastestLap> laps = new HashSet<>();

    public Valencia() {
        this.laps.add(new FastestLap("Marc Marquez", 90));
    }

    public Set<FastestLap> getLaps() {
        return laps;
    }
}

class FastestLap{
    String rider;
    int time;

    public FastestLap(String s, int i) {
        this.rider = s;
        this.time = i;
    }

    public String getRider() {
        return rider;
    }

    public int getTime() {
        return time;
    }
}