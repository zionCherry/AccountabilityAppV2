import java.util.ArrayList;

public class Group{
    String GroupName;
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

    public void removeUser(String nameRem){
        for(int i = 0; i < GroupMembers.size(); i++) {
            if ((GroupMembers.get(i)).getUsername().equals(nameRem)) {
                GroupMembers.remove(i);
                return;
            }
        }
    }
}
