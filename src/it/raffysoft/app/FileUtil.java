package it.raffysoft.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileUtil {

	public static InputStream getFileStream(String fil) {
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
