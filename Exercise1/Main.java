import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student("John Doe", 20, "johndoe@example.com");

        // Create a new Gson object
        Gson gson = new Gson();

        // Serialize the student object into a JSON string
        String json = gson.toJson(student);
        System.out.println("Serialized student: " + json);

        // Deserialize the JSON string back into a Student object
        Student deserializedStudent = gson.fromJson(json, Student.class);
        System.out.println("Deserialized student: " + deserializedStudent.getName());
    }
}
