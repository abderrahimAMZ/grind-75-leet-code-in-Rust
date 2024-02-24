
import java.util.*;
import java.util.stream.Collectors;


class Result {


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {


        List<Integer> sorted_players = player.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        List<Integer> sorted_ranks = ranked.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        int numPlayers = sorted_players.size();
        int numRanks = sorted_ranks.size();


        HashMap<Integer,Integer> player_rank = new HashMap<>(numPlayers);

        int index_player = 0;
        int index_rank = 0;

        while (index_player < numPlayers) {

            int currentPlayer = sorted_players.get(index_player);
            int currentRank = sorted_ranks.get(index_rank);

            if (currentPlayer > currentRank) {
                player_rank.put(currentPlayer,index_rank+1);
                index_player++;
            }
            else if (currentPlayer == currentRank) {
                player_rank.put(currentPlayer,index_rank+1);
                index_player++;
                index_rank++;
            }
            else {
                index_rank++;

            }
            if (index_rank == numRanks) {
                for (int i = index_player ; i < numPlayers; i++) {
                    player_rank.put(sorted_players.get(i),index_rank+1);
                }
                index_player = numPlayers;

                }
            }
        List<Integer> result = new ArrayList<>();

        for (var play : player) {
            result.add(player_rank.get(play));
        }

        return result;
        }
}

