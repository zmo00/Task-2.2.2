package web.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String mark;
    private String series;
    private int number;

    public Car() {
    }

    public Car(String mark, String series, int number) {
        this.mark = mark;
        this.series = series;
        this.number = number;
    }
}
