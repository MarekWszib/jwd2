package kolokwia.kolokwium3;

import java.awt.*;
import java.util.Objects;

public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(int x1, int y1, int x2, int y2) {
        this.startPoint = new Point(x1, y1);
        this.endPoint = new Point(x2, y2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segment segment = (Segment) o;
        return Objects.equals(startPoint, segment.startPoint) && Objects.equals(endPoint, segment.endPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint);
    }
}
