package info.trebl.training.lab1.stolovka;

/**
 * Created by kibernetuk.com on 27.10.2015.
 */
public class DiningRom {

    public static void main(String[] args) {


        Strava[] strava = new Strava[6];
        strava[0] = new Strava(35, 140, "Бограч");
        strava[1] = new Strava(15, 90, "П'юре");
        strava[2] = new Strava(60, 253, "Піцца");
        strava[3] = new Strava(21, 275, "Пельмені");
        strava[4] = new Strava(80, 235, "Шашлик");
        strava[5] = new Strava(12, 95, "Борщ з м'ясом");

        for (int i = 0; i < strava.length; i++){
            System.out.println(strava[i]);
        }
    }
}
