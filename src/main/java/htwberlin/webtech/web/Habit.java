package htwberlin.webtech.web;

import jakarta.persistence.*;

@Entity
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String habit;
    private int target;
    private boolean complete;

    public Habit() {}

    public Habit(Long id, String habit, int target, boolean complete) {
        this.id = id;
        this.habit = habit;
        this.target = target;
        this.complete = complete;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getHabit() { return habit; }

    public void setHabit(String name) { this.habit = name; }

    public int getTarget() { return target; }

    public void setTarget(int target) { this.target = target; }

    public boolean isComplete() { return complete; }

    public void setComplete(boolean complete) { this.complete = complete; }

    @Override
    public String toString() {
        return "Habit{" +
                "id=" + id +
                ", habit='" + habit + '\'' +
                ", target=" + target +
                ", complete=" + complete +
                '}';
    }
}


