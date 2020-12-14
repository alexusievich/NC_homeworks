package com.mycompany.hw1;

public enum Type {
    firstType("Equilateral"), // равносторонний
    secondType("Isosceles"), // равнобедренный
    thirdType("Scalene"), //разносторонний
    fourthType("Degenerate"); // вырожденный (3 точки лежат на одной прямой)

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
