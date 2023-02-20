// добавила класс
import java.util.StringJoiner;

public class confetionery extends Product {
    //private Date expireDate = new Date();
    private String name;
    private String amountOfCarbohydrates;
    private String amountOfProtein;

    public confetionery(String name, String amountOfCarbohydrates, String amountOfProtein) {

        this.name = name;
        this.amountOfCarbohydrates = amountOfCarbohydrates;
        this.amountOfProtein = amountOfProtein;
    }

    /*@Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" годен до %s", expireDate.toString()));
        return localString.toString();
    }
}*/


    public String toString() {
        return new StringJoiner(", ", confetionery.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("amountOfCarbohydrates='" + amountOfCarbohydrates + "'")
                .add("amountOfProtein=" + amountOfProtein)
                .toString();
    }
}

