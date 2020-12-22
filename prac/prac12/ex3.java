package com.company.prac12;

public class ex3 {
    private final String id;
    private final String item;
    private final String color;
    private final String size;

    ex3(String rawShirt) {
        String[] shirt = rawShirt.split(",");
        this.id = shirt[0];
        this.item = shirt[1];
        this.color = shirt[2];
        this.size = shirt[3];
    }
    @Override
    public String toString() {
        return "Shirt " + '\n' +
                "id=" + id + '\n' +
                "item=" + item + '\n' +
                "color=" + color + '\n' +
                "size=" + size + '\n';
    }
}