public class TeacherController<T extends User> implements iUserController<T> {

    iUserService<T> userService;
  
    public TeacherController(iUserService<T> userService) {
      this.userService = userService;
    }
  
    @Override
    public void createUser(T user) {
      userService.createUser(user);
    }
  
    @Override
    public List<T> getUsers() {
      return userService.getUsers();
    } 
  }