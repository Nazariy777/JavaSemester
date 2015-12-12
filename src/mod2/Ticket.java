package mod2;

/**
 * Created by Admin on 12.12.2015.
 */
public class Ticket {
    private int code;
    private int  prise;

    public int getPrice() {
        return price;
    }

    public Ticket setPrice(int price){
        this.prise = price;
        return this;
    }

    private int price;
    private String nameYourTown;
    private String placeOfArrival;

    public String getPlaceOfArrival() {
        return placeOfArrival;
    }

    public Ticket addPlaceOfArrival(String placeOfArrival){
        this.placeOfArrival = placeOfArrival;
        return this;
    }

    private String time;

    public int getCode() {
        return code;
    }

    public Ticket setCode(int code) {
        this.code = code;
        return this;
    }

    public String getNameYourTown(){
        return nameYourTown;
    }

    public Ticket addNameYourTown(String nameYourTown) {
        this.nameYourTown = nameYourTown;
        return this;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Квиток" + "\n" +
                "Код: " + code + "\n" +
                "Звідки: " + nameYourTown + "\n" +
                "Куди: " + placeOfArrival + "\n" +
                "Час: " + time + "\n" +
                "Ціна: " + price;
    }

    public Ticket addTime(String time){
        this.time = time;
        return this;
    }
}
