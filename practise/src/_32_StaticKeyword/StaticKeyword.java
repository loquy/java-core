package _32_StaticKeyword;

public class StaticKeyword {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        // The class "owns" the static member
        Friend friend1 = new Friend("friend1");
        System.out.println(friend1.numberOfFriends);
        Friend.displayFriends();

        Friend friend2 = new Friend("friend2");
        System.out.println(friend2.numberOfFriends);
        Friend.displayFriends();

        Friend friend3 = new Friend("friend3");
        System.out.println(friend3.numberOfFriends);
        Friend.displayFriends();

        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}
