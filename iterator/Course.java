package iterator;

/**
 * Represents a course containing multiple assignments.
 */
public class Course {
    private Assignment[] assignments;
    private int count;
    private String name;
    private String title;

    /**
     * Constructs a new course.
     * @param name Course code
     * @param title Course title
     */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
        this.assignments = new Assignment[10];
        this.count = 0;
    }

    /**
     * Adds a new assignment to the course.
     */
    public void addAssignment(String title, String description, Topic topic) {
        if (count >= assignments.length) {
            assignments = growArray(assignments);
        }
        assignments[count++] = new Assignment(title, description, topic);
    }

    /**
     * Creates an iterator to filter assignments by topic.
     */
    public AssignmentIterator createIterator(Topic topic) {
        return new AssignmentIterator(assignments, topic);
    }

    /**
     * Course display string.
     */
    public String toString() {
        return name + ": " + title;
    }

    /**
     * Grows the assignment array.
     */
    private Assignment[] growArray(Assignment[] first) {
        Assignment[] bigger = new Assignment[first.length * 2];
        for (int i = 0; i < first.length; i++) {
            bigger[i] = first[i];
        }
        return bigger;
    }
}
