package graphs.model;

import java.util.Set;

public class Group {
	private int number;
	Set<Element> elements;

	public Set<Element> getElements() {
		return elements;
	}

	public void setElements(Set<Element> elements) {
		this.elements = elements;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Group [number=");
		builder.append(number);
		builder.append(", elements=");
		builder.append(elements);
		builder.append("]\n");
		return builder.toString();
	}

}