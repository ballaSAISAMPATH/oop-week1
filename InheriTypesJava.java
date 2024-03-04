class Mother {
    int code = 2233;
}

class Son1 extends Mother {
    String bike = "BMW X-R";
}

class Son2 extends Mother {
}

class Grandson extends Son1 {}
class InheriTypesJava{
    public static void main(String[] args) {
        Son1 sam = new Son1();
        Mother mom = new Mother();
        Son2 sai = new Son2();
        Grandson xyz = new Grandson();

        System.out.println("SIMPLE INHERITANCE:-\n");
        System.out.println(sam.code);

        System.out.println("MULTILEVEL INHERITANCE:-\n");
        System.out.println(sam.code);
        System.out.println(xyz.bike);

        System.out.println("HIERARCHICAL INHERITANCE:-\n");
        System.out.println(sam.code);
        System.out.println(sai.code);
    }
}