package pl.edu.wszib.podyplomowe;

public class PackagePresenter {

    public void showPackage(){
        System.out.println("to jest obiekt klasy" + this.getClass().getSimpleName() + " w pakiecie " + this.getClass().getPackageName());
    }

}
