import java.util.ArrayList;

public class Solver {

    Solver() {
        long n = 1;
        long currNum;
        ArrayList<Long> nums = new ArrayList<>();
        boolean repeatedNum = false;
        // if odd 3n-1
        // if even n/2
        // n = starting number
        while (!repeatedNum) {
            n += 1;
            nums.removeAll(nums);
            System.out.println("N: " + n);
            currNum = n;
            while (currNum != 1) {
                if (currNum > 0) {
                    if (currNum % 2 == 0) {
                        // even
                        currNum = currNum / 2;
                    } else {
                        // odd
                        currNum = (currNum * 3) + 1;
                    }
                    if (nums.contains(currNum)) {
                        repeatedNum = true;
                    } else {
                        nums.add(currNum);
                    }
                } else {
                    repeatedNum = true;
                }
                if (currNum == 1) {
                    System.out.println(currNum);
                }
            }
        }
        System.out.println("length: " + nums.size());
    }
} //174,899,139
