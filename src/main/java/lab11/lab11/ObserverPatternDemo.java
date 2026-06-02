package lab11.lab11;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("Tech Explained");

        MediaInterested media1 = new MediaInterested("CNN");
        MediaInterested media2 = new MediaInterested("FoxNews");

        // Primul apel: 2 observatori inregistrati
        channel.attach(media1);
        channel.attach(media2);

        System.out.println("--- Primul upload (2 observatori) ---");
        channel.uploadVideo("Observer Pattern in Java");

        // Al doilea apel: eliminam un observator, ramane doar unul
        channel.detach(media2);

        System.out.println("\n--- Al doilea upload (1 observator) ---");
        channel.uploadVideo("Singleton Pattern in Java");
    }
}