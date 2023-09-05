package oop_lesson5;

import oop_lesson5.controllers.UserController;
import oop_lesson5.model.*;
import oop_lesson5.utils.Validate;
import oop_lesson5.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("users.txt");
        Repository repository = new RepositoryFileJSON(fileOperation, new UserMapperJSON());
        Validate validate = new Validate();
        UserController controller = new UserController(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
