public class Users {
    public class User{
        String Username;
        String Password;

        public User(String un, String pw){
            Usernam = un;
            Password = ow;
        }

        public String getUsername(){
            return Usernam;
        }

        public boolean checkPassword(String pw){
            return pw == Password;
        }
    }
}
