package query;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Condition {
	private int position;
	private String q;
	private List<QueryRule> rules; 
}
