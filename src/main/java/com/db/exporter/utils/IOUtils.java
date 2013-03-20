package com.db.exporter.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Utility class: Provides methods for disk IO.
 * 
 */
public class IOUtils {
	
	public static Writer getWriter(File file, int bufferSize) throws IOException {
		if (!file.exists()) {
			file.createNewFile();
		}
		return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"), bufferSize);
	}
}
