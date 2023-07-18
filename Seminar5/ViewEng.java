public class ViewEng implements iGetView {

  @Override
  public void display(String text) {
    System.out.println(text);
  }
}

// Интерфейс iGetView
public interface iGetView {
  void display(String text);
}

// Контроллер с подключенным классом ViewEng
public class Controller {
  
  private iGetView view;
  private iGetModel model;

  public Controller(iGetView view, iGetModel model) {
    this.view = view;
    this.model = model;
  }

  public void run() {
    view.display("Welcome to the Student Management System!");
    // ...
  }
}