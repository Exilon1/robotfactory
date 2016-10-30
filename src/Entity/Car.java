package Entity;

/**
 * Created by дима on 30.10.2016.
 */
public class Car {
    private String carMark;
    private Driver carDriver;
    private String carNumber;
    private boolean isHaveBabySeat;
    private boolean isSmokeCar;
    private int carClass;
    private String carStatus;
    public static final int TYPE_OF_CLASS_ECONOMIC = 0;
    public static final int TYPE_OF_CLASS_BUSYNESS = 1;
    public static final String TYPE_OF_STATUS_FREE = "Свободен";
    public static final String TYPE_OF_STATUS_RESERVED = "Занят";

}
