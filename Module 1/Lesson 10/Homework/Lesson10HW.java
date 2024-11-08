import java.util.Arrays;
/**
        Additional HW:
        1. Find and return the most common letter in a given string.
        2. Check if 2 strings are anagrams of each other (below - elbow, end - ned, apple - ppale)
        3. Compress a string using the following rule: aaabccc = a3bc3
 */


class Lesson10HW {
    /**
     * 1. Find and return the most common letter in a given string.
     * Finds most commonly used letter in a string if there are multiple letters 
     * then the first letter alphabeticly will be returned. 
     * returns 0 if no letters are contained in string
     */
    public static char findMostPopularLetter(String word){
        int currentCount = 1; 
        int highestCount = 1;
        char currentLetter;
        char mostUsedLetter = '0';
        
        if(word.length() == 0) return '0';
           
        char[] letters = word.toLowerCase().toCharArray();
        Arrays.sort(letters);
        
        currentLetter = letters[0];

        for(int i = 1; i < letters.length; i++){
            if(Character.isLetter(letters[i]) && 
                currentLetter == letters[i]) {
                currentCount++;
            } else {
                if(currentCount > highestCount) {
                    mostUsedLetter = currentLetter;
                    highestCount = currentCount;          
                }
                currentCount = 1;
                currentLetter = letters[i];
            }
        }
        return mostUsedLetter;
    }
    
    public static void main(String[] args) {
        System.out.println(findMostPopularLetter("Abracadaba!!!!!ra"));
        System.out.println(findMostPopularLetter("Banana....ffffddaeeeeee"));
        System.out.println(findMostPopularLetter(""));
    }
}