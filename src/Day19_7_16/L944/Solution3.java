package Day19_7_16.L944;

class Solution3 {
    public int minDeletionSize(String[] A) {
        if (A == null) return 0;
        int count = 0;

        for (int i = 0; i < A[0].length(); i++) {
            char c = A[0].charAt(i);
            for (int i1 = 1; i1 < A.length; i1++) {
                if (c > A[i1].charAt(i)){
                    count++;
                    break;
                }
                c = A[0].charAt(i);
            }

        }

        return count;
    }

    public static void main(String[] args) {
        String[] A = {"zyx", "wvu", "tsr"};
        int a = new Solution().minDeletionSize(A);
        System.out.println(a);
    }
}
