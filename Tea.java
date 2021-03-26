public class  Tea(String name, int milk, boolean herbs, int sugar, int teaPowder) {
    this.name = name;
    this.milk = milk;
    this.herbs = herbs;
    this.sugar = sugar;
    this.teaPowder = teaPowder;
}

public Tea(String name, int milk, boolean herbs, int sugar) {
    this(name, milk, herbs, sugar, DEFAULT_TEA_POWDER);
}

public Tea(String name, int milk, boolean herbs) {
    this(name, milk, herbs, 0);
}

public Tea(String name, int milk) {
    this(name, milk, false);
}

public Tea(String name) {
    this(name, 0);
}
}