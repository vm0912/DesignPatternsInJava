package StructuralDesignPatterns.Decorator;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Considering the fact the default String class is marked as final, so we cannot
 * use inheritance to extend it, the suggested approach is to create a decorator.
 * In the following decorator class, the String is aggregated, and the core functionality
 * was simply delegated from the original String class.
 * The extended behaviour of the String is implemented in the following code in newly created methods.
 * @author Vitomir M
 */
public class StringDecorator {

    private String decoratedString;

    public StringDecorator(String decoratedString) {
        this.decoratedString = decoratedString;
    }

    //newly implemented method for capitalization of the first letter in each word
    public String capitalizeEveryFirstLetter(){
        return this.decoratedString =Arrays.stream(decoratedString.split(" "))
                .map(word -> (word.length()>1)
                        ? (word.substring(0,1).toUpperCase().concat(word.substring(1))).concat(" ")
                        : (word.substring(0,1).toUpperCase()).concat(" "))
                .collect(Collectors.joining()).strip() ;
    }

    @Override
    public String toString() {
        return
                this.decoratedString;
    }

    public int length() {
        return decoratedString.length();
    }

    public boolean isEmpty() {
        return decoratedString.isEmpty();
    }

    public char charAt(int index) {
        return decoratedString.charAt(index);
    }

    public int codePointAt(int index) {
        return decoratedString.codePointAt(index);
    }

    public int codePointBefore(int index) {
        return decoratedString.codePointBefore(index);
    }

    public int codePointCount(int beginIndex, int endIndex) {
        return decoratedString.codePointCount(beginIndex, endIndex);
    }

    public int offsetByCodePoints(int index, int codePointOffset) {
        return decoratedString.offsetByCodePoints(index, codePointOffset);
    }

    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
        decoratedString.getChars(srcBegin, srcEnd, dst, dstBegin);
    }

    @Deprecated(since = "1.1")
    public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
        decoratedString.getBytes(srcBegin, srcEnd, dst, dstBegin);
    }

    public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
        return decoratedString.getBytes(charsetName);
    }

    public byte[] getBytes(Charset charset) {
        return decoratedString.getBytes(charset);
    }

    public byte[] getBytes() {
        return decoratedString.getBytes();
    }

    public boolean contentEquals(StringBuffer sb) {
        return decoratedString.contentEquals(sb);
    }

    public boolean contentEquals(CharSequence cs) {
        return decoratedString.contentEquals(cs);
    }

    public boolean equalsIgnoreCase(String anotherString) {
        return decoratedString.equalsIgnoreCase(anotherString);
    }

    public int compareTo(String anotherString) {
        return decoratedString.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String str) {
        return decoratedString.compareToIgnoreCase(str);
    }

    public boolean regionMatches(int toffset, String other, int ooffset, int len) {
        return decoratedString.regionMatches(toffset, other, ooffset, len);
    }

    public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
        return decoratedString.regionMatches(ignoreCase, toffset, other, ooffset, len);
    }

    public boolean startsWith(String prefix, int toffset) {
        return decoratedString.startsWith(prefix, toffset);
    }

    public boolean startsWith(String prefix) {
        return decoratedString.startsWith(prefix);
    }

    public boolean endsWith(String suffix) {
        return decoratedString.endsWith(suffix);
    }

    public int indexOf(int ch) {
        return decoratedString.indexOf(ch);
    }

    public int indexOf(int ch, int fromIndex) {
        return decoratedString.indexOf(ch, fromIndex);
    }

    public int lastIndexOf(int ch) {
        return decoratedString.lastIndexOf(ch);
    }

    public int lastIndexOf(int ch, int fromIndex) {
        return decoratedString.lastIndexOf(ch, fromIndex);
    }

    public int indexOf(String str) {
        return decoratedString.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return decoratedString.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return decoratedString.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return decoratedString.lastIndexOf(str, fromIndex);
    }

    public String substring(int beginIndex) {
        return decoratedString.substring(beginIndex);
    }

    public String substring(int beginIndex, int endIndex) {
        return decoratedString.substring(beginIndex, endIndex);
    }

    public CharSequence subSequence(int beginIndex, int endIndex) {
        return decoratedString.subSequence(beginIndex, endIndex);
    }

    public String concat(String str) {
        return decoratedString.concat(str);
    }

    public String replace(char oldChar, char newChar) {
        return decoratedString.replace(oldChar, newChar);
    }

    public boolean matches(String regex) {
        return decoratedString.matches(regex);
    }

    public boolean contains(CharSequence s) {
        return decoratedString.contains(s);
    }

    public String replaceFirst(String regex, String replacement) {
        return decoratedString.replaceFirst(regex, replacement);
    }

    public String replaceAll(String regex, String replacement) {
        return decoratedString.replaceAll(regex, replacement);
    }

    public String replace(CharSequence target, CharSequence replacement) {
        return decoratedString.replace(target, replacement);
    }

    public String[] split(String regex, int limit) {
        return decoratedString.split(regex, limit);
    }

    public String[] split(String regex) {
        return decoratedString.split(regex);
    }

    public static String join(CharSequence delimiter, CharSequence... elements) {
        return String.join(delimiter, elements);
    }

    public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
        return String.join(delimiter, elements);
    }

    public String toLowerCase(Locale locale) {
        return decoratedString.toLowerCase(locale);
    }

    public String toLowerCase() {
        return decoratedString.toLowerCase();
    }

    public String toUpperCase(Locale locale) {
        return decoratedString.toUpperCase(locale);
    }

    public String toUpperCase() {
        return decoratedString.toUpperCase();
    }

    public String trim() {
        return decoratedString.trim();
    }

    public String strip() {
        return decoratedString.strip();
    }

    public String stripLeading() {
        return decoratedString.stripLeading();
    }

    public String stripTrailing() {
        return decoratedString.stripTrailing();
    }

    public boolean isBlank() {
        return decoratedString.isBlank();
    }

    public Stream<String> lines() {
        return decoratedString.lines();
    }

    public IntStream chars() {
        return decoratedString.chars();
    }

    public IntStream codePoints() {
        return decoratedString.codePoints();
    }

    public char[] toCharArray() {
        return decoratedString.toCharArray();
    }

    public static String format(String format, Object... args) {
        return String.format(format, args);
    }

    public static String format(Locale l, String format, Object... args) {
        return String.format(l, format, args);
    }

    public static String valueOf(Object obj) {
        return String.valueOf(obj);
    }

    public static String valueOf(char[] data) {
        return String.valueOf(data);
    }

    public static String valueOf(char[] data, int offset, int count) {
        return String.valueOf(data, offset, count);
    }

    public static String copyValueOf(char[] data, int offset, int count) {
        return String.copyValueOf(data, offset, count);
    }

    public static String copyValueOf(char[] data) {
        return String.copyValueOf(data);
    }

    public static String valueOf(boolean b) {
        return String.valueOf(b);
    }

    public static String valueOf(char c) {
        return String.valueOf(c);
    }

    public static String valueOf(int i) {
        return String.valueOf(i);
    }

    public static String valueOf(long l) {
        return String.valueOf(l);
    }

    public static String valueOf(float f) {
        return String.valueOf(f);
    }

    public static String valueOf(double d) {
        return String.valueOf(d);
    }

    public String intern() {
        return decoratedString.intern();
    }

    public String repeat(int count) {
        return decoratedString.repeat(count);
    }

    public static int compare(CharSequence cs1, CharSequence cs2) {
        return CharSequence.compare(cs1, cs2);
    }


}
