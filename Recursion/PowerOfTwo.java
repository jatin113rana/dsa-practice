//https://leetcode.com/problems/power-of-two/description/?envType=problem-list-v2&envId=recursion
package Recursion;

class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        PowerOfTwo obj = new PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(16)); // true
        System.out.println(obj.isPowerOfTwo(18)); // false
        System.out.println(obj.isPowerOfTwo(1));  // true
        System.out.println(obj.isPowerOfTwo(0));  // false
    }
}
