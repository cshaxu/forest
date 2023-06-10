package forest.banyan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.core.Configuration;
import lombok.Getter;

// import lombok.NonNull;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class BanyanConfiguration extends Configuration {}
