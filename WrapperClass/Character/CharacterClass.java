import java.util.Scanner;

public class CharacterClass {

    public static void main(String[] args) {


    }
}


/**
 * charCount(int codePoint) 	                    -   Determines the number of char values which are required to represent the given character.
 * charValue()	                                    -   Returns the value of the given Character object.
 * codePointAt(char[]a, int index)	                -   Returns the codePoint for the specified index of the given array.
 * codePointAt(char[]a, int index, int limit )	    -   Returns the codePoint of the char array at the specified index where only the elements of the array with the index less than the specified limit being used.
 * codePointAt(CharSequence seq, int index)	        -   Returns the codePoint at the specified index for the given CharSequence.
 * codePointBefore(char[]a, int index)	            -   Returns the codePoint for the given array in the preceding index.
 * codePointBefore(char[]a, int index, int start)	-   Returns the codePoint for the given array in the preceding index where only the elements of the array with index greater than or equal to start are used.
 * codePointBefore(CharSequence, int index)	        -   Returns the CodePoint for the given CharSequence int the preceding index.
 * codePointCount(char[]a, int offset, int count)	-   Returns the total number of Unicode codePoints in the given subarray of the char array argument.
 * codePointCount(CharSequence seq,
 * int beginIndex, int endIndex)	                -   Returns the number of Unicode codePoints provided in the given text range for the specified char sequence.
 * codePointOf(String name)	                        -   Returns the value of the codePoint for the given Unicode character specified by a particular character name.
 * compare(char x, char y)	                        -   Compares two character type values numerically.
 * compareTo(Character anotherCharacter)	        -   Compares two Character type objects numerically.
 * digit(char ch, int radix)	                    -   Returns the numeric value for the given character in the specified index.
 * digit(int codePoint, int radix)	                -   Returns the numeric value for the given character in the specified radix.
 * equals(object obj)	                            -   Compares the given object with the specified object.
 * forDigit(int digit, int radix)	                -   Determines the presentation of the character for a particular digit in the given radix.
 * getDirectionality(char ch)	                    -   Returns the Unicode directionality property for the specified character.
 * getDirectionality(int codePoint)	                -   Returns the Unicode directionality property for the specified codePoint.
 * getName(int codePoint)	                        -   Returns the Unicode name for the given codePoint or may return null if the codePoint is not assigned.
 * getNumericValue(char ch)	                        -   Returns the integer type value of the specified Unicode character.
 * getNumericValue(int codePoint)	                -   Returns the integer type value of the specified Unicode codePoint.
 * getType(char ch)	                                -   Returns the value which indicates the general category of the character.
 * getType(int codePoint)	                        -   Returns the value which indicates the general category of the character.
 * hashcode()	                                    -   Returns the hash code for the specified character. This method is equal to the result of invoking the charValue() method.
 * hashcode(char value)	                            -   Returns the hash code for a particular char value.
 * highSurrogate(int codePoint)	                    -   Returns the leading surrogate codePoint of a particular surrogate pair which represents the supplementary character in the UTF-16 encoding.
 * isAlphabetic(int codePoint)	                    -   Determines whether the given character is an alphabet or not.
 * isBmpCodePoint(int codePoint)	                -   Determines whether the given character is in the Basic Multilingual Plane or not.
 * isDefined(char ch)	                            -   Determines whether the character is defined in the Unicode or not.
 * isDefined(int codePoint)	                        -   Determines whether the character(Unicode code point) is defined in the Unicode or not.
 * isDigit(char ch)	                                -   Determines whether the given character is a digit or not.
 * isDigit(int codePoint)	                        -   Determines whether the given character(Unicode code point) is a digit or not.
 * isHighSurrogate(char ch)	                        -   Determines whether the given char values is a Unicode high-surrogate code point or not.
 * isIndentifierIgnorable(char ch)	                -   Determines whether the given character is considered to be an ignorable character in the Java identifier or not.
 * isIndentifierIgnorable(int codePoint)	        -   Determines whether the given character(Unicode codePoint) is considered to be an ignorable character in the Java identifier or not.
 * isIdeographic(int codePoint)	                    -   Determines whether the specified character is a CJKV(Chinese, Japanese, Korean and Vietnamese) ideograph or not.
 * isISOControl(char ch)	                        -   Determines whether the given character is an ISO Control character or not.
 * isISOControl(int codePoint)	                    -   Determines whether the given character(Unicode code point) is an ISO Control character or not.
 * isJavaIdentifierPart(char ch)	                -   Determines whether the given character is a part of the Java identifier other than the first character or not.
 * isJavaIdentifierPart(int codePoint)	            -   Determines whether the given character(Unicode code point) is a part of the Java identifier other than the first character or not.
 * isJavaIdentifierStart(char ch)	                -   Determines whether the given character is permissible as the first character in the Java identifier or not.
 * isJavaIdentifierStart(int codePoint)	            -   Determines whether the given character(Unicode code point is permissible as the first character in the Java identifier or not.
 * isJavaLetter(char ch)	                        -   Replaced by the isJavaIdentifierStart(char).
 * isJavaLetterOrDigit(int codePoint)	            -   Replaced by the isJavaIdentifierPart(char).
 * isLetter(char ch)	                            -   Determines whether the specified character is a letter or not.
 * isLetter(int codePoint)	                        -   Determines whether the specified character(Unicode code point) is a letter or not.
 * isLetterOrDigit(char ch)	                        -   Determines whether the specified character is a letter or digit or not.
 * isLetterOrDigit(int codePoint)	                -   Determines whether the specified character(Unicode code point) is a letter or digit or not.
 * isLowerCase(char ch)	                            -   Determines whether the specified character is a lowercase character or not.
 * isLowerCase(int codePoint)	                    -   Determines whether the specifed character(Unicode code point) is a lowercase character or not.
 * isLowSurrogate(char ch)	                        -   Determines whether the given char value is a Unicode low-surrogate code unit or not.
 * isMirrored(char ch)	                            -   Determines whether the character is mirrored or not.
 * isMirrored(int codePoint)	                    -   Determines whether the character(Unicode code point) is mirrored or not.
 * isSpace(char ch)	                                -   Replaced by isWhiteSpace(char ch) method.
 * isSpaceChar(char ch)	                            -   Determines whether the specified character is a Unicode space character or not.
 * isSupplementaryCodePoint(int codePoint)	        -   Determines whether the given character(Unicode code point) is in the range of supplementary characters or not.
 * isSurrogate(char ch)	                            -   Determines whether the given char value is a Unicode surrogate code unit.
 * isSurrogatePair(char high, char low)	            -   Determines whether the given pair of char value is a valid Unicode surrogate pair or not.
 * isTitleCase(char ch)	                            -   Determines whether the given character is a titlecase character or not.
 * isTitleCase(int codePoint)	                    -   Determines whether the given character(Unicode code point) is a titlecase character or not.
 * isUnicodeIdentifierPart(char ch)	                -   Determines whether the given character is a part of Unicode identifier or not.
 * isUnicodeIdentifierPart(int codePoint)	        -   Determines whether the given character(unicofde code point) is a part of Unicode identifier or not.
 * isUnicodeIdentifierStart(char ch)	            -   Determines whether the given character is permissible as the first character in the Unicode identifier or not.
 * isUnicodeIdentifierStart(int codePoint)	        -   Determines whether the given character(Unicode code point) is permissible as the first character in the Unicode identifier or not.
 * isUpperCase(char ch)	                            -   Determines whether the given character is an uppercase character or not.
 * isUpperCase(int codePoint)	                    -   Determines whether the given character(Unicode code point) is an uppercase character or not.
 * isValidCodePoint(int codePoint)	                -   Determines whether the given character is a valid Unicode code point value or not.
 * isWhitespace(char ch)	                        -   Determines whether the given character is a white space or not.
 * isWhitespace(int codePoint)	                    -   Determines whether the given character(Unicode code point)is a white space or not .
 * lowSurrogate(int codePoint)	                    -   Returns the low surrogate code unit(i.e trailing surrogate)of the surrogate pair which represents the supplementary character in the UTF-16 encoding.
 * offsetByCodePoints(char[]a, int start,
 * int count, int index, int codePointOffset)       -   Returns the index for the given char subarray which is the offset from the given index by the codePointOffset code points.
 * offsetByCodePoints(CharSequence seq,
 * int index, int codePointOffset)	                -   Returns the index for the given char subarray which is the offset from the given index by the codePointOffset code points.
 * reverseBytes(char ch)	                        -   Returns the value obtained by reversing the order of the given bytes in the specified char values.
 * toChars(int codePoint)	                        -   Converts the specified character(Unicode code point) into its UTF-16 representation which is stored in a char array.
 * toChars(int codePoint, char[] dst, int dstIndex)	-   Converts the specified character(Unicode code point) into its UTF-16 representation.
 * toCodePoint(char high, char low)	                -   Converts the given surrogate pair to its corresponding supplementary code point value.
 * toLowerCase(char ch)	                            -   Converts the character type argument to lowercase using case mapping information obtained from the Unicode Data file.
 * toLowerCase(int codePoint)	                    -   Converts the character type argument(Unicode code point) to lowercase using case mapping information obtained from the Unicode Data file.
 * toString()	                                    -   Returns a String type object which represents the value of the character.
 * toString(char ch)	                            -   Returns a String type object which represents the specified character
 * toTitleCase(char ch)	                            -   Converts the character type argument to titlecase using case mapping information obtained from the Unicode Data file.
 * toTitleCase(int codePoint)	                    -   Converts the character type argument(Unicode code point) to lowercase using case mapping information obtained from the Unicode Data file.
 * toUpperCase(char ch)	                            -   Converts the character type argument to uppercase using case mapping information obtained from the Unicode Data file.
 * toUpperCase(int codePoint)	                    -   Converts the character type argument(Unicode code point) to uppercase using case mapping information obtained from the Unicode Data file.
 * valueOf(char c)	                                -   Returns the instance of a Character which represents the specified character value.
 */
