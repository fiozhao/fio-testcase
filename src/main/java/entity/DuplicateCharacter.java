package entity;

/**
 * @Author: Fio
 * @Date: 8/30/2023 4:56 PM
 */
public class DuplicateCharacter {
    private String character;
    private int first;
    private int last;
    private int length;

    public DuplicateCharacter(String character, int first, int last) {
        this.character = character;
        this.first = first;
        this.last = last;
        this.length = last - first;
    }

    public String getCharacter() {
        return character;
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }
}
