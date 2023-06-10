package forest.banyan.resources;

import static forest.banyan.utils.MessageUtils.getMessage;
import static forest.utilities.StringUtils.join;
import static forest.utilities.StringUtils.split;

import forest.list.LinkedList;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.apache.commons.text.WordUtils;

@Path("test")
public class TestResource {
  @GET
  @Path("ping")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public String ping(@QueryParam("pong") final String pong) {
    final LinkedList tokens = split(getMessage());
    final String result = join(tokens);
    return "pong-" + pong + ": " + WordUtils.capitalize(result);
  }
}
