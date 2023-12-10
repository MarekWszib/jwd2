package laboratoria.lab13;

import laboratoria.lab13.package1.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester pt1 = new PackageTester();
        laboratoria.lab13.package2.PackageTester pt2 = new laboratoria.lab13.package2.PackageTester();
        laboratoria.lab13.package3.PackageTester pt3 = new laboratoria.lab13.package3.PackageTester();

        pt1.introduce();
        pt2.introduce();
        pt3.introduce();
    }
}
