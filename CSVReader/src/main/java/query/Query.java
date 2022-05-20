package query;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Query {
	private Set<Condition> conditions ;
	private List<Param> params;

	public Query() {
		params = new ArrayList<>();
		conditions = new TreeSet<>();
	}

	public String parse(Map<String, String> objs) throws Exception {
		StringBuilder sb = new StringBuilder();
		if (null != this.params && params.size() > 0) {
			if (this.params.size() != objs.size()) {
				throw new Exception("Can not execute query: parameters does not match.");
			}
			// insert all parameter in query
			for (Param p : params) {
				String name = p.getName();
				String value = p.getValue();
				boolean optional = p.isOptional();
			}
		}
		return sb.toString();
	}
}
