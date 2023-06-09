package movie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    ArrayList<Movie> movieList = new ArrayList<>();
    ArrayList<Ticket> ticketList = new ArrayList<>();
    Movie movie;
    Scanner s = new Scanner(System.in);
    String seatNo;

    public Cinema() {
        init();
    }

    public void start() {
        while (true) {

            showMovie();
            choiseSeat();
            buy();
        }
    }

  /*  public void buyTicket() {
        if (checkTicket(seatNo, movie.getRoom(), movie.getShowTime())) {
            System.out.println("票还在，马上出票");
            ticketList.add(new Ticket(movie.getMovieName(), movie.getShowTime(), movie.getRoom(), seatNo));
        } else {
            System.out.println("票已经卖出，请重新选择座位");
        }
    }*/

    public void buy() {
        if (checkTicket(seatNo, movie.getRoom(), movie.getShowTime())) {
            System.out.println("购票成功");
            String str = "************************" + "\r\n";
            str = str + "          柳职电影院" + "\r\n";
            str = str + "---------------------------" + "\r\n";
            str = str + "电影名称：       " + movie.getMovieName() + "\r\n";
            str = str + "放映厅：         " + movie.getRoom() + "\r\n";
            str = str + "放映时间：        " + movie.getShowTime() + "\r\n";
            str = str + "座位号：         " + seatNo + "\r\n";
            str = str + "****************************" + "\r\n";
            System.out.println(str);
            FileWriter writer = null;
            try {
                writer = new FileWriter("D:\\temp\\电影票.txt");
                writer.write(str);
                writer.write("\r\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ticketList.add(new Ticket(movie.getMovieName(), movie.getShowTime(), movie.getRoom(), seatNo));
        } else {
            System.out.println("购票失败，请重新选择座位");
        }
    }

    public boolean checkTicket(String seatNo, String room, String showTime) {
        for (Ticket t : ticketList) {
            if (t.getSeat().equals(seatNo)
                    && t.getRoom().equals(room)
                    && t.getShowTime().equals(showTime)) {
                return false;
            }
        }
        return true;
    }

    public void choiseSeat() {
        System.out.println("请选择电影：");
        int n = s.nextInt();
        movie = movieList.get(n - 1);
        System.out.println("您选择的电影：" + movie.getMovieName() + ",放映时间：" + movie.getShowTime() + ",在" + movie.getRoom() + "放映");
        printSeat(5, 7);
        System.out.println("请选择座位");
        seatNo = s.next();
    }

    public void printSeat(int row, int col) {
        System.out.println("\t\t\t\t\t\t\t屏幕");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (checkTicket(i + "-" + j, movie.getRoom(), movie.getShowTime())) {
                    System.out.print(i + "-" + j + "        ");
                } else {
                    System.out.print("已购" + "      ");
                }
            }
            System.out.println();
        }
    }

    public void init() {
        /*movieList.add(new Movie("功夫", "周星驰", "周星驰", "搞笑", 40, "17:00-19:00", "1号厅", "vip"));
        movieList.add(new Movie("斗破", "史莱克", "史莱克", "修仙", 50, "19:00-21:00", "2号厅", "vip"));
        movieList.add(new Movie("斗罗", "唐三少", "唐三少", "玄幻", 60, "22:00-24:00", "3号厅", "vip"));*/
        System.out.println("\t\t\t\t\t---------------欢迎来到柳职电影院-------------");
    }

    public void showMovie() {
        System.out.println("序号\t\t电影名称\t\t导演\t\t\t演员\t\t\t电影类型\t\t价格\t\t放映时间\t\t\t放映厅\t\t放映类型");
        for (int i = 0; i < movieList.size(); i++) {
            Movie movie = movieList.get(i);
            System.out.println((i + 1) + "\t\t" + movie.getMovieName() + "\t\t\t" + movie.getDirector() + "\t\t" + movie.getActor() + "\t\t" + movie.getMovieType() +
                    "\t\t\t" + movie.getPrice() + "\t\t" + movie.getShowTime() + "\t\t" + movie.getRoom() + "\t\t" + movie.getRoomType() + "\t\t\t");
        }
    }
}
