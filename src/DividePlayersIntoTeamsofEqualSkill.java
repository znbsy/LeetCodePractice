import java.util.*;
public class DividePlayersIntoTeamsofEqualSkill {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int sum = skill[0] + skill[skill.length - 1];
        long chemistry = 0;

        for (int i = 0; i < (skill.length) / 2; i++) {
            if (skill[i] + skill[skill.length - 1 - i] != sum) {
                return -1;
            }
            chemistry += skill[i] * skill[skill.length - 1 - i];
        }

        return chemistry;
    }
}
