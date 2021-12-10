package com.dreamfabric.jac64;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Describe class Loader here.
 *
 *
 * Created: Mon Oct 16 21:14:10 2006
 *
 * @author <a href="mailto:Joakim@BOTBOX"></a>
 * @version 1.0
 */
public abstract class Loader {

	public abstract InputStream getResourceStream(String rs);

	public String getResourceString(String rs) {
		InputStream inStr = getResourceStream(rs);
		int c;
		StringBuffer sb = new StringBuffer();
		try {
			while ((c = inStr.read()) != -1) {
				sb.append((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public InputStream getFileStream(String fil) {
		InputStream romFileIs = null;
		try {
			File romFile = new File(fil);
//	File kernalRomFile = new File("rom\\kernal.rom");
			boolean romFileExs = romFile.exists();
//		if (!romFileExs)
//			throw new Exception();
//	boolean kernalRomExs = kernalRomFile.exists();
			romFileIs = new FileInputStream(romFile);
			return romFileIs;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return romFileIs;
	}
}
