package clouds

import java.io.File
import unfiltered.filter.Plan
import unfiltered.request._
import unfiltered.response._
import scala.util.Properties

object Clouds extends App {
  val port = Properties.envOrElse("PORT", "1337")

  unfiltered.jetty.Http(port).plan(APlan).resources(new File("src/main/webapp/").toURI.toURL).start()
}

object APlan extends Plan {
  def intent: Plan.Intent = {
    case Path("/aplan") => Ok ~> Html5(<html><body>foo2</body></html>)
  }
}