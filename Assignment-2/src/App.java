// Create Multiple classes

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

// Student:
// Properties: studentId, name, email, contactNumber
class Student {
    private int studentId;
    private String name;
    private String email;
    private long contactNumber;

    // Constructor
    public Student(int studentId, String name, String email, long contactNumber) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}

// Assignment:
// Properties: assignmentId, title, description, dueDate, List<Question>

class Assignment {
    private int assignmentId;
    private String title;
    private String description;
    private String dueDate;
    private List<Question> questions;

    // Constructor
    public Assignment(int assignmentId, String title, String description, String dueDate, List<Question> questions) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.questions = questions;
    }

    // Getters and setters
    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    // Hashcode and equals implementation
    @Override
    public int hashCode() {
        return Objects.hash(assignmentId, title, description, dueDate, questions);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Assignment that = (Assignment) obj;
        return assignmentId == that.assignmentId &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(dueDate, that.dueDate) &&
                Objects.equals(questions, that.questions);
    }
}

// Trainer:
// Properties: trainerId, name, email, contactNumber, List<TechStack>
class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private long contactNumber;
    private List<TechStack> techStack;

    // Constructor
    public Trainer(int trainerId, String name, String email, long contactNumber, List<TechStack> techStack) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.techStack = techStack;
    }

    // Getters and setters
    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<TechStack> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<TechStack> techStack) {
        this.techStack = techStack;
    }

    // Hashcode and equals implementation
    @Override
    public int hashCode() {
        return Objects.hash(trainerId, name, email, contactNumber, techStack);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Trainer trainer = (Trainer) obj;
        return trainerId == trainer.trainerId &&
                Objects.equals(name, trainer.name) &&
                Objects.equals(email, trainer.email) &&
                contactNumber == trainer.contactNumber &&
                Objects.equals(techStack, trainer.techStack);
    }
}

// TechStack:
// Properties: techStackId, name, description
class TechStack {
    private int techStackId;
    private String name;
    private String description;

    // Constructor
    public TechStack(int techStackId, String name, String description) {
        this.techStackId = techStackId;
        this.name = name;
        this.description = description;
    }

    // Getters and setters
    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Hashcode and equals implementation
    @Override
    public int hashCode() {
        return Objects.hash(techStackId, name, description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        TechStack techStack = (TechStack) obj;
        return techStackId == techStack.techStackId &&
                Objects.equals(name, techStack.name) &&
                Objects.equals(description, techStack.description);
    }
}

// Result:
// Properties: resultId, student, assignment, trainer, score, feedback,
// submissionDate

class Result {
    private int resultId;
    private String student;
    private String assignment;
    private String trainer;
    private double score;
    private String feedback;
    private String submissionDate;

    // Constructor
    public Result(int resultId, String student, String assignment, String trainer,
            double score, String feedback, String submissionDate) {
        this.resultId = resultId;
        this.student = student;
        this.assignment = assignment;
        this.trainer = trainer;
        this.score = score;
        this.feedback = feedback;
        this.submissionDate = submissionDate;
    }

    // Getters and setters
    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    // Hashcode and equals implementation
    @Override
    public int hashCode() {
        return Objects.hash(resultId, student, assignment, trainer, score, feedback, submissionDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Result result = (Result) obj;
        return resultId == result.resultId &&
                Double.compare(result.score, score) == 0 &&
                Objects.equals(student, result.student) &&
                Objects.equals(assignment, result.assignment) &&
                Objects.equals(trainer, result.trainer) &&
                Objects.equals(feedback, result.feedback) &&
                Objects.equals(submissionDate, result.submissionDate);
    }
}

// ResultsData:
// Properties: List<Result>
class ResultsData {
    private List<Result> results;

    // Constructor
    public ResultsData(List<Result> results) {
        this.results = results;
    }

    // Getter and setter for the list of results
    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    void addResult(Result result) {
        results.add(result);
    }

    void getResultsByStudent(Student student) {

    }
}

// Question:
// QuestionId, List<Answer>, answerkey, score of Question, techstackid,
// assignmentid
class Question {
    private int questionId;
    private List<Answer> answers;
    private int answerKey;
    private int scoreOfQuestion;
    private int techStackId;
    private int assignmentId;

    // Constructor
    public Question(int questionId, List<Answer> answers, int answerKey, int scoreOfQuestion,
            int techStackId, int assignmentId) {
        this.questionId = questionId;
        this.answers = answers;
        this.answerKey = answerKey;
        this.scoreOfQuestion = scoreOfQuestion;
        this.techStackId = techStackId;
        this.assignmentId = assignmentId;
    }

    // Getters and setters
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public int getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(int answerKey) {
        this.answerKey = answerKey;
    }

    public int getScoreOfQuestion() {
        return scoreOfQuestion;
    }

    public void setScoreOfQuestion(int scoreOfQuestion) {
        this.scoreOfQuestion = scoreOfQuestion;
    }

    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }
}

class Answer {
    private int answerId;
    private String answerText;
}

public class App {
    public static void main(String[] args) throws Exception {
        // Create 10 students Objects
        List<Student> student = new ArrayList<>();
        student.add(new Student(1, "Sarah", "sarah@google.com", 1234567890L));
        student.add(new Student(2, "Benjamin", "benjamin@google.com", 2345678901L));
        student.add(new Student(3, "Samantha", "samantha@google.com", 3456789012L));
        student.add(new Student(4, "William", "william@google.com", 4567890123L));
        student.add(new Student(5, "Emma", "emma@google.com", 5678901234L));
        student.add(new Student(6, "Jacob", "jacob@google.com", 6789012345L));
        student.add(new Student(7, "Olivia", "olivia@google.com", 7890123456L));
        student.add(new Student(8, "Ethan", "ethan@google.com", 8901234567L));
        student.add(new Student(9, "Ava", "ava@google.com", 9012345678L));
        student.add(new Student(10, "Noah", "noah@google.com", 1234567890L));
        // Create 5 tech stacks
        // TechStack:
        // Properties: techStackId, name, description
        List<TechStack> techStack = new ArrayList<>();
        techStack.add(new TechStack(1, "Python", "General-purpose programming language"));
        techStack.add(new TechStack(2, "Java", "Object-oriented programming language"));
        techStack.add(new TechStack(3, "C++", "General-purpose programming language"));
        techStack.add(new TechStack(4, "Django", "Web development framework for Python"));
        techStack.add(new TechStack(5, "Spring", "Application development framework for Java"));

        // Create 3 trainers
        List<Trainer> tariner = new ArrayList<>();
        // Properties: trainerId, name, email, contactNumber, List<TechStack>
        tariner.add(new Trainer(1, "Ritu", "ritu.s@brudite.com", 9023258962L, techStack));
        tariner.add(new Trainer(2, "Krishna", "krishna.t@brudite.com", 9028238962L, techStack));
        tariner.add(new Trainer(3, "Rishabh", "rishabh.t@brudite.com", 9229258962L, techStack));

        // Create 4 questions in each assignment
        // Question:
        // QuestionId, List<Answer>, answerkey, score of Question,
        // techstackid,assignmentid
        List<Question> question = new ArrayList<>();
        // Questions for Assignment-1
        question.add(new Question(1, null, 0, 10, 1, 1));
        question.add(new Question(2, null, 0, 10, 2, 1));
        question.add(new Question(3, null, 0, 10, 4, 1));
        question.add(new Question(4, null, 0, 10, 1, 1));

        // Questions for Assignment-2
        question.add(new Question(1, null, 0, 10, 2, 2));
        question.add(new Question(2, null, 0, 10, 1, 2));
        question.add(new Question(3, null, 0, 10, 2, 2));
        question.add(new Question(4, null, 0, 10, 4, 2));

        // Questions for Assignment-3
        question.add(new Question(1, null, 0, 10, 2, 3));
        question.add(new Question(2, null, 0, 10, 3, 3));
        question.add(new Question(3, null, 0, 10, 2, 3));
        question.add(new Question(4, null, 0, 10, 1, 3));

        // Questions for Assignment-4
        question.add(new Question(1, null, 0, 10, 2, 4));
        question.add(new Question(2, null, 0, 10, 4, 4));
        question.add(new Question(3, null, 0, 10, 2, 4));
        question.add(new Question(4, null, 0, 10, 3, 4));

        // Create 4 Assignments
        // Assignment:
        // Properties: assignmentId, title, description, dueDate, List<Question>
        List<Assignment> assignment = new ArrayList<>();
        assignment.add(new Assignment(1, "Data Types", null, "05/01/2024", question.subList(0, 3)));
        assignment.add(new Assignment(1, "OOPS", null, "15/01/2024", question.subList(4, 7)));
        assignment.add(new Assignment(1, "Caching", null, "25/01/2024", question.subList(8, 11)));
        assignment.add(new Assignment(1, "Development Strategies", null, "1/02/2024", question.subList(12, 15)));
    }
}
