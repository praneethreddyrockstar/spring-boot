package com.praneeth;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class ApplicationPro {
private int unique;

public int getUnique() {
	return unique;
}

public void setUnique(int unique) {
	this.unique = unique;
}

}
