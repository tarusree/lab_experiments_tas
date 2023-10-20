package lab4Ex;

// Abstract superclass for library items
public abstract class Item {
    private int identificationNumber;
    private String title;
    private int numberOfCopies;

    public Item(int identificationNumber, String title, int numberOfCopies) {
        this.identificationNumber = identificationNumber;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public abstract void printDetails();
    public abstract void checkIn();
    public abstract void checkOut();

    public String toString() {
        return "Item [ID: " + identificationNumber + ", Title: " + title + ", Copies: " + numberOfCopies + "]";
    }
}

// Abstract subclass of Item for written items
public abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) {
        super(identificationNumber, title, numberOfCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass representing a book
class Book extends WrittenItem {
    public Book(int identificationNumber, String title, int numberOfCopies, String author) {
        super(identificationNumber, title, numberOfCopies, author);
    }

    @Override
    public void printDetails() {
        System.out.println("Book Details: " + toString() + ", Author: " + getAuthor());
    }

    @Override
    public void checkIn() {
        // Implement check-in behavior for books
    }

    @Override
    public void checkOut() {
        // Implement check-out behavior for books
    }
}

// Subclass representing a journal paper
class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author, int yearPublished) {
        super(identificationNumber, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public void printDetails() {
        System.out.println("Journal Paper Details: " + toString() + ", Author: " + getAuthor() + ", Year Published: " + yearPublished);
    }

    @Override
    public void checkIn() {
        // Implement check-in behavior for journal papers
    }

    @Override
    public void checkOut() {
        // Implement check-out behavior for journal papers
    }
}

// Abstract subclass of Item for media items
public abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(int identificationNumber, String title, int numberOfCopies, int runtime) {
        super(identificationNumber, title, numberOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
}

// Subclass representing a video
class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int identificationNumber, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(identificationNumber, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public void printDetails() {
        System.out.println("Video Details: " + toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased);
    }

    @Override
    public void checkIn() {
        // Implement check-in behavior for videos
    }

    @Override
    public void checkOut() {
        // Implement check-out behavior for videos
    }
}

// Subclass representing a CD
class CD extends MediaItem {
    private String artist;
    private String musicalGenre;

    public CD(int identificationNumber, String title, int numberOfCopies, int runtime, String artist, String musicalGenre) {
        super(identificationNumber, title, numberOfCopies, runtime);
        this.artist = artist;
        this.musicalGenre = musicalGenre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMusicalGenre() {
        return musicalGenre;
    }

    public void setMusicalGenre(String musicalGenre) {
        this.musicalGenre = musicalGenre;
    }

    @Override
    public void printDetails() {
        System.out.println("CD Details: " + toString() + ", Artist: " + artist + ", Musical Genre: " + musicalGenre);
    }

    @Override
    public void checkIn() {
        // Implement check-in behavior for CDs
    }

    @Override
    public void checkOut() {
        // Implement check-out behavior for CDs
    }
}
