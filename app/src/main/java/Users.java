public class Users {
    String Username;
    String Password;
    int Score;

    public void User(String un, String pw){
        Usernam = un;
        Password = ow;
        score = 0;
    }
    public String getUsername(){
        return Usernam;
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
