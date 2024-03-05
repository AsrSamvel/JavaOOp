package FifthEx.View;

import java.util.List;

import FifthEx.Model.User;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> list);
} 
