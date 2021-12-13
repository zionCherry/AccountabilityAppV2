public class Task {
    String name;
    int pointReward;

    public void Task(String n, int rew){
        name = n;
        pointReward = rew;
    }

    public String getTask(){
        return name;
    }

    public int getPoints(){
        return pointReward;
    }
}
