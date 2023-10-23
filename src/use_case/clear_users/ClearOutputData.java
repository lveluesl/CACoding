package use_case.clear_users;

public class ClearOutputData {
    private final String username;

    public ClearOutputData(String usernames) {
        this.username = usernames;
    }

    public String getUsername() {
        return username;
    }
}
