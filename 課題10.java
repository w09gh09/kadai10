public class Main {
public static void main(String[] args) {
        Factory factory  = new AccountFactory();
        Product account1 = factory.create("REX");
        Product account2 = factory.create("MAX");
        Product account3 = factory.create("BOX");
        Product account4 = factory.create("FOX");

        account1.use();
        account2.use();
        account3.use();
        account4.use();     
}
}
