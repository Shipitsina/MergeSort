public class Main {

    public static void main(String [] args){
        int [] a = {5,2,4,6,1,3,2,6};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        Sort(a,1,a.length);

        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void Sort(int [] a, int p, int r){
        int q;
        if (p < r) {
            q = (p+r)/2;
            Sort(a,p,q);
            Sort(a,q+1,r);
            Merge(a,p,q,r);
        }
    }

    private static void Merge(int[] a, int p, int q, int r) {
        int left = p - 1;
        int right = q ;
        int [] m = new int[a.length];

        for (int i = p - 1; i < r; i++) {
            if ((left <= q - 1) && ((right > r - 1) || (a[left] < a[right]))){
                m[i] = a[left];
                left++;
            } else {
                m[i] = a[right];
                right++;
            }
        }
        for (int i = p-1; i < r; i++){
            a[i] = m[i];
        }
    }
}
