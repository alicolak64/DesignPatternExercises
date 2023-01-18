import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static Scanner scanner = new Scanner(System.in);
    public static App app = App.getInstance();

    public static void main(String[] args) {

        int choice;

        do {

            showStartMenu();

            System.out.print("Enter your choice: ");
            choice = getInt(scanner);

            if (choice == 1) {

                Person person;

                do {

                    System.out.print("Username: ");
                    String userName = scanner.nextLine();

                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    person = app.logIn(userName, password);

                    if (person != null)
                        personMenu(person);
                    else
                        System.out.println("Wrong username or password");

                } while (person == null);


            } else if (choice == 2) {

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("City: ");
                String city = scanner.nextLine();

                System.out.print("Username: ");
                String userName = scanner.nextLine();

                System.out.print("Password: ");
                String password = scanner.nextLine();

                app.signUp(name, city, userName, password);

            } else if (choice == 3) {

                boolean isAdmin;

                do {

                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    isAdmin = app.isAdmin(password);

                    if (isAdmin)
                        adminMenu();
                    else
                        System.out.println("Wrong username or password");

                } while (!isAdmin);

            } else if (choice != 0)
                System.out.println("Invalid choice!");

        } while (choice != 0);


    }

    public static void showStartMenu() {
        System.out.println("1 -> Log In");
        System.out.println("2 -> Sign Up");
        System.out.println("3 -> Admin Log In");
        System.out.println("0 -> Exit");
    }

    public static void personMenu(Person person) {

        System.out.println("Welcome " + person.getName());

        int choice1;
        int choice2;

        do {

            showPersonMenu();

            System.out.print("Enter your choice: ");
            choice1 = getInt(scanner);

            switch (choice1) {

                case 1 -> {
                    System.out.println("Communities:");
                    app.printCommunities();
                }

                case 2 -> {
                    System.out.println("Events:");
                    app.printAllEvents();
                }

                case 3 -> {

                    showCommunitiesMenu(app.getCommunities());

                    System.out.println("Enter your choice: ");
                    choice2 = getInt(scanner);

                    if (choice2 <= app.getCommunities().size() && choice2 > 0) {

                        Community community = app.getCommunities().get(choice2 - 1);
                        app.addMemberToCommunity(person, community);

                        System.out.println(person.getName() + " joined " + community.getName());

                    } else
                        System.out.println("Invalid choice!");

                }


                case 4 -> {

                    showAllEventsMenu();

                    System.out.println("Enter your choice: ");
                    choice2 = getInt(scanner);

                    if (choice2 <= app.getAllEvents().size() && choice2 > 0) {

                        Event event = app.getAllEvents().get(choice2 - 1);
                        app.joinEvent(person, event);

                        System.out.println(person.getName() + " joined " + event.getName());

                    } else
                        System.out.println("Invalid choice!");

                }

                case 5 -> createCommunityMenu(person);

                case 6 -> {

                    List<Community> communities = app.getCommunitiesByCreator(person);

                    if (communities.size() != 0) {

                        showCommunitiesMenu(communities);

                        System.out.println("Enter your choice: ");
                        choice2 = getInt(scanner);

                        if (choice2 <= app.getCommunitiesByCreator(person).size() && choice2 > 0) {

                            Community community = app.getCommunitiesByCreator(person).get(choice2 - 1);
                            createEventMenu(community);

                        } else
                            System.out.println("Invalid choice!");

                    } else {
                        System.out.println("You don't have any communities!");
                    }


                }

                case 7 -> {
                    System.out.println("Your Joined Communities:");
                    app.printCommunitiesByPerson(person);
                }

                case 8 -> {
                    System.out.println("Your Joined Events:");
                    app.printEventsByPerson(person);
                }

                case 9 -> {
                    System.out.println("Your Created Communities:");
                    app.printCommunitiesByCreator(person);
                }

                case 10 -> {

                    List<Community> communities = app.getCommunitiesByPerson(person);


                    if (communities.size() != 0) {

                        showCommunitiesMenu(communities);

                        System.out.println("Enter your choice: ");
                        choice2 = getInt(scanner);

                        if (choice2 <= app.getCommunitiesByPerson(person).size() && choice2 > 0) {

                            Community community = app.getCommunitiesByPerson(person).get(choice2 - 1);
                            app.removeMemberFromCommunity(person, community);

                            System.out.println(person.getName() + " left " + community.getName());

                        } else
                            System.out.println("Invalid choice!");

                    } else
                        System.out.println("You are not a member of any community!");

                }

                case 11 -> {

                    List<Event> events = app.getEventsByPerson(person);

                    if (events.size() != 0) {

                        showEventsMenu(events);

                        System.out.println("Enter your choice: ");
                        choice2 = getInt(scanner);

                        if (choice2 <= events.size() && choice2 > 0) {

                            Event event = events.get(choice2 - 1);
                            app.leaveEvent(person, event);

                            System.out.println(person.getName() + " left " + event.getName());

                        } else
                            System.out.println("Invalid choice!");

                    } else
                        System.out.println("You have not joined any events yet!");

                }

                case 12 -> {

                    List<Event> events = new ArrayList<>();

                    for (Community community : app.getCommunitiesByCreator(person))
                        events.addAll(app.getEventsByCommunity(community));

                    if (events.size() != 0) {

                        showEventsMenu(events);

                        System.out.println("Enter your choice: ");
                        choice2 = getInt(scanner);

                        if (choice2 <= events.size() && choice2 > 0) {

                            Event event = events.get(choice2 - 1);
                            app.deleteEvent(event.getCommunity(), event);

                            System.out.println(person.getName() + " delete event " + event.getName());

                        } else
                            System.out.println("Invalid choice!");

                    } else
                        System.out.println("You have not created any events yet!");

                }

                case 13 -> {
                    System.out.println("Your Notifications:");
                    app.printNotificationsByPerson(person);
                }

                case 14 -> {
                    System.out.println("Your Notifiers");
                    app.printNotifiersByPerson(person);
                }

                case 15 -> {

                    List<String> allNotifier = app.getAllNotifier();
                    List<String> personNotifier = app.getNotifierByPerson(person);

                    List<String> notifiers = new ArrayList<>();

                    for (String notifier : allNotifier)
                        if (!personNotifier.contains(notifier))
                            notifiers.add(notifier);


                    if (notifiers.size() != 0) {
                        showNotifiersMenu(notifiers);

                        System.out.println("Enter your choice: ");
                        choice2 = getInt(scanner);

                        if (choice2 <= notifiers.size() && choice2 > 0) {

                            String notifier = notifiers.get(choice2 - 1);
                            app.addNotifierToPerson(person, notifier);

                            System.out.println(person.getName() + " subscribed to " + notifier);

                        } else
                            System.out.println("Invalid choice!");

                    } else
                        System.out.println("You have no will be added notifier!");

                }

                case 16 -> {

                    List<String> notifiers = app.getNotifierByPerson(person);

                    if (notifiers.size() != 0) {

                        showNotifiersMenu(notifiers);

                        System.out.println("Enter your choice: ");
                        choice2 = getInt(scanner);

                        if (choice2 <= notifiers.size() && choice2 > 0) {

                            String notifier = notifiers.get(choice2 - 1);
                            app.removeNotifierFromPerson(person, notifier);

                            System.out.println(person.getName() + " unsubscribed from " + notifier);

                        } else
                            System.out.println("Invalid choice!");

                    } else
                        System.out.println("You have no will be removed notifier!");

                }

                case 17 -> {

                    System.out.println("Your Information :");
                    showInformationMenu(person);

                    System.out.println("Enter your choice: ");
                    choice2 = getInt(scanner);

                    if (choice2 <= 4 && choice2 > 0) {

                        switch (choice2) {

                            case 1 -> {
                                System.out.println("Enter the new name: ");
                                String newName = scanner.nextLine();
                                person.setName(newName);
                            }
                            case 2 -> {
                                System.out.println("Enter the new city: ");
                                String newCity = scanner.nextLine();
                                person.setCity(newCity);
                            }
                            case 3 -> {
                                System.out.println("Enter the new username : ");
                                String newUsername = scanner.nextLine();
                                person.setUsername(newUsername);
                            }
                            case 4 -> {
                                System.out.println("Enter the new password: ");
                                String newPassword = scanner.nextLine();
                                person.setPassword(newPassword);
                            }

                        }

                    } else
                        System.out.println("Invalid choice!");
                }

                case 0 -> System.out.println("Logging out...");

            }

        } while (choice1 != 0);


    }

    public static void showPersonMenu() {
        System.out.println("1. Show Communities");
        System.out.println("2. Show Events");
        System.out.println("3. Join Community");
        System.out.println("4. Join Event");
        System.out.println("5. Create Community");
        System.out.println("6. Create Event");
        System.out.println("7. Show My Joined Communities");
        System.out.println("8. Show My Joined Events");
        System.out.println("9. Show My Owned Communities");
        System.out.println("10. Leave Community");
        System.out.println("11. Leave Event");
        System.out.println("12. Delete Event");
        System.out.println("13. Show Notifications");
        System.out.println("14. Show Notifiers");
        System.out.println("15. Add Notifier");
        System.out.println("16. Remove Notifier");
        System.out.println("17. Change Information");
        System.out.println("0. Log out");
    }

    public static void showCommunitiesMenu(List<Community> communities) {

        for (int i = 0; i < communities.size(); i++)
            System.out.println((i + 1) + ". " + communities.get(i).getName());

    }

    public static void showAllEventsMenu() {

        for (int i = 0; i < app.getAllEvents().size(); i++)
            System.out.println((i + 1) + ". " + app.getAllEvents().get(i).getName());

    }

    public static void showEventsMenu(List<Event> events) {

        for (int i = 0; i < events.size(); i++)
            System.out.println((i + 1) + ". " + events.get(i).getName());

    }

    public static void createCommunityMenu(Person person) {

        System.out.print("Enter community name: ");
        String name = scanner.nextLine();

        app.createCommunity(name, person);

    }

    public static void createEventMenu(Community community) {


        System.out.print("Enter event name: ");
        String name = scanner.nextLine();

        System.out.println("Enter event date: ");
        String date = scanner.nextLine();

        System.out.println("Enter event location: ");
        String location = scanner.nextLine();

        System.out.println("Enter event price: ");
        int price = getInt(scanner);

        app.createEvent(name, date, location, price, community);

    }

    public static void showInformationMenu(Person person) {

        System.out.println("1. Change Name : " + person.getName());
        System.out.println("2. Change City : " + person.getCity());
        System.out.println("3. Change Username : " + person.getUsername());
        System.out.println("4. Change Password : ********");

    }

    public static void showNotifiersMenu(List<String> notifiers) {

        for (int i = 0; i < notifiers.size(); i++)
            System.out.println((i + 1) + ". " + notifiers.get(i));

    }

    public static void adminMenu() {

        System.out.println("Welcome admin");

        int choice;

        do {

            showAdminMenu();

            System.out.print("Enter your choice: ");
            choice = getInt(scanner);

            switch (choice) {

                case 1 -> {
                    System.out.println("Persons:");
                    app.printPersons();
                }

                case 2 -> {
                    System.out.println("Communities:");
                    app.printCommunities();
                }

                case 3 -> {
                    System.out.println("Events:");
                    app.printAllEvents();
                }

                case 4 -> {
                    System.out.println("Notifiers:");
                    for (String notifier : app.getAllNotifier())
                        System.out.println("      " + notifier);
                }

                case 5 -> {

                    System.out.println("Enter the notifier: ");
                    String notifier = scanner.nextLine();

                    app.addNotifier(notifier);

                }

                case 6 -> {

                    List<String> notifiers = app.getAllNotifier();

                    if (notifiers.size() > 0) {

                        System.out.println("Notifiers:");
                        showNotifiersMenu(notifiers);

                        System.out.println("Enter the notifier: ");
                        int choice2 = getInt(scanner);

                        if (choice2 <= notifiers.size() && choice2 > 0) {

                            String notifier = notifiers.get(choice2 - 1);

                            app.removeNotifier(notifier);

                            System.out.println(notifier + " removed!");

                        } else
                            System.out.println("Invalid choice!");

                    } else
                        System.out.println("You have no will be removed notifier!");

                }

                case 7 -> {
                    System.out.println("Enter the new password: ");
                    String newPassword = scanner.nextLine();
                    app.changeAdminPassword(newPassword);
                }

                case 0 -> System.out.println("Logging out...");

            }

        } while (choice != 0);

    }

    public static void showAdminMenu() {

        System.out.println("1. Show Persons");
        System.out.println("2. Show Communities");
        System.out.println("3. Show Events");
        System.out.println("4. Show Notifier");
        System.out.println("5. Add Notifier");
        System.out.println("6. Remove Notifier");
        System.out.println("7. Change Password");
        System.out.println("0. Log out");

    }

    public static int getInt(Scanner scanner) {
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }


}
