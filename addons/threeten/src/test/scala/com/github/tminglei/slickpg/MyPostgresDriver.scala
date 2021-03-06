package com.github.tminglei.slickpg

import slick.driver.PostgresDriver

object MyPostgresDriver extends PostgresDriver
                           with PgDateSupport2bp {

  override val Implicit = new Implicits with DateTimeImplicits
  override val simple = new Implicits with SimpleQL with DateTimeImplicits
}
