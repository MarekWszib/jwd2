package lab6;

//Utwórz klasę ze zmiennymi egzemplarza height, width, depth, będącymi liczbami całkowitymi.
// Utwórz aplikację, która korzysta z nowej klasy, ustawia zmienne w obiekcie a następnie je wyświetla.
public class BlockUser {
    public static void main(String[] args) {
        Block block = new Block();
        block.height = 10;
        block.width = 11;
        block.depth = 12;

        System.out.println("Block's height: " + block.height);
        System.out.println("Block's width: " + block.width);
        System.out.println("Block's depth: " + block.depth);

    }
}