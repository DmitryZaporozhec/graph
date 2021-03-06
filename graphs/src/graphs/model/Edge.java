package graphs.model;

import java.util.Set;

public class Edge {
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
		builder.append("Edge [number=").append(number).append(", elements=")
				.append(elements).append("]\n");
		return builder.toString();
	}

}
