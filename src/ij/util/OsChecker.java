package ij.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class OsChecker {
	private static boolean isMac, isWin, isLinux, is64Bit;
	private static String osname, osarch; // TODO not used

	static {
		osname = System.getProperty("os.name");
		isWin = osname.startsWith("Windows");
		isMac = !isWin && osname.startsWith("Mac");
		isLinux = osname.startsWith("Linux");
	}
	
	/** Returns true if this machine is a Macintosh. */
	public static boolean isMacintosh() {
		return isMac;
	}
	
	/** Returns true if this machine is a Macintosh running OS X. */
	public static boolean isMacOSX() {
		return isMacintosh();
	}

	/** Returns true if this machine is running Windows. */
	public static boolean isWindows() {
		return isWin;
	}

	/** Returns true if ImageJ is running on Linux. */
	public static boolean isLinux() {
		return isLinux;
	}

	/** Obsolete; always returns false. */
	public static boolean isVista() {
		return false;
	}
	
	/** Returns true if ImageJ is running a 64-bit version of Java. */
	public static boolean is64Bit() {
		if (osarch==null)
			osarch = System.getProperty("os.arch");
		return osarch!=null && osarch.indexOf("64")!=-1;
	}
}
