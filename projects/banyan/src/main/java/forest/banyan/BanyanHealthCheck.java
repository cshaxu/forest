package forest.banyan;

import com.codahale.metrics.health.HealthCheck;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BanyanHealthCheck extends HealthCheck {

  private final String string;

  @Override
  protected Result check() {
    final String saying = String.format(string, "TEST");
    if (!saying.contains("TEST")) {
      return Result.unhealthy("String doesn't include a name");
    }
    return Result.healthy();
  }
}
