import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {

            boolean destroyed = false;

            // Collision only if stack top is moving right and current moves left
            while (!st.isEmpty() && st.peek() > 0 && a < 0) {

                if (st.peek() < -a) {
                    st.pop(); // stack asteroid destroyed
                } else if (st.peek() == -a) {
                    st.pop(); // both destroyed
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // current asteroid destroyed
                    break;
                }
            }

            if (!destroyed) {
                st.push(a);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}