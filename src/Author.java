public class Author {
    private final String name;
    private final String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Name: " + name + " Last Name: " + lastName;
    }

    public boolean equals(Author author) {
        return name.equals(author.name) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + lastName.hashCode();
    }
}
