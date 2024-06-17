import java.util.HashMap;

/**
 * commonCharacter
 */
public class uniqueArrayElements {

    public static void main(String[] args) {
        int a[]={0,0,1,1,1,2,2,4,4};
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();//O[n]
        for(int i=0;i<n;i++){//O[n]
            map.put(a[i], 0);
        }
        System.out.println(map.size());
    }
}