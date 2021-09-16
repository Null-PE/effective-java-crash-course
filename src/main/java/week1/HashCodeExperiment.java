package week1;

import java.util.HashMap;
import java.util.Map;

import week1.domain.value.CacheKey;

public class HashCodeExperiment {

	public static void main(String[] args) {

		//特定の条件に特定のユーザが合致するかの結果を保持するMap
		Map<CacheKey, Boolean> cacheResults = new HashMap<CacheKey, Boolean>();

		// 何かのロジックを実行し、条件1にuser1が合致したので結果にtrueを詰める
		long condId = 1;
		long userId = 1;
		CacheKey cacheKey = new CacheKey(condId, userId);
		cacheResults.put(cacheKey, Boolean.valueOf(true));

		// 別のロジックで対象のユーザの判定がどうだったかを確認する。
		Boolean result = cacheResults.getOrDefault(new CacheKey(1, 1), Boolean.valueOf(false));
		// TODO4 trueが出力されるように修正する。
		System.out.println(result);
	}

}
