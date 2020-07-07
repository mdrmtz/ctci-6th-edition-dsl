package mx.bluetouch.ctci.solutions.chapter_07_object_oriented_design.Q7_07_Chat_Server;

public class GroupChat extends Conversation {
	public void removeParticipant(User user) {
		participants.remove(user);
	}
	
	public void addParticipant(User user) {
		participants.add(user);
	}
}
