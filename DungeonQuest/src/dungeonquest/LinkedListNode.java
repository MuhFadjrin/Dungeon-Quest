package dungeonquest;

/**
 *
 * @author Hamba Allah
 */
public class LinkedListNode {

    LinkedListNode next;
    LinkedListNode prev;
    int HP,idx;

    LinkedListNode(int HP,int idx) {

        this.idx = idx;
        this.HP = HP;
        this.prev = null;
        this.next = null;

    }

    void set_prev(LinkedListNode other) {

        this.prev = other;
        if (other != null) {
            other.next = this;
        }

    }

    void set_next(LinkedListNode other) {

        this.next = other;
        if (other != null) {
            other.prev = this;
        }

    }
}
