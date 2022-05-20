package query;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileUtils {
	public static Set<String> listFileNames(String dir) throws IOException {
		File allFiles = new File(dir);
		Set<String> allFileNames = new HashSet<>();
		if(allFiles.isFile())
		{
			allFileNames.add(allFiles.getAbsolutePath());
		}
		else
		{
			for (File dbinitFiles : allFiles.listFiles()) {
				if (dbinitFiles.isFile()) {
					allFileNames.add(dbinitFiles.getAbsolutePath());
				}
			}
		}
		return allFileNames;
	}
}
