public class Leet387 {
    public int firstUniqChar(String s) {
        for ( int i = 0; i < s.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return i;
            }
        }
        return -1;
    }

}


// How It Works

// You loop through each character i in the string.

// For each i, you loop again (j) to see if that same character appears anywhere else.

// If it appears more than once → mark it as not unique.

// If it stays unique → return its index immediately.

// If no unique character exists → return -1.