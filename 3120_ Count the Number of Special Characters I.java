class Solution {
    public int numberOfSpecialChars(String word) {
        char[] arr = word.toCharArray();
        int specialCharacter = 0;
        boolean[] counted = new boolean[26];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] >= 'a' && arr[i] <= 'z'
                    && arr[j] == arr[i] - 32
                    && !counted[arr[i] - 'a']) {

                    specialCharacter++;
                    counted[arr[i] - 'a'] = true;
                    break;
                }
            }
        }

        return specialCharacter;
    }
}