package string.problems;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here
    }
}
    String str = "ABCD";
    int n = str.length();
        System.out.println("Permutations of ABC are: ");
                Permutation permutation = new Permutation();
                permutation.permute(str, 0, n-1);

                }
private void permute(String str, int l, int r)
        {
        if (l == r)
        System.out.println(str);
        else
        {
        for (int i = l; i <= r; i++)
        {
        str = swap(str,l,i);
        permute(str, l+1, r);
        str = swap(str,l,i);
        }
        }
        }

public String swap(String a, int i, int j)
        {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
        }