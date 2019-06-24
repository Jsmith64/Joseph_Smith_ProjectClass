public class TestClass {

    public static void main(String[] args) {
        Project tester = new Project();
        tester.setName("Joseph Smith");
        String name = tester.getName();
        tester.setDescription("This is a placement holder for a description.");
        System.out.println(name);
        String description = tester.getDescription();
        System.out.println(description);
        Project tester2 = new Project("name2", 20.0);
        Project tester3 = new Project("name3", "description3", 30.5);
        String pitch = tester3.elevatorPitch();
        System.out.println(pitch);
        Portfolio test = new Portfolio();
        test.add(tester2);
        test.add(tester3);
        System.out.println("" + test.getPortfolioCost());
        

    }
}
