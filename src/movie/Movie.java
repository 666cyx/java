package movie;

public class Movie {
    private int id;
    private String movieName;
    private String director;
    private String actor;
    private String movieType;
    private int price;
    private String showTime;
    private String room;
    private String roomType;
    private String imgUrl;

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                ", movieType='" + movieType + '\'' +
                ", price=" + price +
                ", showTime='" + showTime + '\'' +
                ", room='" + room + '\'' +
                ", roomType='" + roomType + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    public Movie(int id, String movieName, String director, String actor, String movieType, int price, String showTime, String room, String roomType, String imgUrl) {
        this.id = id;
        this.movieName = movieName;
        this.director = director;
        this.actor = actor;
        this.movieType = movieType;
        this.price = price;
        this.showTime = showTime;
        this.room = room;
        this.roomType = roomType;
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    /*public Movie(String movieName, String director, String actor, String movieType, int price, String showTime, String room, String roomType) {
        this.movieName = movieName;
        this.director = director;
        this.actor = actor;
        this.movieType = movieType;
        this.price = price;
        this.showTime = showTime;
        this.room = room;
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                ", movieType='" + movieType + '\'' +
                ", price=" + price +
                ", showTime='" + showTime + '\'' +
                ", room='" + room + '\'' +
                ", roomType='" + roomType + '\'' +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }*/
}

