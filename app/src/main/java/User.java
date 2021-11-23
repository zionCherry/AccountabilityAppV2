public class User {
    String Username;
    String Password;
    int Score;

    public void User(String un, String pw){
        Username = un;
        Password = pw;
        Score = 0;
    }
    public String getUsername(){
        return Username;
    }

    public boolean checkPassword(String pw){
        return pw == Password;
    }

    public void changePassword(String pw){
        Password = pw;
    }

    public int getScore() {
        return Score;
    }

    public void addScore(int add){
        Score = Score + add;
    }

    public void subScore(int sub){
        Score = Score - sub;
    }

    public void setScore(int scr){
        Score = scr;
    }
}
