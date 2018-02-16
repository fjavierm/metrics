package io.dropwizard.metrics5;

import java.util.HashMap;
import java.util.Map;

public abstract class MyTags {

	Map<String, String> tags;

	public MyTags() {
		tags = new HashMap<>();
	}

	public MyTags(final Map<String, String> tags) {
		this.tags = tags;
	}

	public void addTag(String key, String value) {
		tags.put(key, value);
	}

	public void removeTag(String key) {
		tags.remove(key);
	}
}
