package Administration;

import TestManager.*;
import java.util.*;

/**
 * The Teacher class extend the User. It adds a collection of courses that the teacher is teaching
 * and can create tests for. It also adds a collection of Published and Unpublished tesst.
 * PublishedTests are already assigned to a specific (group of) student(s) and the UnpublishedTests
 * are tests that are still in progress.
 */
public abstract class Teacher extends User {
   Collection<Course> courses;
   Collection<Test> published;
   Collection<Test> unpublished;
}
