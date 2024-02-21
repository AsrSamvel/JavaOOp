package FourthEx;

import java.util.List;

public class UserService <T extends User> {
    public List<T> getAll();
    public void initData(List<T> list);
    public void create(String surname, String firstname, String patronymic);
}

