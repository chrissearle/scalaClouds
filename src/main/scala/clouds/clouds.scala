package clouds

import java.io.File
import unfiltered.filter.Plan
import unfiltered.request._
import unfiltered.response._

object Clouds extends App {
  unfiltered.jetty.Http(1337).plan(APlan).resources(new File("src/main/webapp/").toURI.toURL).start()
}

object APlan extends Plan {
  def intent: Plan.Intent = {
    case Path("/aplan") => Ok ~> Html5(<html><body>foo2</body></html>)
  }
}