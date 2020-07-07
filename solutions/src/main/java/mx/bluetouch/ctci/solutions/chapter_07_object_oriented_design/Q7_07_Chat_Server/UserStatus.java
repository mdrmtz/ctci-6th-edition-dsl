package mx.bluetouch.ctci.solutions.chapter_07_object_oriented_design.Q7_07_Chat_Server;

public class UserStatus {
    private final String message;
    private final UserStatusType type;

    public UserStatus(UserStatusType type, String message) {
        this.type = type;
        this.message = message;
    }

    public UserStatusType getStatusType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
