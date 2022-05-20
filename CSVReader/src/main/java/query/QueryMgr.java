package query;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;

public class QueryMgr {
	private Map<String, Query> cache = null;
	private static QueryMgr queryMgr = new QueryMgr();

	private QueryMgr() {
		init();
	}

	public static QueryMgr getInstance() {
		return queryMgr;
	}

	public void init() {
		if (null == cache) {
			cache = new HashMap<>();
			// load data
			try {
				Set<String> files = FileUtils.listFileNames("sql");
				for (String f : files) {
					Gson gson = new Gson();
					QueryWrapper q = gson.fromJson(new FileReader(f), QueryWrapper.class);
					cache.put(q.getName(), q.getQuery());
				}
			} catch (IOException e) {
				// Logger.error(this, e, e.getMessage());
			}
		}
	}

	public void execute(String name, Object... args) {

	}
}
