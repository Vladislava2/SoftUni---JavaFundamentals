package ObjectsAndClasses.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++){
            String infoForSong = scanner.nextLine();

            String type = infoForSong.split("_")[0];
            String name = infoForSong.split("_")[1];
            String time = infoForSong.split("_")[2];

            Song song = new Song(type, name, time);

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String command = scanner.nextLine();

        for (Song song : songs){
            if (command.equals("all")){
                System.out.println(song.getName());
            } else {
                if (song.getTypeList().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
