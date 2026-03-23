public class operationOnbit {
    public static void oddOreven(int n) {
        int Bitmask = 0;
        if ((n & Bitmask) == 0) {
            System.out.println("this is the even");

        } else {
            System.out.println("the number is odd");

        }
    }
    // always jab object banana hoga to main class se banate hai

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;

        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthbit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearBit(n, i);

        } else {
            return setBit(n, i);
        }
    }

    // this will reture the ture if the condition if ture
    // if the condition is the false it will return false
    public static boolean isPowerOftwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetbit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        // operationOnbit ob = new operationOnbit();
        oddOreven(4);
        System.out.println(getIthBit(10, 2));
        System.out.println(setBit(10, 2));
        System.out.println(updateIthbit(10, 2, 1));
        System.out.println(isPowerOftwo(7));
        System.out.println(countSetbit(10));
        int r =2, s=4;
        boolean res = (r>2 && s<3);
        System.out.println(res);
    }
}
