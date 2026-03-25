package string;

public interface CharacterChanger {

    default String upper(String s) {
        return getChar() + s.toUpperCase();
    }

    private char getChar() {
        return '*';
    }
}
