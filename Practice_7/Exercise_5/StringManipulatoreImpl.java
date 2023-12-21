package Practice_7.Exercise_5;

class StringManipulatorImpl implements StringManipulator {
    public int countCharacters(String s) {
        return s.length();
    }
    public String getOddCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i%2==0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
    public String reverseString(String s) {
        StringBuilder result = new StringBuilder(s);
        return result.reverse().toString();
    }
}
