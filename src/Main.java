public class Main {
    public static void main(String[] args) {

        Holder<Integer> h1 = new Holder<Integer>(100);
        int i = h1.getData();
        //h1.setData("Vishal"); //compile time error
        h1.setData(1000);

        Holder<String> h2 = new Holder<String>("BitCode");
        String str = h2.getData();
        //h2.setData(1000); //compile time error
        h2.setData("Java");

        Pair<String> p1 = new Pair<String>("name", "Vishal");
        System.out.println(p1.getKey() + " " + p1.getVal());


        Pair<Integer> p2 = new Pair<Integer>("code", 9045690);
        System.out.println(p2.getKey() + " " + p2.getVal());

        PairNew<Integer, String>  pn1 = new PairNew<>(11, "Vishal");
        System.out.println(pn1.getKey() + " " + pn1.getVal());


    }
}
