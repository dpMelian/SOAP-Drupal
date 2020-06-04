package localhost.drupal.rs;

import java.util.concurrent.ThreadLocalRandom;

public class RandomServiceImpl implements RandomService {

	@Override
	public int random(int i1, int i2) {
		return ThreadLocalRandom.current().nextInt(i1, i2 + 1);
	}

}
