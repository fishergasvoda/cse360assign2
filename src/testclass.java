public class testclass {
    public static void main(String args[]){
        AddingMachine testMachine = new AddingMachine();
        System.out.println(testMachine.getTotal());
        testMachine.add(41);
        testMachine.add(93);
        testMachine.subtract(205);
        System.out.println(testMachine.getTotal());
        System.out.println(testMachine.toString());
    }
}
