package Introduction;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        int i = 10;
        Integer iObj = i;

        System.out.println("i: " + i);
        System.out.println("iObj: " + iObj);

        int iVar = iObj;
        System.out.println("iVar: " + iVar);
    }
}
