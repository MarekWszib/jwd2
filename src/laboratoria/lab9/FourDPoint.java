package laboratoria.lab9;

import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int t;

    public static FourDPoint create(int x, int y, int z, int t) {
        FourDPoint fourDPoint = new FourDPoint();
        fourDPoint.x = x;
        fourDPoint.y = y;
        fourDPoint.z = z;
        fourDPoint.t = t;
        return fourDPoint;
    }

    public void show() {
        System.out.println("[x=" + this.x + ",y=" + this.y + ",z=" + this.z + ",t=" + this.t + "]");
    }

}
