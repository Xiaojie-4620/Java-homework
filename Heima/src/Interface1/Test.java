package Interface1;

public class Test {
    public static void main(String[] args) {
        Interimpl si = new Interimpl();
        String name = Thread.currentThread().getStackTrace()[1].getClassName();
        System.out.println(name);
    }
}
