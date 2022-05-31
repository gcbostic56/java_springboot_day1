package springboot_project_day1.springboot_project_day1;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private final long id;
	private final String content;
	private final int dogAge;
	private final String dogName;

	public Greeting(long id, String content, int dogAge, String dogName) {
		this.id = id;
		this.content = content;
		this.dogAge = dogAge;
		this.dogName = dogName;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	public int getAge() {
		return this.dogAge;
	}

	public String getDogName() {
		return this.dogName;
	}


}
