package kolokwia.kolokwium3;

public class SegmentTester {
    public static void main(String[] args) {
        Segment segmentA = new Segment(1, 2, 3, 4);
        Segment segmentB = new Segment(1, 2, 3, 4);
        boolean result = segmentA.equals(segmentB);
        System.out.println(result);
    }
}
