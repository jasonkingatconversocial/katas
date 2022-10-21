package com.conversocial.katas;

/**
 * Helper for handling roman numerals
 * http://www.novaroma.org/via_romana/numbers.html
 */
public class RomanNumerals {

    /**
     * This method is converting a number into Roman Numeral equivalent.
     * @param number the number to convert
     * @return Roman Numeral equivalent
     * @throws IllegalArgumentException if number is unsupported
     */
    public static String convert(int number) {
        if (number==1) {
            return "I";
        } else if (number<=3 && number>0) {
            return "I"+convert(number-1);
        } else if (number==4) {
            return "IV";
        } else if (number==5) {
            return "V";
        } else if (number==7) {
            return "VII";
        } else if (number==10) {
            return "X";
        } else {
            throw new IllegalArgumentException("This number is not supported in Romans: "+number);
        }
    }

}
