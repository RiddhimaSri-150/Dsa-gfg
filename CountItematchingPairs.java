import java.util.List;

public class CountItematchingPairs {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
      int res = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) res++;
            if (ruleKey.equals("color") && item.get(0).equals(ruleValue)) res++;
            if (ruleKey.equals("name") && item.get(0).equals(ruleValue)) res++;
        }
        return res;
    }
}
