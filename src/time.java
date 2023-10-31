//import java.util.Scanner;
//
//public class DecryptMessage {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String ciphertext = scanner.nextLine();
//        scanner.close();
//
//        System.out.println(decrypt(ciphertext));
//    }
//
//    public static String decrypt(String ciphertext) {
//        StringBuilder plaintext = new StringBuilder();
//
//        for (char c : ciphertext.toCharArray()) {
//            if (isVowel(c)) {
//                plaintext.append(c);
//            } else {
//                plaintext.append(c);
//                plaintext.append(getNearestVowel(c));
//                plaintext.append(getNextConsonant(c));
//            }
//        }
//
//        return plaintext.toString();
//    }
//
//    public static boolean isVowel(char c) {
//        return "aeiou".indexOf(c) != -1;
//    }
//
//    public static char getNearestVowel(char c) {
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        int minDistance = Integer.MAX_VALUE;
//        char nearestVowel = 'a';
//
//        for (char v : vowels) {
//            int distance = Math.abs(c - v);
//            if (distance < minDistance) {
//                minDistance = distance;
//                nearestVowel = v;
//            }
//        }
//
//        return nearestVowel;
//    }
//
//    public static char getNextConsonant(char c) {
//        if (c == 'z') {
//            return 'z';
//        }
//
//        char nextChar = (char) (c + 1);
//        while (isVowel(nextChar)) {
//            nextChar++;
//        }
//
//        return nextChar;
//    }
//}
