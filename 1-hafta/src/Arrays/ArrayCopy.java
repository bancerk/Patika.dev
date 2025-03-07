package Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] dizi1 = {2,3,5,8,1,4,1231,23,64,767};

        int[] dizi2 = new int[dizi1.length];

        System.arraycopy(dizi1,0,dizi2,0,dizi1.length);

        for (int i = 0; i < dizi2.length; i++) {

            System.out.println(dizi2[i]);

        }

    }
}
