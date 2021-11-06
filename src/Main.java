public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo Guys");
        User newUser = new User();

        newUser.setNama("Santuy");
        newUser.setHP("Nexian");

        System.out.println(newUser.getInfo());
        System.out.println(newUser.getMerk());

        TestingFeature1 newTest = new TestingFeature1();
        newTest.setCoverange(40);

        System.out.println(newTest);
    }
}
