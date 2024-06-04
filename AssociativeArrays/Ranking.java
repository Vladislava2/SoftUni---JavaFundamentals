package AssociativeArrays;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> infoForContest = new LinkedHashMap<>();
        Map<String, LinkedHashMap<String, Integer>> userInfo = new TreeMap<>();

        String contestInfo = scanner.nextLine();
        while (!contestInfo.equals("end of contests")){
            String contest = contestInfo.split(":")[0];
            String password = contestInfo.split(":")[1];

            infoForContest.put(contest, password);

            contestInfo = scanner.nextLine();
        }

        String usernameInfo = scanner.nextLine();
        while (!usernameInfo.equals("end of submissions")){
            String contest = usernameInfo.split("=>")[0];
            String password = usernameInfo.split("=>")[1];
            String username = usernameInfo.split("=>")[2];
            int points = Integer.parseInt(usernameInfo.split("=>")[3]);

            if (infoForContest.containsKey(contest)){
                if (infoForContest.get(contest).equals(password)){
                    LinkedHashMap <String, Integer> courseGrade = new LinkedHashMap<>();
                    courseGrade.put(contest, points);
                    if (!userInfo.containsKey(username)){
                        userInfo.put(username, courseGrade);
                    } else {
                        if (!userInfo.get(username).containsKey(contest)){
                            userInfo.get(username).put(contest, points);
                        } else {
                            userInfo.get(username).put(contest, Math.max(points, userInfo.get(username).get(contest)));
                        }
                    }
                }
            }
            usernameInfo = scanner.nextLine();
        }

        int totalSum = 0;
        for (Map.Entry<String , LinkedHashMap<String, Integer>> user : userInfo.entrySet()){
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : userInfo.entrySet()){
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }

        System.out.println("Ranking: ");
        userInfo.entrySet().forEach(entry -> {
            System.out.printf("%s%n", entry.getKey());
            entry.getValue().entrySet().stream().sorted((f, s) -> s.getValue() - f.getValue())
                    .forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }
}
