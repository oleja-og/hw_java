

public class ViewTou {


    public void run(){

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case GAME:
                        game();
                        break;
                    case DELETE:
                        delete();
                        break;
                }
            }
            catch(Exception ex) {
                System.out.println("Произошла ошибка " + ex.toString());
            }
        }
    }
    private void read() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        User user_ = userController.readUser(id);
        System.out.println(user_);
    }

    private void delete() {
        String userid = prompt("Идентификатор пользователя: ");
        userController.deleteUser(userid);
    }

    private void update()  {
        String userid = prompt("Идентификатор пользователя: ");
        String field_name = prompt("Какое поле (FIO,NAME,TELEPHONE): ");
        String param = null;
        if (Fields.valueOf(field_name) == Fields.TELEPHONE) {
            param = catchTelephone(param);
            if(param == null) {
                return;
            }
        }
        else {
            param = prompt("Введите на то что хотите изменить");
        }
        User _user = userController.readUser(userid);
        userController.updateUser(_user, Fields.valueOf(field_name.toUpperCase()), param);
    }

    private void game() {
        for (User user : userController.getUsers()) {
            System.out.println(user);
        }
    }
    private void create()  {
        String id = prompt("Id: ");
        String name = prompt("Имя: ");
        String weight = prompt("Вес: ");
        String chance = prompt("Шанс: ");



        ToyController.addToy(new Toy(id,name, weight, chance));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
