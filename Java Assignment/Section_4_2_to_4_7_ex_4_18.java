
public class Section_4_2_to_4_7_ex_4_18 {
	public static void main(String[] args)
    {
       
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        
        System.out.println();
        for(int k = 8; k > 1; k--) {
            for(int l = 1; l < k - 1; l++){
                System.out.print(l);
            }
            System.out.println();
        }

        
       
        int i = 1;
        int j = 1;
        int k = 1;
        int max = 7;

        while (i < max) {
            k = 1;
            while (k < max - i) {
                System.out.print(' ');
                ++k;
            }
            while (j > 0) {
                System.out.print(max - (max - j));
                --j;
            }
            ++i;
            j+=i;
            System.out.println("");
        }
        System.out.println("");

        
        i = 1;
        j = 1;
        k = 1;
        max = 7;
        int max2 = 8;
        int tmp = 0;

        while (i < max) {
            k = 1;
            while (k < max - (max - i)) {
                System.out.print(' ');
                ++k;
            }
            tmp = max2 - i;
            j = 1;
            while (j < tmp) {
                System.out.print(max - (max - j));
                ++j;
            }
            ++i;
            System.out.println("");
        }
    }
}

