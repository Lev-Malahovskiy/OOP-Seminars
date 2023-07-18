// Контроллер с добавленной командой DELETE
public class Controller {
  
    private iGetView view;
    private iGetModel model;
  
    public Controller(iGetView view, iGetModel model) {
      this.view = view;
      this.model = model;
    }
  
    public void run() {
      view.display("Welcome to the Student Management System!");
  
      // Добавляем команду DELETE
      Scanner scanner = new Scanner(System.in);
      while (true) {
        view.display("Enter command: (ADD, GET, DELETE, EXIT)");
        String command = scanner.nextLine().toUpperCase();
        switch (command) {
          case "ADD":
            // ...
            break;
          case "GET":
            // ...
            break;
          case "DELETE":
            view.display("Enter student ID to delete: ");
            Long id = scanner.nextLong();
            scanner.nextLine();
            try {
              model.deleteStudent(id);
              view.display("Student with ID " + id + " deleted successfully.");
            } catch (IllegalArgumentException e) {
              view.display(e.getMessage());
            }
            break;
          case "EXIT":
            // ...
            break;
          default:
            view.display("Unknown command.");
        }
      }
    }
  }