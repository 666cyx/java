package movie;

public class Ticket {
    private String movieName;
    private String showTime;
    private String room;
    private String seat;


    @Override
    public String toString() {
        return "Ticket{" +
                "movieName='" + movieName + '\'' +
                ", showTime='" + showTime + '\'' +
                ", room='" + room + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Ticket(String movieName, String showTime, String room, String seat) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.room = room;
        this.seat = seat;

    }
}
