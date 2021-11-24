import java.util.ArrayList;

public class Group{
    String GroupName;
    ArrayList<Task> Tasks = new ArrayList<Task>();
    ArrayList<User> GroupMembers = new ArrayList<User>();

    public void Group(String gn){
        GroupName = gn;
    }

    public void addUser(User newMember){
        GroupMembers.add(newMember);
    }

    public User HighScore(){
        int high = 0, pos = 0;
        for(int i = 0; i < GroupMembers.size(); i++){
            if((GroupMembers.get(i)).getScore() > high) {
                high = (GroupMembers.get(i)).getScore();
                pos = i;
            }
        }
        return GroupMembers.get(pos);
    }

    public void removeUser(User rem){
        for(int i = 0; i < GroupMembers.size(); i++) {
            if (GroupMembers.get(i) == rem) {
                GroupMembers.remove(i);
                return;
            }
        }
    }

    public void addTask(Task newTask){
        Tasks.add(newTask);
    }

    public void TaskComplete(User u, Task t){
        u.addScore(t.getPoints());
    }
}
