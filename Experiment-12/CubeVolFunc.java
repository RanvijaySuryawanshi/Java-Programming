import java.util.function.*;

public class CubeVolumeFunction {
    public static void main(String[] args) {

        Function<Float, Float> calculateVolume = (Float side) -> {
            float volume = side * side * side;
            return volume;
        };

        System.out.println("Volume of cube is: " + calculateVolume.apply(6.5f));
    }
}