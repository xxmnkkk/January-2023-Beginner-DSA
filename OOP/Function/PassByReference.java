package OOP.Function;

public class PassByReference {
    String inputInstance;

    private static void print(PassByReference passByReferencePrint) {
        System.out.println("2: " + passByReferencePrint.inputInstance);

        passByReferencePrint.inputInstance = "Changed input";

        System.out.println("3: " + passByReferencePrint.inputInstance);
    }

    public static void main(String[] args) {
        PassByReference passByReferenceMain = new PassByReference();

        passByReferenceMain.inputInstance = "Initial input";

        System.out.println("1: " + passByReferenceMain.inputInstance);

        print(passByReferenceMain);

        System.out.println("4: " + passByReferenceMain.inputInstance);
    }
}
