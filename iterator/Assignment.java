package iterator;

/**
 * Represents an assignment with a title, description, and topic.
 */
public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    /**
     * Constructs an assignment.
     * @param title Title of the assignment
     * @param description Description of the assignment
     * @param topic Topic of the assignment
     */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /**
     * Checks if the assignment matches a specific topic.
     * @param topic The topic to compare
     * @return true if it matches or if the filter is ALL
     */
    public boolean hasTopic(Topic topic) {
        return topic == Topic.ALL || this.topic == topic;
    }

    /**
     * Returns string representation of the assignment
     */
    public String toString() {
        return title + ": " + description + " [" + topic + "]";
    }
}
