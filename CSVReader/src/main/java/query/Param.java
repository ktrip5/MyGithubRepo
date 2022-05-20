package query;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Param {
	private String name;
	private String value;
	private boolean optional;
}
