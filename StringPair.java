

import java.util.*;

public class StringPair {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            int D = 0;

            // Step 1: Read input and calculate D
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                String word = numberToWord(arr[i]);

                for (int j = 0; j < word.length(); j++) {
                    char ch = Character.toLowerCase(word.charAt(j));

                    if (ch == 'a' || ch == 'e' || ch == 'i'
                            || ch == 'o' || ch == 'u') {
                        D++;
                    }
                }
            }

            // Step 2: Count pairs whose sum equals D
            int count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == D) {
                        count++;
                    }
                }
            }

            // Step 3: Print the count in words
            System.out.println(countToWord(count));

            sc.close();
        }

        // Convert a single digit into its English word
        static String numberToWord(int num) {
            String[] words = {
                    "zero", "one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine"
            };

            return words[num];
        }

        // Convert the pair count into a word
        static String countToWord(int count) {
            String[] words = {
                    "zero", "one", "two", "three", "four",
                    "five", "six", "seven", "eight", "nine",
                    "ten", "eleven", "twelve", "thirteen",
                    "fourteen", "fifteen", "sixteen",
                    "seventeen", "eighteen", "nineteen", "twenty"
            };

            if (count >= 0 && count < words.length) {
                return words[count];
            }

            return String.valueOf(count);
        }
    }

