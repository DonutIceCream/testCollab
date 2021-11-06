public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo Guys");
        User newUser = new User();


        System.out.println(newUser.getInfo());
        System.out.println(newUser.getMerk());

        TestingFeature1 newTest = new TestingFeature1();
        newTest.setCoverange(40);

        System.out.println(newTest);

        newUser.setNama("Tobi");
        newUser.setHP("huawei");
    }
}
