package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_207_CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> courses = new ArrayList<>();

        for (int course = 0; course < numCourses; course++) {
            courses.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            courses.get(prerequisite[0]).add(prerequisite[1]);
        }

        int[] visited = new int[numCourses];

        for (int course = 0; course < numCourses; course++) {
            if (hasCycle(course, visited, courses)) {
                return false;
            }
        }

        return true;
    }

    private boolean hasCycle(int course, int[] visited, List<List<Integer>> courses) {
        if (visited[course] == 1) {
            return true;
        } else if (visited[course] == 2) {
            return false;
        }

        visited[course] = 1;

        for (int nextCourse : courses.get(course)) {
            if (hasCycle(nextCourse, visited, courses)) {
                return true;
            }
        }

        visited[course] = 2;

        return false;
    }
}
