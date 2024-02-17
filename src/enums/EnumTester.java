package enums;

import java.util.Arrays;

public class EnumTester {
    public static void main(String[] args) {
        System.out.println(Types.ONE);
        System.out.println(Types.TWO.ordinal());
        System.out.println(Types.valueOf("TWO"));
        System.out.println(Types.THREE.name());
        System.out.println(Arrays.toString(Types.values()));

        for (Types type : Types.values()) {
            System.out.println(type.ordinal() + " " + type);
        }
    }
}
