package ij.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class JavaChecker {
	private static int javaVersion;
	
	static {
		String version = System.getProperty("java.version");
		if (version==null || version.length()<2)
			version = "1.8";
		if (version.startsWith("1.8"))
			javaVersion = 8;
		else if (version.charAt(0)=='1' && Character.isDigit(version.charAt(1)))
			javaVersion = 10 + (version.charAt(1) - '0');
		else if (version.charAt(0)=='2' && Character.isDigit(version.charAt(1)))
			javaVersion = 20 + (version.charAt(1) - '0');
		else if (version.startsWith("1.6"))
			javaVersion = 6;
		else if (version.startsWith("1.9")||version.startsWith("9"))
			javaVersion = 9;
		else if (version.startsWith("1.7"))
			javaVersion = 7;
		else
			javaVersion = 8;
	}
		

	/** Returns the Java version (6, 7, 8, 9, 10, etc.). */
	public static int javaVersion() {
		return javaVersion;
	}
	
	/** Always returns true. */
	public static boolean isJava2() {
		return true;
	}
	
	/** Always returns true. */
	public static boolean isJava14() {
		return true;
	}

	/** Always returns true. */
	public static boolean isJava15() {
		return true;
	}

	/** Returns true if ImageJ is running on a Java 1.6 or greater JVM. */
	public static boolean isJava16() {
		return javaVersion >= 6;
	}

	/** Returns true if ImageJ is running on a Java 1.7 or greater JVM. */
	public static boolean isJava17() {
		return javaVersion >= 7;
	}

	/** Returns true if ImageJ is running on a Java 1.8 or greater JVM. */
	public static boolean isJava18() {
		return javaVersion >= 8;
	}

	/** Returns true if ImageJ is running on a Java 1.9 or greater JVM. */
	public static boolean isJava19() {
		return javaVersion >= 9;
	}
}
