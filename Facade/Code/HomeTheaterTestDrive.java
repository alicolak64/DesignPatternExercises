public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

        System.out.println("*** Welcome to the home theater ***");
        System.out.println();

        System.out.println("\n*** Watch a movie ***");
        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println("\n*** End of movie ***");
        homeTheater.endMovie();

        System.out.println("\n*** Listen to music ***");
        homeTheater.listenToCd("The Dark Side of the Moon");
        System.out.println("\n*** End of music ***");
        homeTheater.endCd();

        System.out.println("\n*** Listen to radio ***");
        homeTheater.listenToRadio(89.5);
        System.out.println("\n*** End of radio ***");
        homeTheater.endRadio();

    }

}
