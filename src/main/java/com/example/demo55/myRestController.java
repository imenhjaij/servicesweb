import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping
    public String getAllTasks() {
        return "Liste de toutes les tâches";
    }

    @PostMapping
    public String createTask(@RequestBody String task) {
        return "Tâche créée : " + task;
    }

    @GetMapping("/{id}")
    public String getTaskById(@PathVariable int id) {
        return "Détails de la tâche avec l'ID : " + id;
    }

    @PutMapping("/{id}")
    public String updateTask(@PathVariable int id, @RequestBody String task) {
        return "Tâche mise à jour avec l'ID " + id + " : " + task;
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        return "Tâche supprimée avec l'ID : " + id;
    }
}
