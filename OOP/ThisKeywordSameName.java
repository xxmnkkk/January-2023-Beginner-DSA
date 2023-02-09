package OOP;

public class ThisKeywordSameName {
    int i;
    float f;

    ThisKeywordSameName(int i, float f) {
        this.i = i;
        this.f = f;
    }

    public static void main(String[] args) {
        ThisKeywordSameName thisKeywordSameName
                = new ThisKeywordSameName(1,3.14f);

        System.out.println(thisKeywordSameName.i);
        System.out.println(thisKeywordSameName.f);
    }
}
