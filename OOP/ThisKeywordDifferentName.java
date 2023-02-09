package OOP;

public class ThisKeywordDifferentName {
    int i;
    float f;

    ThisKeywordDifferentName(int a, float b) {
        this.i = a;
        this.f = b;
    }

    public static void main(String[] args) {
        ThisKeywordDifferentName thisKeywordDifferentName
                = new ThisKeywordDifferentName(1,3.14f);

        System.out.println(thisKeywordDifferentName.i);
        System.out.println(thisKeywordDifferentName.f);
    }
}
