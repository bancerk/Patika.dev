package week9;

public class HeapAndStack {
    public static void main(String[] args) {
        String a ="patika"; // string literal
        String b ="patika";
        String c = new String("patika");
        String d = new String("patika");

        System.out.println(a==b); //true
        System.out.println(a==c); //false
        System.out.println(c==d); //false
        System.out.println("//---equals");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));
        System.out.println("---hashCode----");
        System.out.println("(a) = " + System.identityHashCode(a));
        System.out.println("(b) = " + System.identityHashCode(b));
        System.out.println("(c) = " + System.identityHashCode(c));
        System.out.println("(d) = " + System.identityHashCode(d));

        /// ------
        String str = "java";
        str.toUpperCase();
        System.out.println(str);

        //STringBuilder--StringBuffer
        StringBuilder sb1 = new StringBuilder("cohort");
        sb1.append(" 8");
        System.out.println(sb1);

        //StringBuffer -> thread safe
        StringBuffer sb2 = new StringBuffer("java");
        sb2.append(" 8");
        System.out.println(sb2);

    }
}
