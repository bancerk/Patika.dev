package canliDers1.ToDoListApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ToDoService {

    private final ToDoRepository toDoRepository = new ToDoRepository();

    public void addTodoItem(String description, int priority) {
        ToDo toDo = new ToDo(description, priority);
        toDo.setCompleted(false);
        toDoRepository.save(toDo);
    }

    public void completeToDoItem(int toDoId) {
        boolean exists = toDoRepository.exists(toDoId);
        if (exists) {
            ToDo toDo = toDoRepository.findById(toDoId);
            toDo.setCompleted(true);
        }
    }

    public List<ToDo> getAll() {
        return toDoRepository.findAll();
    }

    public List<ToDo> getCompleted() {
        List<ToDo> completed = new ArrayList<>();
        List<ToDo> all = toDoRepository.findAll();
        for (ToDo toDo : all) {
            if (toDo.isCompleted()) {
                completed.add(toDo);
            }
        }
        return completed;
    }

    public List<ToDo> getInCompleteToDosSortedByPriority() {
        List<ToDo> inComplete = new ArrayList<>();
        List<ToDo> all = toDoRepository.findAll();
        for (ToDo toDo : all) {
            if (!toDo.isCompleted()) {
                inComplete.add(toDo);
            }
        }

        Comparator<ToDo> toDoComparator = new Comparator<>() {
            // 0 => eşit
            // + birinci büyük
            // - ikinci büyük
            @Override
            public int compare(ToDo o1, ToDo o2) {
                return o1.getPriority() - o2.getPriority();
            }
        };
        inComplete.sort(toDoComparator);

        return inComplete;
    }
}
