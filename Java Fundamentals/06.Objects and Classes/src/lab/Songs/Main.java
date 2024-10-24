package Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        List<Songs> listSongs = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String data = scanner.nextLine();

            String typeList = data.split("_")[0];
            String name = data.split("_")[1];
            String time = data.split("_")[2];

            Songs currentSong = new Songs(typeList, name, time);


            listSongs.add(currentSong);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {

            for (Songs song : listSongs) {

                System.out.println(song.getName());
            }


        } else {

            for (Songs song : listSongs) {


                if (command.equals(song.getTypeList())) {

                    System.out.println(song.getName());
                }
            }


        }
    }

    }

