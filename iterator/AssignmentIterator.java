package iterator;

/**
 * Iterator to filter assignments by topic.
 */
public class AssignmentIterator {
    private Assignment[] assignments;
    private int position;
    private Topic topic;

    /**
     * Constructs the iterator.
     * @param assignments The full assignment array
     * @param topic Topic to filter
     */
    public AssignmentIterator(Assignment[] assignments, Topic topic) {
        this.assignments = assignments;
        this.topic = topic;
        this.position = 0;
    }

    /**
     * Checks if a next matching assignment exists.
     */
    public boolean hasNext() {
        while (position < assignments.length && assignments[position] != null) {
            if (assignments[position].hasTopic(topic)) {
                return true;
            }
            position++;
        }
        return false;
    }

    /**
     * Returns the next matching assignment.
     */
    public Assignment next() {
        return assignments[position++];
    }
}
