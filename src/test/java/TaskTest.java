import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void testSimpleTaskWithMatches() {
        SimpleTask simpleTask = new SimpleTask(1, "Black tree");

        boolean actual = simpleTask.matches("tree");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleTaskWithoutMatches() {
        SimpleTask simpleTask = new SimpleTask(1, "Black tree");

        boolean actual = simpleTask.matches("pink");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingWithTopicMatches() {
        Meeting meeting = new Meeting(1, "Meeting", "Milk", "10.08.2024");

        boolean actual = meeting.matches("Meeting");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingWithProjectMatches() {
        Meeting meeting = new Meeting(1, "Meeting", "Milk", "10.08.2024");

        boolean actual = meeting.matches("Milk");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingWithoutMatches() {
        Meeting meeting = new Meeting(1, "Meeting", "Milk", "10.08.2024");

        boolean actual = meeting.matches("Day");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEpicWithMatches() {
        String[] subtasks = {"Test", "Test1"};
        Epic epic = new Epic(1, subtasks);

        boolean actual = epic.matches("Test");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEpicWithoutMatches() {
        String[] subtasks = {"Test", "Test1"};
        Epic epic = new Epic(1, subtasks);

        boolean actual = epic.matches("Test3");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}
