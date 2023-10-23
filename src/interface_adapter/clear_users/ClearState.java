package interface_adapter.clear_users;

import interface_adapter.signup.SignupState;

public class ClearState {
    private String username = "";

    public ClearState(ClearState copy) {
        username = copy.username;
    }

    public ClearState(){}

    public String getUsername() {return username;}

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
        return "ClearState{" + username + "}";
    }
}
