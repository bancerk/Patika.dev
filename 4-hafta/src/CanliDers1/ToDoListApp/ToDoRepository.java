package CanliDers1.ToDoListApp;

import java.util.ArrayList;
import java.util.List;

public class ToDoRepository {

    private List<ToDo> toDos = new ArrayList<>();
    private int toDoCounter = 1;

    public void save(ToDo toDo) {
        toDo.setId(toDoCounter);
        toDos.add(toDo);
        toDoCounter++;
    }

    public boolean exists(int toDoId) {

        for (ToDo toDo : toDos) {
            if (toDo.getId() == toDoId) {
                return true;
            }
        }

        return false;
    }

    public ToDo findById(int toDoId) {

        for (ToDo toDo : toDos) {
            if (toDo.getId() == toDoId) {
                return toDo;
            }
        }

        return null;
    }

    public List<ToDo> findAll() {
        return toDos;
    }
}
